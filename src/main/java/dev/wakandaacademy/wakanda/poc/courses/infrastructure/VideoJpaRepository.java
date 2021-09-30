package dev.wakandaacademy.wakanda.poc.courses.infrastructure;

import java.util.UUID;

import dev.wakandaacademy.wakanda.poc.courses.application.repository.VideoRepository;

public class VideoJpaRepository implements VideoRepository {
	// ADD
	
	@Override
	public void buscaVideoPorId(String idVideo) {
		return videoSpringDataJpaRepository.findById(UUID.fromString(idVideo))
		
	}

}
