package com.jpconsultoria.sistemaconsultoria.web.app.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jpconsultoria.sistemaconsultoria.web.app.models.Asesor;

@Repository
public interface AsesorRepositorio extends JpaRepository<Asesor, Long> {

}
