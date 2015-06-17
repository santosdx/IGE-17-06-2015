package co.gov.dane.ige.vista.usuario;

import co.gov.dane.ige.modelo.entidad.IgeUsuario;
import co.gov.dane.ige.modelo.local.IgeUsuarioFacadeLocal;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;

/**
 * Sessión Beans que administra los datos de la entidad IGE_USUARIO
 * @author SRojasM
 */
@ManagedBean(name = "MbUsuario")
@ViewScoped
public class Usuario {

    @EJB
    private IgeUsuarioFacadeLocal eJBServicioIgeUsuario;

    private List<IgeUsuario> usuarios;

    public Usuario(){}
    
    @PostConstruct
    public void init(){
        setUsuarios(geteJBServicioIgeUsuario().findAll());
    }

    //Lista de métodos Set y Get de los atributos de la clase.

    public IgeUsuarioFacadeLocal geteJBServicioIgeUsuario() {
        return eJBServicioIgeUsuario;
    }

    public void seteJBServicioIgeUsuario(IgeUsuarioFacadeLocal eJBServicioIgeUsuario) {
        this.eJBServicioIgeUsuario = eJBServicioIgeUsuario;
    }

    public List<IgeUsuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<IgeUsuario> usuarios) {
        this.usuarios = usuarios;
    }

}
