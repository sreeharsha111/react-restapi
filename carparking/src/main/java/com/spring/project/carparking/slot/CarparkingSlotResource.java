package com.spring.project.carparking.slot;


import java.net.URI;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ExecutionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.spring.project.carparking.slot.CarparkingSlot;
import com.spring.project.carparking.slot.CarparkingSlotNotFoundException;
import com.spring.project.carparking.slot.service.FirebaseService;
import com.spring.project.carparking.user.User;

import io.swagger.annotations.ApiOperation;


@CrossOrigin(origins="*")
@RestController
public class CarparkingSlotResource {

	@Autowired
	FirebaseService firebaseService;
	private CarparkingSlotRepository carparkingslotRepository;
	

	
	@RequestMapping(path = "/something", method = RequestMethod.GET)

	@GetMapping("/slot/{slot}")
	@ApiOperation(value="finds specific slot ",
	notes="displays the specific values",
	response=CarparkingSlot.class)
	@ResponseBody
	public CarparkingSlot retrieveCarparkingSlot(@RequestHeader() String slot) throws InterruptedException, ExecutionException {
		return firebaseService.getUserdata(slot);
	}
	
	@RequestMapping(path =  "/something", method = RequestMethod.POST)

	@PostMapping("/slot")
	@ApiOperation(value="gives slot ",
	notes="gives the values",
	response=CarparkingSlot.class)
	@ResponseBody
	public String createcarparkingslot(@RequestBody CarparkingSlot carparkingslot) throws InterruptedException, ExecutionException {
	
		   
		

		return firebaseService.saveUserdata(carparkingslot);

	}
	
	@RequestMapping(path = "/something", method = RequestMethod.PUT)

	@PutMapping("/slot")
	@ApiOperation(value="modifies specific slot ",
	notes="modifies the specific values",
	response=CarparkingSlot.class)
	@ResponseBody
	public String updatecarparkingslot(@RequestBody CarparkingSlot carparkingslot) throws InterruptedException, ExecutionException {
		return firebaseService.updateUserdata(carparkingslot);

		
	}
	
	@RequestMapping(path = "/something", method = RequestMethod.DELETE)

	@DeleteMapping("/slot")
	@ApiOperation(value="deletes the users ",
	notes="deletes  the specific values",
	response=User.class)
	@ResponseBody
	public String deletecarparkingslot() throws InterruptedException, ExecutionException {
		return firebaseService.deleteUserdata();
	}
}

