package dev.wakandaacademy.wakanda.poc.courses.application.api;

import java.util.UUID;

import dev.wakandaacademy.wakanda.poc.courses.domain.Video;
import lombok.Getter;

@Getter
public class VideoDTO {
	
	private UUID id;
	private String titulo;
	private String descricao;
	private String url;
	
	public VideoDTO(Video video) {
		this.id = video.getId();
		this.titulo = video.getTitulo();
		this.descricao = video.getDescricao();
		this.url = video.getUrl();
	}
}
