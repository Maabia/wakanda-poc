package dev.wakandaacademy.wakanda.poc.courses.application.service;

import dev.wakandaacademy.wakanda.poc.courses.domain.Video;

public interface VideoService {
	
	Video buscaVideoPorId(String idVideo);
}
