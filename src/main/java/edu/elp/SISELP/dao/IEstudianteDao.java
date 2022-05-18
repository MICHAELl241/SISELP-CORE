package edu.elp.SISELP.dao;

import edu.elp.SISELP.Entity.Escuela;
import edu.elp.SISELP.Entity.Estudiante;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IEstudianteDao extends JpaRepository<Estudiante,Long> {
    @Query("SELECT p FROM Estudiante p WHERE p.codigo= ?1")
    Estudiante buscarEstudiante(String codigo);

    //lista de estudiante por escuelas

    List<Estudiante> findByEscuela (Escuela idescuela);

    // lista estudiante por esucla y por pagina
    @Query("SELECT e FROM Estudiante e WHERE e.escuela = :idescuela ")
    Page<Estudiante> listEstudianteByPagina(Pageable pageable, @Param("idescuela") Escuela idescuela);
    
    
    //obtener estudiante por codigo o dni
    @Query("SELECT e FROM Estudiante e WHERE e.codigo = :coddni OR e.dni = :coddni")
    Estudiante obtenerPorCodigoOrDni(@Param("coddni") String coddni);


}
