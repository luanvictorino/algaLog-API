package com.algaworks.algalog.api.model.input;

import java.math.BigDecimal;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EntregaInputDto {
	
	@Valid
	@NotNull
	private ClienteIdInputDto cliente;
	
	@Valid
	@NotNull
	private DestinatarioInputDto destinatario;
	
	@NotNull
	private BigDecimal taxa;
	
}
