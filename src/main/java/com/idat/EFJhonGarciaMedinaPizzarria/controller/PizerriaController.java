package com.idat.EFJhonGarciaMedinaPizzarria.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.idat.EFJhonGarciaMedinaPizzarria.dto.PizerriaDTORequest;
import com.idat.EFJhonGarciaMedinaPizzarria.dto.PizerriaDTOResponse;
import com.idat.EFJhonGarciaMedinaPizzarria.service.PizerriaService;

@Controller
@RequestMapping("/api/v1/pizerria")
public class PizerriaController {
	
	@Autowired
	private PizerriaService pizerriaService;
	
	
	@GetMapping("/listarClientes")
	public @ResponseBody List<PizerriaDTOResponse> listarPizerria(){
		return pizerriaService.listarPizerria();
	}
	@GetMapping("/listar/{id}")
	public @ResponseBody PizerriaDTOResponse obtenerClienteId(@PathVariable Integer id) {
		return pizerriaService.obtenerPizerria(id);
		
	}
	@PostMapping("/guardarPizerria")
	public void guardarClientes(@RequestBody PizerriaDTORequest pizerria) {
		pizerriaService.registrarPizerria(pizerria);
	}
	
	@PutMapping("/editarPizerria")
	public void actualizarAlumno(@RequestBody PizerriaDTORequest pizerria) {
		
		pizerriaService.obtenerPizerria(pizerria.getIdPizerriaDTO());
		pizerriaService.editarPizerria(pizerria);
		
	}
	@DeleteMapping("/eliminar/id")
	public void eliminarClientes(@PathVariable("id") Integer id) {
		pizerriaService.eliminarPizerria(id);

}
}
