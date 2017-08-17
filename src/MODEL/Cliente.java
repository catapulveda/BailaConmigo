package MODEL;

import CLASES.ConexionPool;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Cliente {
    
    private int idcliente;
    private String identificacion;
    private String nombre;
    private String apellido;
    private String telefono;
    private String direccion;
    private String correo;
    private java.util.Date fechanacimiento;
    private int idusuario;
    private String codigopostal;

    public Cliente() {
    }        
    
    public Cliente(int idcliente, String identificacion, String nombre, String apellido, String telefono, String direccion, String correo, Date fechanacimiento, int idusuario) {
        this.idcliente = idcliente;
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.direccion = direccion;
        this.correo = correo;
        this.fechanacimiento = fechanacimiento;
        this.idusuario = idusuario;
    }

    public int getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public java.util.Date getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(java.util.Date fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }
    
    public String getCodigopostal() {
        return codigopostal;
    }

    public void setCodigopostal(String codigopostal) {
        this.codigopostal = codigopostal;
    }
    
    public boolean registrarCliente(boolean guardar){
        
        if(getIdentificacion().isEmpty()){
            CLASES.Metodos.ADVERTENCIA(
                CLASES.Idioma.idioma().getProperty("mensaje"), 
                CLASES.Idioma.idioma().getProperty("faltaidentificaion")
            );
            return false;
        }
        if(getNombre().isEmpty()){
            CLASES.Metodos.ADVERTENCIA(
                CLASES.Idioma.idioma().getProperty("mensaje"), 
                CLASES.Idioma.idioma().getProperty("faltanombre")
            );
            return false;
        }
        if(getApellido().isEmpty()){
            CLASES.Metodos.ADVERTENCIA(
                CLASES.Idioma.idioma().getProperty("mensaje"), 
                CLASES.Idioma.idioma().getProperty("faltaapellido")
            );
            return false;
        }
        if(getFechanacimiento()==null){
            CLASES.Metodos.ADVERTENCIA(
                CLASES.Idioma.idioma().getProperty("mensaje"), 
                CLASES.Idioma.idioma().getProperty("faltafechanacimiento")
            );
            return false;
        }
        
        if(validarIdentificacion(getIdentificacion())){
            String sql = "";        
            if(guardar){
                sql += "INSERT INTO public.cliente(\n" +
                "            identificacion, nombrecliente, apellidocliente, fechadenacimiento, \n" +
                "            numerotelefonico, direccioncliente, correocliente, fechaderegistro, \n" +
                "            idusuarioregistrador, codigopostal)\n" +
                "    VALUES ('"+getIdentificacion().trim()+"', '"+getNombre().trim()+"', '"+getApellido().trim()+"', '"+getFechanacimiento()+"', \n" +
                "            '"+getTelefono()+"', '"+getDireccion()+"', '"+getCorreo()+"', '"+new java.util.Date()+"', \n" +
                "            "+MODEL.Usuario.getUsuario().getIdusuario()+", '"+getCodigopostal()+"');";
            }else{
                sql += "UPDATE cliente SET(\n" +
                "     identificacion='"+getIdentificacion().trim()+"', nombrecliente='"+getNombre().trim()+"', apellidocliente='"+getApellido().trim()+"', \n" +
                "     fechadenacimiento='"+getFechanacimiento()+"', numerotelefonico='"+getTelefono()+"', direccioncliente='"+getDireccion()+"', \n" +
                "     correocliente='"+getCorreo()+"', idusuarioactualizador="+MODEL.Usuario.getUsuario().getIdusuario()+" , codigopostal='"+getCodigopostal()+"' ";
            }
            ConexionPool conexion = new ConexionPool();
            Connection con = null;
            try{
                con = conexion.getDataSource().getConnection();
                if(con.prepareStatement(sql).executeUpdate()>0){
                    return true;
                }
            }catch(org.postgresql.util.PSQLException e){
                CLASES.Metodos.ERROR(CLASES.Idioma.idioma().getProperty("error"), e);
                java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, e);
            }catch(Exception e){
                CLASES.Metodos.ERROR(CLASES.Idioma.idioma().getProperty("error"), e);
                java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, e);
            }finally{
                try {con.close();} catch (SQLException ex) {Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);}
            }
        }
        
        return false;
    }

    public boolean validarIdentificacion(String identificacion){
        ConexionPool conexion = new ConexionPool();
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            con = conexion.getDataSource().getConnection();
            st = con.createStatement();
            rs = st.executeQuery("SELECT idcliente FROM cliente WHERE identificacion='"+identificacion+"' ");
            return !rs.next();
        } catch (Exception e) {
            CLASES.Metodos.ERROR(CLASES.Idioma.idioma().getProperty("error"), e);
        }finally{
            try {con.close();st.close();rs.close();} catch (SQLException ex) {Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);}
        }
        
        return true;
    }
    
    
}
