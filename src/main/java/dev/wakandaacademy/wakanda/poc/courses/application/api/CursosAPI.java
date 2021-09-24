package dev.wakandaacademy.wakanda.poc.courses.application.api;



import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
public interface CursosAPI {
	
	@PostMapping("/v1/cursos")
	@ResponseStatus(value = HttpStatus.CREATED)
	public ResponseEntity<CursosDTO> criaCurso(@RequestBody @Validated CursosForm cursosForm, UriComponentsBuilder uriBuilder);
	
}
