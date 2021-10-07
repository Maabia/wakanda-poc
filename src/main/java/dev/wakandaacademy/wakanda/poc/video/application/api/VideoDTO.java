package dev.wakandaacademy.wakanda.poc.video.application.api;

import dev.wakandaacademy.wakanda.poc.video.domain.Video;
import lombok.Getter;

@Getter
public class VideoDTO {
	
	private Long id;
	private String titulo;
	private String url;
	
	public VideoDTO(Video video) {
		this.id = video.getId();
		this.titulo = video.getTitulo();
		this.url = video.getUrl();
	}
}
