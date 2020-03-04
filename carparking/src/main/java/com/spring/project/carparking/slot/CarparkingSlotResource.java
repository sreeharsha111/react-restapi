package com.spring.project.carparking.slot;



import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.google.cloud.firestore.QueryDocumentSnapshot;
import com.spring.project.carparking.slot.CarparkingSlot;
import com.spring.project.carparking.slot.CarparkingSlotNotFoundException;
import com.spring.project.carparking.slot.service.FirebaseService;

import io.swagger.annotations.ApiOperation;

@CrossOrigin(origins="*")
@RestController
public class CarparkingSlotResource {

	@Autowired
	FirebaseService firebaseService;
	private CarparkingSlotRepository carparkingslotRepository;
	
	

	
	@RequestMapping(path = "/slot", method = RequestMethod.GET)

	@GetMapping("/slot")
	@ApiOperation(value="finds specific slot ",
	notes="displays the specific values",
	response=CarparkingSlot.class)
	@ResponseBody
	public ModelAndView retrieveCarparkingSlot(ModelAndView modelAndView) throws InterruptedException, ExecutionException {
		
		ModelAndView map = new ModelAndView("sam");
		List<Object> l = firebaseService.getUserdata();
		map.addObject("userList",l);
		return map;
		
	}
	

	/*@RequestMapping(path = "/slot", method = RequestMethod.GET)

	@GetMapping("/slot")
	@ApiOperation(value="finds specific slot ",
	notes="displays the specific values",
	response=CarparkingSlot.class)
	@ResponseBody
	public List<Object> retrieveCarparkingSlot() throws InterruptedException, ExecutionException {
		List<Object> l=firebaseService.getUserdata();
		return l;
	}*/
/*		@RequestMapping(path =  "/slot", method = RequestMethod.POST)

	@PostMapping("/slot")
	@ApiOperation(value="gives slot ",
	notes="gives the values",
	response=CarparkingSlot.class)
	@ResponseBody
	public String createcarparkingslot(@RequestBody CarparkingSlot carparkingslot) throws InterruptedException, ExecutionException {
	
		   
		

		return firebaseService.saveUserdata(carparkingslot);

	}*/
	
	
	/*@RequestMapping(path =  "/slot", method = RequestMethod.POST)

	@PostMapping("/slot")
	@ApiOperation(value="gives slot ",
	notes="gives the values",
	response=CarparkingSlot.class)
	@ResponseBody
	public String createcarparkingslot1(@RequestBody String Email) throws InterruptedException, ExecutionException {
	
		   
		

		return firebaseService.saveuserdata1(Email);

	}
	*/	
	
	
	@RequestMapping(path = "/slot", method = RequestMethod.PUT)

	@PutMapping("/slot")
	@ApiOperation(value="modifies specific slot ",
	notes="modifies the specific values",
	response=CarparkingSlot.class)
	@ResponseBody
	public String updatecarparkingslot(@RequestBody CarparkingSlot carparkingslot) throws InterruptedException, ExecutionException {
		return firebaseService.updateUserdata(carparkingslot);

		
	}
	
	@RequestMapping(path = "/slot", method = RequestMethod.DELETE)
	@CrossOrigin("*")
	@DeleteMapping("/slot")
	@ApiOperation(value="deletes the users ",
	notes="deletes  the specific values",
	response=CarparkingSlot.class) 
	@ResponseBody
	public String deletecarparkingslot() throws InterruptedException, ExecutionException {
		return firebaseService.deleteUserdata();
	}
}

