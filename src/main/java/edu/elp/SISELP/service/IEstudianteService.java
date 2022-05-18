package edu.elp.SISELP.service;

import edu.elp.SISELP.Entity.Escuela;
import edu.elp.SISELP.Entity.Estudiante;
import edu.elp.SISELP.Entity.Persona;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IEstudianteService {

       // listar estudiante

    List<Estudiante> listaEstudiante();


    // buscar persoanj por su codigo
    Persona obtenerEstudianteByCodigo(String codigo);


    //devuelve una lista de estudiantes por escuela
    List<Estudiante> listaEstudiantesByEscuela(Escuela idEscuela);

    ///devuelve una lista de estudiantes por escuela y de manera paginada
    Page<Estudiante> listaEstudiantesPorPagina(Pageable pageable, Escuela idescuela);

    //registra un estudiante en al base de dtaos
    Estudiante guardarEstudiante(Estudiante estudiante);
    
    //obtenr un estudiante por coidgo o por dni
    Estudiante obtenerPorCodigoOrDni(String coddni);
    
    //elimina un registro de un estudiante
    void eliminarEstudiante(Long id);

   // actualiza un registro de estudiante
    void actualizarEstudiante(Estudiante idestudiante);



}
