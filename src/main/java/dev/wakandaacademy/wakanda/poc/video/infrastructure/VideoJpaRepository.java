package dev.wakandaacademy.wakanda.poc.video.infrastructure;

import java.util.Optional;

import org.springframework.stereotype.Component;

import dev.wakandaacademy.wakanda.poc.video.application.repository.VideoRepository;
import dev.wakandaacademy.wakanda.poc.video.domain.Video;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Component
@AllArgsConstructor
@Log4j2
public class VideoJpaRepository implements VideoRepository {
	private VideoSpringDataJpaRepository videoSpringDataJpaRepository;
	
	@Override
	public Optional<Video> buscaVideoPorId(String idVideo) {
		log.info("[Inicia] VideoJpaRepository - buscaVideoPorId");
		Optional<Video> buscaVideoPorId = videoSpringDataJpaRepository.findById(idVideo);
		log.info("[Finaliza] VideoVideoJpaRepository - buscaVideoPorId");
		return buscaVideoPorId;
		
	}

}
