package dev.wakandaacademy.wakanda.poc.courses.application.repository;

import java.util.Optional;

import org.springframework.stereotype.Repository;

import dev.wakandaacademy.wakanda.poc.courses.domain.Video;

@Repository
public interface VideoRepository {
	Optional<Video> buscaVideoPorId(String idVideo);
}
