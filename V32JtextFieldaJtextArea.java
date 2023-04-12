import javax.swing.*;
import java.awt.event.*;

public class V32JtextFieldaJtextArea extends JFrame implements ActionListener{

    private JTextField txt1;
    private JTextArea txtArea1;
    private JScrollPane scroll1;
    private JButton btn1;

    String texto = "";

    public V32JtextFieldaJtextArea(){

        setLayout(null);

        txt1 = new JTextField();
        txt1.setBounds(10,10,200,30);
        add(txt1);

        btn1 = new JButton("Agregar");
        btn1.setBounds(250,10,100,30);
        add(btn1);
        btn1.addActionListener(this);

        txtArea1 = new JTextArea();
        scroll1 = new JScrollPane(txtArea1);
        scroll1.setBounds(10,50,400,300);
        add(scroll1);
    }
    public void actionPerformed(ActionEvent e){

        if(e.getSource() == btn1){

            texto += txt1.getText() + "\n";
            txtArea1.setText(texto);
            txt1.setText("");
        }
    }
    public static void main(String args[]){

        V32JtextFieldaJtextArea Formulario1 = new V32JtextFieldaJtextArea();
        Formulario1.setBounds(0,0,540,400);
        Formulario1.setVisible(true);
        Formulario1.setResizable(false);
        Formulario1.setLocationRelativeTo(null);
    }
}