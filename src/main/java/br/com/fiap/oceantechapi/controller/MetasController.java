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

import br.com.fiap.oceantechapi.model.Metas;
import br.com.fiap.oceantechapi.repository.MetasRepository;

@RestController
@RequestMapping("/metas")
public class MetasController {

	@Autowired
	private MetasRepository metasRepository;

	@GetMapping
	public List<Metas> allMetas() {
		return metasRepository.findAll();
	}

	@PostMapping()
	@ResponseStatus(code = HttpStatus.CREATED)
	public Metas addUser(@RequestBody Metas meta) {
		return metasRepository.save(meta);
	}

}
