package dev.wakandaacademy.wakanda.poc.courses.application.api;

import java.util.UUID;

import dev.wakandaacademy.wakanda.poc.courses.domain.Cursos;
import lombok.Getter;

@Getter
public class VideoDTO {
	
	private UUID id;
	private String titulo;
	private String descricao;
	private String url;
	
	public VideoDTO(Cursos cursos) {
		this.id = cursos.getId();
		this.titulo = cursos.getTitulo();
		this.descricao = cursos.getDescricao();
		this.url = cursos.getUrl();
	}
}
