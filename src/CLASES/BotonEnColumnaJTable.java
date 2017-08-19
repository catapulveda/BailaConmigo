package CLASES;

import java.awt.Component;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author AUXPLANTA
 */
public class BotonEnColumnaJTable implements TableCellRenderer{

    JButton boton;
    
    public BotonEnColumnaJTable(){
        boton = new JButton();        
    }
    
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                
        boton.setText(""+(row+1));
        boton.setFont(new Font("Tahoma", Font.BOLD, 14));
            if(hasFocus){
                table.setRowSelectionInterval(row, row);
                table.setColumnSelectionInterval(0, table.getColumnCount()-1);
            }
            
        return boton;
    }
    
}
