package co.gov.dane.ige.modelo.entidad;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * Clase que indentifica la entidad IGE_USUARIO en la base de datos.
 * @author SRojasM
 */
@Entity
@Table(name = "IGE_USUARIO")
@NamedQueries({
    @NamedQuery(name = "IgeUsuario.findUsuarioById", query = "select u from IgeUsuario u where u.id = :id"),
    @NamedQuery(name = "IgeUsuario.getAllUsuarios", query = "select u from IgeUsuario u"),    
})
public class IgeUsuario implements Serializable {
    private static final long serialVersionUID = 1L;
    public static final String FIND_BY_ID = "IgeUsuario.findUsuarioById";
    public static final String GET_ALL = "IgeUsuario.getAllUsuarios";

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "USUARIO")
    private String usuario;
    @Column(name = "CONTRASENA")
    private String contrasena;

    public IgeUsuario(){
        
    }

    public IgeUsuario(String usuario, String contrasena){
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }


    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof IgeUsuario)) {
            return false;
        }
        IgeUsuario other = (IgeUsuario) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.gov.dane.ige.modelo.entidad.Usuario[ id=" + id + " ]";
    }
    
}
