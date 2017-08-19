package CLASES;

import MODEL.Usuario;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingWorker;

public class HiloLogin extends SwingWorker<Void, Boolean>{

    private String user;
    private String pass;
    private JLabel lbl;
    private boolean login = false;
    private VISTAS.Login Vlogin;
    
    @Override
    protected Void doInBackground() throws Exception {
        lbl.setIcon(new ImageIcon(getClass().getResource("/imagenes/btncargando.gif")));
        ConexionPool conexion = new ConexionPool();
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            con = conexion.getDataSource().getConnection();
            st = con.createStatement();
            String sql = "SELECT * FROM usuario INNER JOIN rol USING(idrol) WHERE usuario='"+user+"' AND pass='"+pass+"' ";            
            rs = st.executeQuery(sql);
            if(rs.next()){
                Usuario usuario = Usuario.getUsuario();
                usuario.setIdusuario(rs.getInt("idusuario"));
                usuario.setNombreusuario(rs.getString("nombreusuario"));
                usuario.setUsername(rs.getString("usuario"));
                usuario.setPassword(rs.getString("pass"));
                usuario.setIdrol(rs.getInt("idrol"));
                usuario.setFoto(rs.getBytes("foto"));
                usuario.setHuella(rs.getBytes("huella"));
                login = true;
            }else{
                CLASES.Metodos.ADVERTENCIA("Mensjae", "EL usuario no existe");
                login = false;
                lbl.setIcon(new ImageIcon(getClass().getResource("/imagenes/locked.png")));
            }
        } catch (Exception e) {
            CLASES.Metodos.ERROR("ERROR AL INICIAR SESION", e);
        }finally{
            try {con.close();st.close();rs.close();} catch (SQLException ex) {Logger.getLogger(HiloLogin.class.getName()).log(Level.SEVERE, null, ex);}
        }
        return null;
    }

    @Override
    protected void done() { 
        if(login){
            Vlogin.dispose();
            VISTAS.MAIN.main(null);
        }        
    }

    public boolean isLogin() {
        return login;
    }

    public void setLogin(boolean login) {
        this.login = login;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public void setLbl(JLabel lbl) {
        this.lbl = lbl;
    }

    public void setVlogin(VISTAS.Login Vlogin) {
        this.Vlogin = Vlogin;
    }
    
}
