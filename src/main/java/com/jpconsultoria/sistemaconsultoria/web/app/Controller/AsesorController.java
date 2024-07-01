package com.jpconsultoria.sistemaconsultoria.web.app.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;

import com.jpconsultoria.sistemaconsultoria.web.app.models.Asesor;
import com.jpconsultoria.sistemaconsultoria.web.app.service.AsesorServicio;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;



@Controller
@RequestMapping("/asesor")
public class AsesorController {

	@Autowired
	private AsesorServicio asesorServ;
	
	@GetMapping("/lista")	
	public String listar(Model model) {
		model.addAttribute("titulo", "Listado de Asesores");
		model.addAttribute("asesores", asesorServ.Listar());
		return "asesores/listar";
	}

	@GetMapping("/new")
	public String agregar(Model model) {
		model.addAttribute("asesores", new Asesor());
		model.addAttribute("titulo", "Crear nuevo Asesor");
		return "asesores/create";
	}
	
	@PostMapping("/save")
	public String save(@Validated Asesor a, Model model) {
		asesorServ.save(a);
		model.addAttribute("titulo", "Crear nuevo Asesor");
		return "redirect:/asesor/lista";
	}
	
	@GetMapping("/editar/{id}")
	public String editarString(@PathVariable Long id, Model model) {
		Optional<Asesor> asesor=asesorServ.listarId(id);
		model.addAttribute("titulo", "Actualizar datos de Asesor");
		model.addAttribute("asesores", asesor);
		return "asesores/edit";
	}
	
	@PostMapping("/update")
	public String update(@Validated Asesor a, Model model) {
		asesorServ.update(a);
		model.addAttribute("titulo", "Crear nuevo Asesor");
		return "redirect:/asesor/lista";
	}
	
	
	@GetMapping("/eliminar/{id}")
	public String delete(@PathVariable Long id, Model model) {
		asesorServ.delete(id);
		//model.addAttribute("titulo", "Crear nuevo Asesor");
		return "redirect:/asesor/lista";
	}
	
	
	
}
