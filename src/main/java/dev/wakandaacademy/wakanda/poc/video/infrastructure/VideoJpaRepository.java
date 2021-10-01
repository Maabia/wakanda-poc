package dev.wakandaacademy.wakanda.poc.video.infrastructure;

import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Component;

import dev.wakandaacademy.wakanda.poc.video.application.repository.VideoRepository;
import dev.wakandaacademy.wakanda.poc.video.domain.Video;
import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class VideoJpaRepository implements VideoRepository {
	private final VideoSpringDataJpaRepository videoSpringDataJpaRepository;
	
	@Override
	public Optional<Video> buscaVideoPorId(String idVideo) {
		return videoSpringDataJpaRepository.findById(UUID.fromString(idVideo));
		
	}

}
