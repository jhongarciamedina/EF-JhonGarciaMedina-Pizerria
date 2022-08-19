package com.idat.EFJhonGarciaMedinaPizzarria.service;

import java.util.List;

import com.idat.EFJhonGarciaMedinaPizzarria.dto.PizerriaDTORequest;
import com.idat.EFJhonGarciaMedinaPizzarria.dto.PizerriaDTOResponse;

public interface PizerriaService {
	
	public List<PizerriaDTOResponse> listarPizerria();
	
	public void registrarPizerria(PizerriaDTORequest pizerria);
	
	public void editarPizerria(PizerriaDTORequest pizerria);
	
	public void eliminarPizerria(Integer id);
	
	public PizerriaDTOResponse obtenerPizerria(Integer id);


}
