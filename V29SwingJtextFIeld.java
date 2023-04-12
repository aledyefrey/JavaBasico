import javax.swing.*;
import java.awt.event.*;

public class V29SwingJtextField extends JFrame implements ActionListener{

    private JTextField txt1;
    private JLabel lbl1;
    private JButton btn1;

    public V29SwingJtextField(){

        setLayout(null);

        lbl1 = new JLabel("usuario: ");
        lbl1.setBounds(10,10,100,30);
        add(lbl1);

        txt1 = new JTextField();
        txt1.setBounds(120,17,150,20);
        add(txt1);

        btn1 = new JButton("Aceptar");
        btn1.setBounds(10,80,100,30);
        add(btn1);
        btn1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){

        if(e.getSource() == btn1){

            String texto = txt1.getText();
            setTitle(texto);
        }
    }
    public static void main(String args[]){

        V29SwingJtextField Formulario1 = new V29SwingJtextField();
        Formulario1.setBounds(0,0,300,150);
        Formulario1.setVisible(true);
        Formulario1.setResizable(false);
        Formulario1.setLocationRelativeTo(null);
    }
}