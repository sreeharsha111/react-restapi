package com.spring.project.carparking.slot.service;

import java.util.concurrent.ExecutionException;

import org.springframework.stereotype.Service;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.cloud.FirestoreClient;
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
	public String deleteUserdata(String slot)  {
		Firestore dbFirestore =FirestoreClient.getFirestore();
		dbFirestore.collection("slot").document(slot).delete();
		return "document with id has been deleted";

		
	}
	}


