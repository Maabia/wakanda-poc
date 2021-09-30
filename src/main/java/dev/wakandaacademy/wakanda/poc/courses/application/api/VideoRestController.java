package dev.wakandaacademy.wakanda.poc.courses.application.api;

import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@RestController
@AllArgsConstructor
public class VideoRestController implements VideoAPI {
	
	
	@Override
	public VideoDTO buscaVideoPorId(String idVideo) {
		log.info("[Iniciando] Método buscaVideoPorId em Video Controller");
		Video video = videoService.buscaPorId(idVideo);
		log.info("[Finalizando] Metodo buscaVideoPorId em Video Controller");
		return new VideoDTO(video);
	}
	
	
}
