package dev.wakandaacademy.wakanda.poc.courses.application.api;



import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
public interface CursosAPI {
	
	@GetMapping("/v1/cursos") // VERIFICAR COM VINI SE VAI USAR O PATH DA TRIBO
	@ResponseStatus(value = HttpStatus.OK)
	public ResponseEntity<CursosDTO> criaCurso(@RequestBody @Validated CursosForm cursosForm, UriComponentsBuilder uriBuilder);
	
}
