package dev.wakandaacademy.wakanda.poc.courses.application.repository;

import java.util.Optional;

import dev.wakandaacademy.wakanda.poc.courses.domain.Video;

public interface VideoRepository {
	Optional<Video> buscaVideoPorId(String idVideo);
}
