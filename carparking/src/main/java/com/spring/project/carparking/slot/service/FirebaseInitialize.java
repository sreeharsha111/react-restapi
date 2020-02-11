package com.spring.project.carparking.slot.service;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;

@Service
@CrossOrigin(origins="*")

public class FirebaseInitialize {
     @PostConstruct
	public void initialize()  {
    	 try {
		FileInputStream serviceAccount =
				new FileInputStream("./serviceAccount.json");
		
		FirebaseOptions options=new FirebaseOptions.Builder()
				.setCredentials(GoogleCredentials.fromStream(serviceAccount))
				.setDatabaseUrl("https://dashboard-dddd0.firebaseio.com")
				.build();
		FirebaseApp.initializeApp(options);
		
	} catch(Exception e) {
		e.printStackTrace();
	}
     }
}
