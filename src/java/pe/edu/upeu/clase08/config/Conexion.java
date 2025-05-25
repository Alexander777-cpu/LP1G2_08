
package pe.edu.upeu.clase08.config;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author giezi
 */
public class Conexion {
    private static final String URL = "jdbc:oracle:thin:@localhost:1521:XE";
    private static final String DRIVER = "oracle.jdbc.OracleDriver";
    private static final String USER = "C##LP1G2";
    private static final String PASS = "123";
    private static Connection cx = null;
    
    public static Connection getConextion(){
        try {
            Class.forName(DRIVER);
            if (cx==null) {
                cx = DriverManager.getConnection(URL, USER, PASS);
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("ERROR CONEXIÓN: " + e);
        }
        return cx;
    }
}
