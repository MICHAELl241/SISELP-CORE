package edu.elp.SISELP.service.impl;


import edu.elp.SISELP.Entity.Usuario;
import edu.elp.SISELP.dao.IUsuarioDao;
import edu.elp.SISELP.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUsuarioDao usuarioDao;

    public Usuario getPersonaByUsuario(String username) {
        return this.usuarioDao.findPersonaByUsername(username);
    }
}
