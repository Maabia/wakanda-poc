package dev.wakandaacademy.wakanda.poc.courses.application.api;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
// SERIA NECESSÁRIO POR REQUESTMAPPING AQUI?
public interface VideoAPI {
	
	@GetMapping("/v1/video/{idVideo}") 
	@ResponseStatus(value = HttpStatus.OK)
	VideoDTO buscaVideoPorId(@PathVariable String idVideo); 
	
}
