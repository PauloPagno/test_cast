package br.com.cast.avaliacao.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cast.avaliacao.model.vo.CursoVO;
import br.com.cast.avaliacao.services.CursoServices;

@RestController
@RequestMapping("/curso")
public class CursoController {

	@Autowired
	private CursoServices services;

	@GetMapping
	public List<CursoVO> findAll() {

		return services.findAll();

	}

	@GetMapping("/{id}")
	public CursoVO findBy(@PathVariable("id") Long id) {

		return services.findById(id);

	}

	@PostMapping
	public CursoVO create(@RequestBody CursoVO curso) {

		return services.create(curso);

	}

	@PutMapping
	public CursoVO update(@RequestBody CursoVO curso) {

		return services.update(curso);

	}

	@DeleteMapping("/{id}")
	public ResponseEntity<?> delete(@PathVariable("id") Long id) {

		services.delete(id);
		return ResponseEntity.ok().build();

	}

}
