package com.spring.project.carparking.slot.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;

import org.aspectj.weaver.patterns.ConcreteCflowPointcut.Slot;
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
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.spring.project.carparking.slot.CarparkingSlot;;
@Service 
public class FirebaseService {
	public String saveUserdata (CarparkingSlot carparkingslot) throws InterruptedException ,ExecutionException {
		Firestore dbFirestore =FirestoreClient.getFirestore();
			ApiFuture<WriteResult> collectionsApiFuture = dbFirestore.collection("slot").document(carparkingslot.getSlot()).set(carparkingslot);
			
			return  collectionsApiFuture.get().getUpdateTime().toString();
		}
	public CarparkingSlot getUserdata(String slot) throws InterruptedException, ExecutionException {
		Firestore dbFirestore =FirestoreClient.getFirestore();
		DocumentReference documentReference = dbFirestore.collection("slot").document(slot);
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
		ApiFuture<WriteResult> collectionsApiFuture = dbFirestore.collection("slot").document(carparkingslot.getSlot()).set(carparkingslot);
		return  collectionsApiFuture.get().getUpdateTime().toString();
		
	}
	public String deleteUserdata()  {
		/*Firestore dbFirestore =FirestoreClient.getFirestore();
		dbFirestore.collection("slot").document(slot).delete();
		return "document with id has been deleted";
	}*/
		Firestore dbFirestore =FirestoreClient.getFirestore();
         ApiFuture<QuerySnapshot> query = dbFirestore.collection("slot").get();
         QuerySnapshot querysnapshot;
		try {
			querysnapshot = query.get();
	         List<QueryDocumentSnapshot> documents = querysnapshot.getDocuments();
	         for(QueryDocumentSnapshot document : documents) {
	        String v = (String) document.getString("slot");
	        if(v != null) {
	        if(v.substring(0,2).equalsIgnoreCase("P1") ) {
	        	 Map<String, Object> data0 = new HashMap<>();
	 	        data0.put("slot", v);
	 	        dbFirestore.collection("slots_ tot").document("Phase-1").collection("totslot").add(data0);
	        }
	        else {
	        Map<String, Object> data = new HashMap<>();
	        data.put("slot", v);
 	        dbFirestore.collection("slots_ tot").document("Phase-3").collection("totslot").add(data);
	        }
	        	        
	        Map<String, Object> data1 = new HashMap<>();
 	        data1.put("slot", FieldValue.delete());
	        dbFirestore.collection("slot").document(document.getId()).update(data1);
	        }
	         }

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
         
         
		return "document with id has been deleted";

		
	}
	}


