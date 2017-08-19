package CLASES;

import ds.desktop.notify.DesktopNotify;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Metodos {
    
    static Locale locale = new Locale(CLASES.Idioma.getP().getProperty("lenguaje"), CLASES.Idioma.getP().getProperty("pais"));
    static NumberFormat nf = NumberFormat.getCurrencyInstance(locale);
    
    public static void ERROR(String msj, Exception e){
        DesktopNotify.showDesktopMessage(msj, e.getMessage(), DesktopNotify.ERROR);
        escribirFichero(e);
    }
    
    public static void ADVERTENCIA(String title, String msj){
        DesktopNotify.showDesktopMessage(title, msj, DesktopNotify.INFORMATION);
    }
    
    public static void BIEN(String title, String msj){
        DesktopNotify.showDesktopMessage(title, msj, DesktopNotify.SUCCESS);
    }
    
    public static void escribirFichero(Exception e){
        File archivo = new File("ERORR.txt");
        BufferedWriter bw = null;
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        e.printStackTrace(pw);
        if(archivo.exists()) {
            try {
                bw = new BufferedWriter(new FileWriter(archivo, true));
                bw.write(sw.toString()+"\n\n\n");
            } catch (IOException ex) {
                Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            try {
                bw = new BufferedWriter(new FileWriter(archivo));
                bw.write(sw.toString()+"\n\n\n");
            } catch (IOException ex) {
                Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        try {
            bw.close();
        } catch (IOException ex) {
            Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static String moneda(Object o){
        return nf.format(o);
    }
}
