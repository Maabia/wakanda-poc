package dev.wakandaacademy.wakanda.poc.courses.application.api;

import lombok.Getter;

@Getter
public class CursosDTO {
	
	private String titulo;
	
	private String url;
	
	public CursosDTO(Cursos cursos) {
		this.titulo = cursos.getTitulo();
		this.url = cursos.getUrl();
	}
}
