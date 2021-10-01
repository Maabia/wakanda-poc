package dev.wakandaacademy.wakanda.poc.video.application.service;

import org.springframework.stereotype.Service;

import dev.wakandaacademy.wakanda.poc.video.domain.Video;

@Service
public interface VideoService {
	
	Video buscaVideoPorId(String idVideo);
}
