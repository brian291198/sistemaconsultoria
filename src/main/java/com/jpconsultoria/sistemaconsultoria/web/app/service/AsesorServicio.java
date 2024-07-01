package com.jpconsultoria.sistemaconsultoria.web.app.service;

import java.util.List;
import java.util.Optional;

import com.jpconsultoria.sistemaconsultoria.web.app.models.Asesor;


public interface AsesorServicio {

	public List<Asesor> Listar();
	public Optional<Asesor> listarId(Long id);
	public int save(Asesor a);
	public int update(Asesor a);
	public void delete(Long id);
}
