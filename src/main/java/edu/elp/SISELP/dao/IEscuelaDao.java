package edu.elp.SISELP.dao;

import edu.elp.SISELP.Entity.Escuela;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEscuelaDao extends JpaRepository<Escuela,Long> {
}
