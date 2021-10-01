package dev.wakandaacademy.wakanda.poc.video.application.service;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import dev.wakandaacademy.wakanda.handler.ApiException;
import dev.wakandaacademy.wakanda.poc.video.application.repository.VideoRepository;
import dev.wakandaacademy.wakanda.poc.video.domain.Video;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@AllArgsConstructor
@Log4j2
public class VideoDataJpaService implements VideoService {
	private VideoRepository videoRepository;
	
	@Override
	public Video buscaVideoPorId(String idVideo) {
		log.info("Iniciando método buscaVideoPorId em VideoDataJpaService");
		Video videoPorId = videoRepository.buscaVideoPorId(idVideo)
				.orElseThrow(() ->  ApiException.throwApiException(HttpStatus.NOT_FOUND, "Video não encontrado!"));
		log.info("Finalizando método buscaVideoPorId em VideoDataJpaService");
		return videoPorId;
	}
	
}
