package edu.elp.SISELP.service.impl;

import edu.elp.SISELP.Entity.Escuela;
import edu.elp.SISELP.Entity.Estudiante;
import edu.elp.SISELP.dao.IEstudianteDao;
import edu.elp.SISELP.service.IEstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EstudianteServiceImpl implements IEstudianteService {

    @Autowired
    private IEstudianteDao estudianteDao;

    @Override
    public List<Estudiante> listaEstudiante() {

        List<Estudiante> estudianteList = this.estudianteDao.findAll();

        for (Estudiante estudiante:estudianteList){
            System.out.println(estudiante.toString());
        }
        return estudianteList;
    }
    @Override
    public Estudiante obtenerEstudianteByCodigo(String codigo) {return this.estudianteDao.buscarEstudiante(codigo);}

    @Override
    public List<Estudiante> listaEstudiantesByEscuela(Escuela idEscuela) {
        return this.estudianteDao.findByEscuela(idEscuela);
    }

    @Override
    public Page<Estudiante> listaEstudiantesPorPagina(Pageable pageable, Escuela idescuela) {
        return this.estudianteDao.listEstudianteByPagina(pageable,idescuela);
    }

    @Override
    public Estudiante guardarEstudiante(Estudiante estudiante) {
        return this.estudianteDao.save(estudiante);
    }

    @Override
    public Estudiante obtenerPorCodigoOrDni(String coddni) {
        return this.estudianteDao.obtenerPorCodigoOrDni(coddni);
    }
    @Override
    public void eliminarEstudiante(Long id) {
        this.estudianteDao.deleteById(id);
    }

    @Override
    public void actualizarEstudiante(Estudiante estudiante) {
        this.estudianteDao.save(estudiante);
    }


}
