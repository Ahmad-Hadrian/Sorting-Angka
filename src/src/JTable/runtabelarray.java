package JTable;

import javax.swing.*;

public class runtabelarray {
    public static void main(String[] args) {
        try{
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ignored){
        }
        ImageIcon imageIcon = new ImageIcon("res/rwa.jpg");
        JFrame jFrame = new JFrame("URUTKAN");
        jFrame.setIconImage(imageIcon.getImage());
        jFrame.setContentPane(new tabelarray().getRootPanel());
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLocationRelativeTo(null);
        jFrame.setSize(600, 300);
        jFrame.setVisible(true);
    }
}
