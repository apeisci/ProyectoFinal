
import internal.com.sun.istack.logging.Logger;
import jakarta.jms.Connection;
import jakarta.resource.cci.ResultSet;
import java.lang.System.Logger.Level;

public class Persistencia {
    
    private Connection cn;
    private ResultSet rs;
    private PreparedStatement ps;
    
    
    public String servidor, basededatos, usuario, clave, ejecutar;
    
    public Connection conectarse(){
        
        try {
            
        
    Class.forName("com.mysql.jdbc.Driver");
    


   servidor= "localhost:3306/";
   basededatos = "cacproyecto2022";
   usuario = "root";
   clave = "";
   
    
    cn=DriverManager.getConnection("jdbc:mysql://" + servidor + basededatos+"?autoReconne=true&useSSL=false", usuario, clave);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Persistencia.class.getName()}.log(Level.SEVERE, null, ex);
        return null;
    
           }
return cn;

    ResultSet consultaSQL(String select__from_usuarios) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static class cn {

        public cn() {
        }
    }
}

public ResultSet consultaSQL(String busqueda){
try {
ps= conectarse().prepareStatement(busqueda);
rs=ps.executeQuery();
//rsm=rs.getMetadata();

} catch (SQLException ex) {
Logger.getLogger(Persistencia.class.getName()).log(Level.SEVERE, null, ex);
}
return rs;
}
}


