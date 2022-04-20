package edu.elp.SISELP.dao;

import edu.elp.SISELP.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPersonaDao  extends JpaRepository<Persona,Long> {

}
