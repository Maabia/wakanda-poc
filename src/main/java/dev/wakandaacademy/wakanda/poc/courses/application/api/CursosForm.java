package dev.wakandaacademy.wakanda.poc.courses.application.api;



import com.sun.istack.NotNull;

import dev.wakandaacademy.wakanda.poc.courses.domain.Cursos;

public class CursosForm {
	
	@NotNull
	private String titulo;
	
	@NotNull
	private String url;
	
	public Cursos toCursos() {
		return Cursos.builder()
				.titulo(titulo)
				.url(url)
				.build();
	}
}
