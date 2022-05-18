package edu.elp.SISELP.service;


import edu.elp.SISELP.Entity.Usuario;


public interface IUserService {

    Usuario getPersonaByUsuario(String username);
}
