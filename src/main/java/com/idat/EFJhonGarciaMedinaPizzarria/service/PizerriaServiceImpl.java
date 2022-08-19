package com.idat.EFJhonGarciaMedinaPizzarria.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.EFJhonGarciaMedinaPizzarria.dto.PizerriaDTORequest;
import com.idat.EFJhonGarciaMedinaPizzarria.dto.PizerriaDTOResponse;
import com.idat.EFJhonGarciaMedinaPizzarria.model.Pizerria;
import com.idat.EFJhonGarciaMedinaPizzarria.repository.PizerriaRepository;

@Service
public class PizerriaServiceImpl implements PizerriaService {
	
	@Autowired
	public 	PizerriaRepository pizerriaRepository;

	@Override
	public List<PizerriaDTOResponse> listarPizerria() {
		List<PizerriaDTOResponse> lista = new ArrayList<PizerriaDTOResponse>();
		PizerriaDTOResponse p= null;
		for(Pizerria pizerria : pizerriaRepository.findAll()) {
			p= new PizerriaDTOResponse();
			lista.add(p);
		}
		return lista;
	}

	@Override
	public void registrarPizerria(PizerriaDTORequest pizerria) {
		Pizerria p = new Pizerria();
		
		
	}

	@Override
	public void editarPizerria(PizerriaDTORequest pizerria) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminarPizerria(Integer id) {
		pizerriaRepository.deleteById(id);
		
	}

	@Override
	public PizerriaDTOResponse obtenerPizerria(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
