
package mx.uach.fing.manejousuarios.dao;

import java.util.List;
import mx.uach.fing.manejousuarios.datos.Usuario;

/**
 *
 * @author Erika
 */
public interface Crud {
    //en una interfaz se definen metodos
    //T = type
    //crea una clase donde implementes esa clase crud
    public List<Usuario> list();
    
    public void create(Usuario usuario); //para crear un usuario 
    
    public void update(Usuario usuario);
    
    public void eliminar(Integer id);
    
    
}
