package com.spring.project.carparking.slot.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;

import org.hibernate.engine.profile.Fetch;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import com.google.firebase.database.ValueEventListener;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.FieldValue;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.QueryDocumentSnapshot;
import com.google.cloud.firestore.QuerySnapshot;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.cloud.FirestoreClient;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.spring.project.carparking.slot.CarparkingSlot;

import springfox.documentation.spring.web.json.Json;;
@Service
public class FirebaseService {
	public String saveUserdata (CarparkingSlot carparkingslot) throws InterruptedException ,ExecutionException {
		Firestore dbFirestore =FirestoreClient.getFirestore();
			ApiFuture<WriteResult> collectionsApiFuture = dbFirestore.collection("Gmailuserlist").document(carparkingslot.getSlot_no()).set(carparkingslot);
			
			return  collectionsApiFuture.get().getUpdateTime().toString();
		}
/*public String saveuserdata1(String Email) {
		Firestore dbFirestore =FirestoreClient.getFirestore();
		 Map<String, Object> data0 = new HashMap<>();
	        data0.put("Email", Email);
	        dbFirestore.collection("Gmailuserlist").add(data0);
			return Email;
        
} */
/*	public CarparkingSlot getUserdata(String slot) throws InterruptedException, ExecutionException {
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
			 */


public List<Object> getUserdata() throws InterruptedException, ExecutionException{
	Firestore dbFirestore =FirestoreClient.getFirestore();

	 ApiFuture<QuerySnapshot> future = dbFirestore.collection("ParkingDB").whereGreaterThan("Slot_no", "").get();
     List<QueryDocumentSnapshot> documents = future.get().getDocuments();
		List<Object> carparkingSlot = new ArrayList<Object>();
		for (QueryDocumentSnapshot document : documents) {
			carparkingSlot.add(document);
			  System.out.println(document.getId() + " => " + document.toObject(CarparkingSlot.class));
			}
		  System.out.println(carparkingSlot);

return carparkingSlot;
}
	/*public CarparkingSlot getuserdata2() throws InterruptedException, ExecutionException {
		Firestore dbFirestore =FirestoreClient.getFirestore();
		String url = "https://firestore.googleapis.com/v1/projects/parkingproj-530bd/databases/(default)/ParkingDB";
		
		
        ApiFuture<QuerySnapshot> future = dbFirestore.collection("ParkingDB").whereGreaterThan("Slot_no", "").get();
        List<QueryDocumentSnapshot> documents = future.get().getDocuments();
       
        for(QueryDocumentSnapshot document : documents) { 
          
        	System.out.print(document.getString("Slot_no"));
        	System.out.print(document.getString("Email"));
        	System.out.println();
             }
        

        return null;

	}*/
			
	
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


