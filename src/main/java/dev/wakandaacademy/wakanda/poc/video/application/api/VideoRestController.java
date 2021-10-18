package dev.wakandaacademy.wakanda.poc.video.application.api;

import org.springframework.web.bind.annotation.RestController;

import dev.wakandaacademy.wakanda.poc.video.application.service.VideoService;
import dev.wakandaacademy.wakanda.poc.video.domain.Video;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@RestController
@AllArgsConstructor
public class VideoRestController implements VideoAPI {
	private VideoService videoService;
	
	@Override
	public VideoDTO buscaVideoPorId(Long idVideo) {
		log.info("[Iniciando] Método buscaVideoPorId em Video Controller");
		Video video = videoService.buscaVideoPorId(idVideo);
		log.info("[Finalizando] Metodo buscaVideoPorId em Video Controller");
		return new VideoDTO(video);
	}
	
	
	
	
}
