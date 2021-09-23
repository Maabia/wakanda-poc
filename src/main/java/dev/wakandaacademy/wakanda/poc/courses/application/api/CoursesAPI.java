package dev.wakandaacademy.wakanda.poc.courses.application.api;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/public/v1/wakander")
public interface CoursesAPI {
	
	@PostMapping("/playlist-cursos")
	@ResponseStatus(code = HttpStatus.CREATED)
	//public ResponseEntity<T> criaCursosWakanda();
}
