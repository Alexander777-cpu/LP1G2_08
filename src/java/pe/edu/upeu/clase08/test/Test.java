
package pe.edu.upeu.clase08.test;
import pe.edu.upeu.clase08.config.Conexion;
import pe.edu.upeu.clase08.dao.IUsuario;
import pe.edu.upeu.clase08.daoImpl.UsuarioDaoImpl;

/**
 *
 * @author giezi
 */
public class Test {
    static IUsuario iu = new UsuarioDaoImpl();
    public static void main(String[] args) {
        login();
    }
    static void conec(){
        if (Conexion.getConextion()!=null) {
            System.out.println("Conectado");
        } else {
                System.out.println("No conectado");
        }
    }
    static void login(){
        System.out.println(iu.login("giezi.vivasc@gmail.com", "123"));
    }
}
