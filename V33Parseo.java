import javax.swing.*;
import java.awt.event.*;

public class V33Parseo extends JFrame implements ActionListener{

    private JTextField txt1, txt2;
    private JLabel lbl1, lbl2, lbl3;
    private JButton btn1;

    public V33Parseo(){

        setLayout(null);

        lbl1 = new JLabel("Valor 1: ");
        lbl1.setBounds(50,5,100,30);
        add(lbl1);

        lbl2 = new JLabel("Valor 2: ");
        lbl2.setBounds(50,35,100,30);
        add(lbl2);

        lbl3 = new JLabel("Resultado : ");
        lbl3.setBounds(120,80,100,30);
        add(lbl3);

        txt1 = new JTextField();
        txt1.setBounds(120,10,150,20);
        add(txt1);

        txt2 = new JTextField();
        txt2.setBounds(120,40,150,20);
        add(txt2);

        btn1 = new JButton("Sumar");
        btn1.setBounds(1,80,100,30);
        add(btn1);
        btn1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){

        if(e.getSource() == btn1){

            int valor1 = 0, valor2 = 0, rta = 0;
            valor1 = Integer.parseInt(txt1.getText());
            valor2 = Integer.parseInt(txt2.getText());
            rta = valor1 + valor2;
            lbl3.setText("Resultado : "+ rta);
        }
    }
    public static void main(String args[]){

        V33Parseo Formulario1 = new V33Parseo();
        Formulario1.setBounds(0,0,400,200);
        Formulario1.setVisible(true);
        Formulario1.setLocationRelativeTo(null);
        Formulario1.setResizable(false);
    }
}