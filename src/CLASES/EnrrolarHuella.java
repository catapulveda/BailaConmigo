package CLASES;

import com.digitalpersona.onetouch.DPFPDataPurpose;
import com.digitalpersona.onetouch.DPFPFeatureSet;
import com.digitalpersona.onetouch.DPFPGlobal;
import com.digitalpersona.onetouch.DPFPSample;
import com.digitalpersona.onetouch.DPFPTemplate;
import com.digitalpersona.onetouch.processing.DPFPEnrollment;
import com.digitalpersona.onetouch.processing.DPFPImageQualityException;
import java.awt.Dialog;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

public class EnrrolarHuella extends DIALOGOS.RegistrarHuella{
    
    private DPFPEnrollment enrollador;
    private DPFPTemplate plantillaHuella;
    
    public EnrrolarHuella(Dialog parent, String title, boolean modal){
        super(parent, title, modal);
        try {
            enrollador = DPFPGlobal.getEnrollmentFactory().createEnrollment();
        } catch (java.lang.UnsatisfiedLinkError | java.lang.NoClassDefFoundError e) {
            CLASES.Metodos.ADVERTENCIA(
                    CLASES.Idioma.idioma().getProperty("erroriniciarlector"), 
                    e.getMessage()
            );
        }        
    }

    @Override
    protected void procesarHuella(DPFPSample sample) {
        super.procesarHuella(sample);
        DPFPFeatureSet caracteristicas = extractFeatures(sample, DPFPDataPurpose.DATA_PURPOSE_ENROLLMENT);
        if(caracteristicas != null){
            try {
                enrollador.addFeatures(caracteristicas);
            }catch(DPFPImageQualityException ex){
                CLASES.Metodos.M("FALTA CALIDAD EN LA HUELLA", "advertencia.png");
                Logger.getLogger(EnrrolarHuella.class.getName()).log(Level.SEVERE, null, ex);
            }finally{
                switch(enrollador.getFeaturesNeeded()){
                            case 4:
                                lblPasos.setIcon(new ImageIcon(getClass().getResource("/imagenes/paso0.png")));
                                break;
                            case 3:
                                lblPasos.setIcon(new ImageIcon(getClass().getResource("/imagenes/paso1.png")));                               
                                break;
                            case 2:
                                lblPasos.setIcon(new ImageIcon(getClass().getResource("/imagenes/paso2.png")));
                                break;
                            case 1:
                                lblPasos.setIcon(new ImageIcon(getClass().getResource("/imagenes/paso3.png")));
                                break;
                            case 0:
                                lblPasos.setIcon(new ImageIcon(getClass().getResource("/imagenes/paso4.png")));
                                break;
                        }
                        
                        switch(enrollador.getTemplateStatus()){
                            case TEMPLATE_STATUS_READY:	
                                detenerCaptura();
                                plantillaHuella = enrollador.getTemplate();
                                setVisible(false);
                                break;

                            case TEMPLATE_STATUS_FAILED:
                                enrollador.clear();
                                detenerCaptura();
                                lblPasos.setIcon(new ImageIcon(getClass().getResource("/imagenes/paso0.png")));
                                Metodo.M("Las huellas detectadas no coinciden en su totalidad, intente nuevamente", "advertencia.png");
                                iniciarCaptura();
                                break;                                
                            default: break;
                        }
            }
        }
    }    

    public DPFPEnrollment getEnrollador() {
        return enrollador;
    }

    public DPFPTemplate getPlantillaHuella() {
        return plantillaHuella;
    }

    public void setPlantillaHuella(DPFPTemplate plantillaHuella) {
        this.plantillaHuella = plantillaHuella;
    }
    
    
    
}
