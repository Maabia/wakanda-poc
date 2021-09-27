package dev.wakandaacademy.wakanda.poc.courses.domain;


import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Builder;
import lombok.Getter;

@Entity
@Builder
@Getter
public class Cursos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private UUID id;
	
	private String titulo;
	private String url;
}
