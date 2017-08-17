package CLASES;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Idioma extends Properties{
    
    private static Idioma idioma;
    
    public static Idioma idioma(){
        if(idioma==null){
            idioma = new Idioma();
            Properties p = new Properties();
            try {
                p.load(new FileInputStream(new File("config.properties")));
                idioma.getProperties(p.getProperty("idioma"));
            } catch (IOException ex){
                Logger.getLogger(Idioma.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return idioma;        
    }
    
    public void getProperties(String idioma){
        try {
            this.load(new FileInputStream(new File("lang/"+idioma+".properties")));
        } catch (IOException ex) {
            Logger.getLogger(Idioma.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
