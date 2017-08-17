package CLASES;

import ds.desktop.notify.DesktopNotify;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Metodos {
    
    public static void ERROR(String msj, Exception e){
        DesktopNotify.showDesktopMessage(msj, e.getMessage(), DesktopNotify.ERROR);
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
}
