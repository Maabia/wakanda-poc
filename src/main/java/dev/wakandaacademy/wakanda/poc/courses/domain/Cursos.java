package dev.wakandaacademy.wakanda.poc.courses.domain;


import java.util.UUID;

import javax.persistence.Entity;

import lombok.Builder;
import lombok.Getter;

@Entity
@Builder
@Getter
public class Cursos {
	
	
	private UUID id;
	private String titulo;
	private String url;
}
