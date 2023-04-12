import javax.swing.*;

public class V24LibreriaSwing extends JFrame{

    private JLabel lbl1;


    public V24LibreriaSwing(){

        setLayout(null);
        lbl1 = new JLabel("El desarrollo de aled");
        lbl1.setBounds(10,20,200,300);
        add(lbl1);
    }
    public static void main(String args[]){

        V24LibreriaSwing Formulario1 = new V24LibreriaSwing();
        Formulario1.setBounds(0,0,400,300);
        Formulario1.setVisible(true);
        Formulario1.setLocationRelativeTo(null);
    }
}