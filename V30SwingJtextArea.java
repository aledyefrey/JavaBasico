import javax.swing.*;

public class V30SwingJtextArea extends JFrame{

    private JTextField txt1;
    private JTextArea txtArea1;

    public V30SwingJtextArea(){

        setLayout(null);

        txt1 = new JTextField();
        txt1.setBounds(10,10,200,30);
        add(txt1);

        txtArea1 = new JTextArea();
        txtArea1.setBounds(10,50,400,300);
        add(txtArea1);
    }
    public static void main(String args[]){

        V30SwingJtextArea Formulario1 = new V30SwingJtextArea();
        Formulario1.setBounds(0,0,540,400);
        Formulario1.setVisible(true);
        Formulario1.setLocationRelativeTo(null);
        Formulario1.setResizable(false);
    }
}