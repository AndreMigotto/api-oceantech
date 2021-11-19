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

import br.com.fiap.oceantechapi.model.Objetivos;
import br.com.fiap.oceantechapi.repository.ObjetivosRepository;

@RestController
@RequestMapping("/objetivos")
public class ObjetivosController {

	@Autowired
	private ObjetivosRepository objetivosRepository;

	@GetMapping
	public List<Objetivos> allObjetivos() {
		return objetivosRepository.findAll();
	}

	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public Objetivos addObjetivos(@RequestBody Objetivos objetivo) {
		System.out.println(objetivo);
		return objetivosRepository.save(objetivo);
	}
}
