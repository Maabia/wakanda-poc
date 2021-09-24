package dev.wakandaacademy.wakanda.poc.courses.domain;


import javax.persistence.Entity;

import lombok.Builder;
import lombok.Getter;

@Entity
@Builder
@Getter
public class Cursos {
	
	//VER COM VÍNI SE VAI PRECISAR DE ID
	
	private String titulo;
	
	private String url;
}
