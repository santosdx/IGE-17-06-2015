package co.gov.dane.ige.modelo.servicio;

import co.gov.dane.ige.modelo.local.IgeUsuarioFacadeLocal;
import co.gov.dane.ige.modelo.entidad.IgeUsuario;
import co.gov.dane.ige.modelo.fachada.AbstractFacade;
import java.util.Collections;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 * Clase que extiende de la fachada e implementa la interfaz para la implementación
 * de todos los métodos del ejb
 * @author SRojasM
 */
@Stateless(name = "EJBServicioIgeUsuario")
public class ServicioIgeUsuario extends AbstractFacade<IgeUsuario> implements IgeUsuarioFacadeLocal {
    @PersistenceContext(unitName = "GrupoEmpresarial-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ServicioIgeUsuario() {
        super(IgeUsuario.class);
    }

    public IgeUsuario obtenerUsuarioById(Long id) {
        
        IgeUsuario usuario = null;

        try {
            Query query = em.createNamedQuery(IgeUsuario.FIND_BY_ID);
            query.setParameter("id", id);

            List<IgeUsuario> listaUsuarios = Collections.EMPTY_LIST;
            listaUsuarios = query.getResultList();
            if (listaUsuarios.isEmpty()) {
                return null;
            } else {
                usuario = listaUsuarios.get(0);
            }
        } catch (Exception e) {
            e.printStackTrace(System.err);
        } 
        return usuario;
    }

}
