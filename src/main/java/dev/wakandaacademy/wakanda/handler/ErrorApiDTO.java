package dev.wakandaacademy.wakanda.handler;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;

@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class ErrorApiDTO {
	private String message;

	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String description;

	@JsonInclude(JsonInclude.Include.NON_NULL)
	private List<ValidationDTO> validationsError;
}
