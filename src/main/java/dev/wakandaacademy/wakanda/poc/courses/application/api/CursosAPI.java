package dev.wakandaacademy.wakanda.poc.courses.application.api;




import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface CursosAPI {
	
	@GetMapping("/v1/cursos") // VERIFICAR COM VINI SE VAI USAR O PATH DA TRIBO
	@ResponseStatus(value = HttpStatus.OK)
	CursosDTO buscarCursosPorId(@PathVariable String idCursos);
	
}
