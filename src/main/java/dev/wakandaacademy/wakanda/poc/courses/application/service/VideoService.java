package dev.wakandaacademy.wakanda.poc.courses.application.service;

import org.springframework.stereotype.Service;

import dev.wakandaacademy.wakanda.poc.courses.domain.Video;

@Service
public interface VideoService {
	
	Video buscaVideoPorId(String idVideo);
}
