package dev.wakandaacademy.wakanda.poc.video.application.api;




import org.springframework.http.HttpStatus;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/v1/video")
public interface VideoAPI {
	
	


	
	@GetMapping("/{idVideo}") 
	@ResponseStatus(value = HttpStatus.OK)
	VideoDTO buscaVideoPorId(@PathVariable Long idVideo); 
	
}
