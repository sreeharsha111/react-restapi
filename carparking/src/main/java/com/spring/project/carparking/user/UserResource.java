package com.spring.project.carparking.user;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@CrossOrigin
@RestController
@RequestMapping(path = "/")
@Api(value="carparking",produces = MediaType.APPLICATION_JSON_VALUE)
public class UserResource {

	@Autowired
	private UserRepository userRepository;

	@GetMapping("/api/users")
	@ApiOperation(value="finds users ",
	notes="displays the values",
	response=User.class)
	public List<User> retrieveAllUsers() {
		return userRepository.findAll();
	}

	@GetMapping("/api/users/{username}")
	@ApiOperation(value="finds usersy by username",
	notes="displays the values of specific username",
	response=User.class)
	public User retrieveUser(@PathVariable String username) {
		Optional<User> user = userRepository.findById(username);

		if (!user.isPresent())
			throw new UserNotFoundException("username-" + username);

		return user.get();
	}
	@DeleteMapping("/api/users/{username}")
	@ApiOperation(value="deletes the users ",
	notes="deletes  the specific values",
	response=User.class)
	public void deleteUser(@PathVariable String username) {
		userRepository.deleteById(username);
	}

	@PostMapping("/api/users")
	@ApiOperation(value="gives users ",
	notes="inputs the values",
	response=User.class)
	public ResponseEntity<Object> createUser(@RequestBody User user) {
		User savedUser = userRepository.save(user);

		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{username}")
				.buildAndExpand(savedUser.getUsername()).toUri();

		return ResponseEntity.created(location).build();

	}
	
	@PutMapping("/api/users/{username}")
	@ApiOperation(value="modifies users ",
	notes="modifies the specific values",
	response=User.class)
	public ResponseEntity<Object> updateUser(@RequestBody User user, @PathVariable String username) {

		Optional<User> userOptional = userRepository.findById(username);

		if (!userOptional.isPresent())
			return ResponseEntity.notFound().build();

		user.setUsername(username);
		
		userRepository.save(user);

		return ResponseEntity.noContent().build();
	}
}