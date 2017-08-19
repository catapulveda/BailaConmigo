package CLASES;

import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.ParseException;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JTable;
import javax.swing.KeyStroke;
import javax.swing.ListSelectionModel;
import javax.swing.SwingUtilities;
import javax.swing.event.ListSelectionEvent;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author AUXPLANTA
 */
public class CustomTableModel extends DefaultTableModel implements MouseListener {

    private JTable tabla;
    private final Class[] columnClass;
    private final Boolean[] columnEditable;
    private JPopupMenu menu;
    private JMenuItem menuItemBuscar;
    private JLabel lblFilasSeleccionadas;

    ColorRowInJTable colorRow = new ColorRowInJTable();

    public CustomTableModel(Object rowData[][], Object columnNames[], JTable table, Class[] columnClass, Boolean[] columnEditable) {
        super(rowData, columnNames);
        this.tabla = table;
        this.columnClass = columnClass;
        this.columnEditable = columnEditable;

        tabla.setFont(new Font("Ebrima", Font.PLAIN, 12));
        tabla.setGridColor(new java.awt.Color(227, 227, 227));
        tabla.setRowHeight(25);
        tabla.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        tabla.setCellSelectionEnabled(true);
        tabla.getInputMap(JTable.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT).put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), "selectNextColumnCell");
        tabla.setSurrendersFocusOnKeystroke(true);
        tabla.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tabla.setDragEnabled(true);
        tabla.setModel(this);

        tabla.setDefaultRenderer(Object.class, colorRow);
        tabla.setDefaultRenderer(Integer.class, colorRow);
        tabla.setDefaultRenderer(java.util.Date.class, colorRow);
        tabla.setDefaultRenderer(Double.class, colorRow);

        tabla.addMouseListener(this);

        tabla.getSelectionModel().addListSelectionListener((ListSelectionEvent e) -> {
            if (e.getValueIsAdjusting()) {
                double suma = 0;
                for (int row : tabla.getSelectedRows()) {
                    for (int col : tabla.getSelectedColumns()) {
                        try {
                            suma += CLASES.Metodos.nf.parse(tabla.getValueAt(row, col).toString()).intValue();
                        } catch (java.lang.NumberFormatException | java.lang.NullPointerException ex) {
                            suma += 0;
                        } catch (ParseException ex) {
//                            Logger.getLogger(CustomTableModel.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
                if(lblFilasSeleccionadas!=null){
                    lblFilasSeleccionadas.setText("Columnas: " + tabla.getSelectedColumnCount() + " Filas: " + tabla.getSelectedRowCount() + " Total filas: " + tabla.getRowCount() + " Suma: " + CLASES.Metodos.moneda(suma));
                }                
                suma = 0;
            }
        });
    }

    @Override
    public Class getColumnClass(int col) {
        return columnClass[col];
    }

    @Override
    public boolean isCellEditable(int row, int col) {
        return columnEditable[col];
    }

    public void setMenu(JPopupMenu menu) {
        this.menu = menu;
    }

    public void setMenuItem(JMenuItem menuItem) {
        this.menuItemBuscar = menuItem;
    }

    @Override
    public void mouseClicked(MouseEvent evt) {
        if (SwingUtilities.isRightMouseButton(evt)) {
            int row = tabla.rowAtPoint(evt.getPoint());
            int col = tabla.columnAtPoint(evt.getPoint());
            int filas[] = tabla.getSelectedRows();

            boolean ESTA = false;
            for (int fila : filas) {
                if (fila == row) {
                    ESTA = true;
                    break;
                }
            }

            if (filas.length == 1 || filas.length == 0 || !ESTA) {
                tabla.setRowSelectionInterval(row, row);
                tabla.setColumnSelectionInterval(col, col);
            }
            if (menuItemBuscar != null) {
                menuItemBuscar.setText("Buscar por " + tabla.getColumnName(col));               
            }
            if(menu!=null){
                menu.show(tabla, evt.getPoint().x, evt.getPoint().y);
            }            
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    public void setLblFilasSeleccionadas(JLabel lblFilasSeleccionadas) {
        this.lblFilasSeleccionadas = lblFilasSeleccionadas;
    }

}
