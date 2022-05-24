package com.algaworks.algalog.api.assembler;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.algaworks.algalog.api.model.EntregaDto;
import com.algaworks.algalog.api.model.input.EntregaInputDto;
import com.algaworks.algalog.domain.model.Entrega;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Component
public class EntregaAssembler {

	private ModelMapper modelMapper;
	
	public EntregaDto toModel(Entrega entrega) {
		return modelMapper.map(entrega, EntregaDto.class);
	}
	
	public List<EntregaDto> toCollectionModel(List<Entrega> entregas) {
		return entregas.stream()
				.map(this::toModel)
				.collect(Collectors.toList());
	}
	
	public Entrega toEntity(EntregaInputDto entregaInputDto) {
		return modelMapper.map(entregaInputDto, Entrega.class);
	}
}
