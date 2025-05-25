
package pe.edu.upeu.clase08.test;
import pe.edu.upeu.clase08.config.Conexion;

/**
 *
 * @author giezi
 */
public class Test {
    public static void main(String[] args) {
        if (Conexion.getConextion()!=null) {
            System.out.println("Conectado");
        } else {
                System.out.println("No conectado");
        }
    }
}
