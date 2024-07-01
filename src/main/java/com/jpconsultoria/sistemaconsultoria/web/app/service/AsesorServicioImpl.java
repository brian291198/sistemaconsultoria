package com.jpconsultoria.sistemaconsultoria.web.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jpconsultoria.sistemaconsultoria.web.app.models.Asesor;
import com.jpconsultoria.sistemaconsultoria.web.app.repositorios.AsesorRepositorio;



@Service
public class AsesorServicioImpl implements AsesorServicio {

	@Autowired
	private AsesorRepositorio dataAsesor;
	
	@Transactional(readOnly=true)
	@Override
	public List<Asesor> Listar() {
		return  dataAsesor.findAll();
	}
	
	@Override
	public Optional<Asesor> listarId(Long id) {
		return dataAsesor.findById(id);
	} 

	@Override
	public int save(Asesor a) {
		int res=0;
		Asesor asesor=dataAsesor.save(a);
		if(!asesor.equals(null)) {
			res=1;
		}
		return res;
	}

	@Override
	public int update(Asesor a) {
		int res = 0;
	    Optional<Asesor> optionalAsesor = dataAsesor.findById(a.getId());
	    
	    if (optionalAsesor.isPresent()) {

	        Asesor existingAsesor = optionalAsesor.get();

	        dataAsesor.save(existingAsesor);  
	        res = 1;
	    } else {
	       
	        res = 0;
	    }
	    
	    return res;
	}

	
	@Override
	public void delete(Long id) {
		dataAsesor.deleteById(id);
		
	}

	

	

}
