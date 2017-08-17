package MODEL;

import CLASES.ConexionPool;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Usuario {
    
    private int idusuario;
    private String nombre;
    private String username;
    private String password;
    private static Usuario usuario;

    public static Usuario getUsuario(){
        if(usuario == null){
            usuario = new Usuario();
        }
        return usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }        

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }
    
    public boolean iniciarSesion(String user, String pass){
        ConexionPool conexion = new ConexionPool();
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            con = conexion.getDataSource().getConnection();
            st = con.createStatement();
            String sql = "SELECT * FROM usuario WHERE usuario='"+user+"' AND pass='"+pass+"' ";
            rs = st.executeQuery(sql);
            if(rs.next()){
                usuario = new Usuario();
                usuario.setNombre(rs.getString("nombreusuario"));
                usuario.setUsername(rs.getString("usuario"));
                usuario.setPassword(rs.getString("pass"));
                return true;
            }else{
                CLASES.Metodos.ADVERTENCIA("Mensjae", "EL usuario no existe");
            }
        } catch (Exception e) {
            CLASES.Metodos.ERROR("ERROR AL INICIAR SESION", e);
        }finally{
            try {con.close();st.close();rs.close();} catch (SQLException ex) {Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);}
        }
        return false;
    }
}
