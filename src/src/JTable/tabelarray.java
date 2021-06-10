package JTable;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class tabelarray {
    private JPanel rootpanel;
    private JTextField textJumlah;
    private JTextField textAngka;
    private JButton buttonProses;
    private DefaultTableModel tableModel;
    private boolean added = false;
    private JTable tablehasil;

    public JPanel getRootPanel() {
        return rootpanel;
    }

    public tabelarray() {
        this.inicomponents();
        buttonProses.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel model = (DefaultTableModel) tablehasil.getModel();
                String angka = textAngka.getText();
                int jumlah = Integer.parseInt(textJumlah.getText());
                String[] exc = angka.split(",");
                if(angka.isBlank()){
                    JOptionPane.showMessageDialog(rootpanel, "Data Tidak Ada", "Warning" ,
                            JOptionPane.WARNING_MESSAGE);
                }
                if (!added) {
                    for (int i = 0; i < jumlah; i++) {
                        model.addRow(new Object[]{});
                    }
                    added = true;
                }
                int a = 0;
                for (int i : array.getascenden(angka, jumlah)){
                    model.setValueAt(i, a, 0);
                    a++;
                }
                int b = 0;
                for (int i : array.getdescenden(angka, jumlah)){
                    model.setValueAt(i, b, 1);
                    b++;
                }
            }
        });
    }
    private void inicomponents(){
        Object[] tableColom = {
                "Ascending",
                "Descending"
        };
        Object[][] inidata = {
        };
        tableModel = new DefaultTableModel(inidata, tableColom);
        //set table model
        tablehasil.setModel(tableModel);
        //menampilkan sorting
        tablehasil.setAutoCreateRowSorter(true);
        //enable single selection
        tablehasil.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

    }
}
