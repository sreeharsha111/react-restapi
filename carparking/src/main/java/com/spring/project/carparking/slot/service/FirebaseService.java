package com.spring.project.carparking.slot.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;

import org.springframework.stereotype.Service;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.FieldValue;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.QueryDocumentSnapshot;
import com.google.cloud.firestore.QuerySnapshot;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.cloud.FirestoreClient;

import com.spring.project.carparking.slot.CarparkingSlot;;
@Service 
public class FirebaseService {
	public String saveUserdata (CarparkingSlot carparkingslot) throws InterruptedException ,ExecutionException {
		Firestore dbFirestore =FirestoreClient.getFirestore();
			ApiFuture<WriteResult> collectionsApiFuture = dbFirestore.collection("ParkingDB").document(carparkingslot.getSlot_no()).set(carparkingslot);
			
			return  collectionsApiFuture.get().getUpdateTime().toString();
		}
	public CarparkingSlot getUserdata(String slot) throws InterruptedException, ExecutionException {
		Firestore dbFirestore =FirestoreClient.getFirestore();
		DocumentReference documentReference = dbFirestore.collection("ParkingDB").document(slot);
		ApiFuture<DocumentSnapshot> future = documentReference.get();
		DocumentSnapshot document = future.get();
		CarparkingSlot carparkingSlot = null;
		if(document.exists()) {
			carparkingSlot =document.toObject(CarparkingSlot.class);
			return carparkingSlot;
		} 
		else {
			return null;
		}
		}
			 
			
	
	public String updateUserdata(CarparkingSlot carparkingslot) throws InterruptedException ,ExecutionException {
		Firestore dbFirestore =FirestoreClient.getFirestore();
		ApiFuture<WriteResult> collectionsApiFuture = dbFirestore.collection("ParkingDB").document(carparkingslot.getSlot_no()).set(carparkingslot);
		return  collectionsApiFuture.get().getUpdateTime().toString();
		
	}
	public String deleteUserdata()  {
		/*Firestore dbFirestore =FirestoreClient.getFirestore();
		dbFirestore.collection("slot").document(slot).delete();
		return "document with id has been deleted";
	}*/
		Firestore dbFirestore =FirestoreClient.getFirestore();
         ApiFuture<QuerySnapshot> query = dbFirestore.collection("ParkingDB").get();
         QuerySnapshot querysnapshot;
		try {
			querysnapshot = query.get();
	         List<QueryDocumentSnapshot> documents = querysnapshot.getDocuments();
	         for(QueryDocumentSnapshot document : documents) {
	        String v = (String) document.getString("Slot_no");
	        if(v != null) {
	        if(v.substring(0,2).equalsIgnoreCase("P1") ) {
	        	 Map<String, Object> data0 = new HashMap<>();
	 	        data0.put("Slot_no", v);
	 	        dbFirestore.collection("Slots").document("Phase-1").collection("totslots").add(data0);
	        }
	        else {
	        Map<String, Object> data = new HashMap<>();
	        data.put("Slot_no", v);
 	        dbFirestore.collection("Slots").document("Phase-3").collection("totslots").add(data);
	        }
	        	        
	        Map<String, Object> data1 = new HashMap<>();
 	        data1.put("Slot_no", FieldValue.delete());
	        dbFirestore.collection("ParkingDB").document(document.getId()).update(data1);
	        }
	         }

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
         
         
		return "Documents have been deleted";

		
	}
	}


