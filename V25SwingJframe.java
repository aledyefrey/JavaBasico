import javax.swing.*;

public class V25SwingJframe extends JFrame{

    public V25SwingJframe(){

        setLayout(null);
    }
    public static void main(String args[]){

        V25SwingJframe Formulario1 = new V25SwingJframe();
        Formulario1.setBounds(350,100,800,550);
        Formulario1.setVisible(true);
        Formulario1.setLocationRelativeTo(null);
        Formulario1.setResizable(false);
    }
}