package dev.wakandaacademy.wakanda.poc.video.application.repository;

import java.util.Optional;

import org.springframework.stereotype.Repository;

import dev.wakandaacademy.wakanda.poc.video.domain.Video;

@Repository
public interface VideoRepository {
	Optional<Video> buscaVideoPorId(String idVideo);
}
