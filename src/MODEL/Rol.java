package MODEL;

import CLASES.ConexionPool;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Rol {
    
    
    private int idrol;
    private String nombrerol;

    public Rol(int idrol, String nombrerol) {
        this.idrol = idrol;
        this.nombrerol = nombrerol;
    }

    public Rol() {
    }

    public int getIdrol() {
        return idrol;
    }

    public void setIdrol(int idrol) {
        this.idrol = idrol;
    }

    public String getNombrerol() {
        return nombrerol;
    }

    public void setNombrerol(String nombrerol) {
        this.nombrerol = nombrerol;
    }

    @Override
    public String toString() {
        return nombrerol;
    }
    
    public static java.util.List<Rol> getRoles(){
        java.util.List<Rol> lista = new java.util.ArrayList();
        String sql = "SELECT * FROM rol";
        ConexionPool conexion = new ConexionPool();
        Connection con = null;
        Statement st = null;
        ResultSet rs;
        try {
            con = conexion.getDataSource().getConnection();
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
                lista.add(new Rol(rs.getInt("idrol"), rs.getString("nombrerol")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Rol.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }
}
