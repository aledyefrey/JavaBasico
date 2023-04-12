import javax.swing.*;

public class V26SwingJlabel extends JFrame{

    private JLabel lbl1;
    private JLabel lbl2;

    public V26SwingJlabel(){

        setLayout(null);
        lbl1 = new JLabel("Interfaz Grafica.");
        lbl1.setBounds(10,20,300,30);
        add(lbl1);
        lbl2 = new JLabel("V1.0");
        lbl2.setBounds(10,100,100,30);
        add(lbl2);
    }
    public static void main(String args[]){

        V26SwingJlabel Formulario1 = new V26SwingJlabel();
        Formulario1.setBounds(0,0,300,200);
        Formulario1.setResizable(false);
        Formulario1.setVisible(true);
        Formulario1.setLocationRelativeTo(null);
    }
}