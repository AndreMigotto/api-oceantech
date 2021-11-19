package br.com.fiap.oceantechapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.oceantechapi.model.User;
import br.com.fiap.oceantechapi.repository.UserRepository;

@RestController
@RequestMapping("/users")
public class UserController {
	private final UserRepository userRepository;

	@Autowired
	public UserController(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@GetMapping()
	public List<User> getUsers() {
		return userRepository.findAll();
	}

	@PostMapping()
	@ResponseStatus(code = HttpStatus.CREATED)
	public User addUser(@RequestBody User user) {
		return userRepository.save(user);
	}
}
