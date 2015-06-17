package co.gov.dane.ige.modelo.local;

import co.gov.dane.ige.modelo.entidad.IgeUsuario;
import java.util.List;
import javax.ejb.Local;

/**
 * Interfaz de la entidad IGE_USUARIO, que gestiona todos los métodos de servicio
 * ejb
 * @author SRojasM
 */
@Local
public interface IgeUsuarioFacadeLocal {

    void create(IgeUsuario igeUsuario);

    void edit(IgeUsuario igeUsuario);

    void remove(IgeUsuario igeUsuario);

    IgeUsuario find(Object id);

    List<IgeUsuario> findAll();

    List<IgeUsuario> findRange(int[] range);

    int count();

    public IgeUsuario obtenerUsuarioById(Long id);
}
