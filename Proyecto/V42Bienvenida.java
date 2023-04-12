import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class V42Bienvenida extends JFrame implements ActionListener{

    private JTextField txt1;
    private JLabel lbl1, lbl2, lbl3, lbl4;
    private JButton btn1;
    public static String texto = "";

    public V42Bienvenida(){

        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setTitle("Bienvenido");
        getContentPane().setBackground(new Color(255,0,0));
        //setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());

        //ImageIcon imagen = new ImageIcon("images/logo-coca.png");  <- colocar imagen
        lbl1 = new JLabel("imagen"); // <- agregar imagen en un label
        lbl1.setBounds(25,15,300,150);
        add(lbl1);

        lbl2 = new JLabel("Sistema de control vacacional");
        lbl2.setBounds(35,135,300,30);
        lbl2.setFont(new Font("Andale Mono", 3, 18));
        lbl2.setForeground(new Color(255,255,255));
        add(lbl2);

        lbl3 = new JLabel("Ingrese su nombre");
        lbl3.setBounds(45,212,200,30);
        lbl3.setFont(new Font("Andale Mono", 1, 12));
        lbl3.setForeground(new Color(255,255,255));
        add(lbl3);

        lbl4 = new JLabel("©2018 The Coca-Cola Company");
        lbl4.setBounds(85,375,300,30);
        lbl4.setFont(new Font("Andale Mono", 1, 12));
        lbl4.setForeground(new Color(255, 255, 255));
        add(lbl4);

        txt1 = new JTextField();
        txt1.setBounds(45,240,255,25);
        txt1.setBackground(new Color(224,224,224));
        txt1.setFont(new Font("Andale Mono", 1, 14));
        txt1.setForeground(new Color(255, 255, 255));
        add(txt1);

        btn1 = new JButton("Ingresar");
        btn1.setBounds(125,280,100,30);
        btn1.setBackground(new Color(255,0,0));
        btn1.setFont(new Font("Andale Mono", 1, 14));
        btn1.setForeground(new Color(255, 255, 255));
        btn1.addActionListener(this);
        add(btn1);
    }
    public void actionPerformed(ActionEvent e){

        if(e.getSource() == btn1){

            texto = txt1.getText().trim();
            if(texto.equalsIgnoreCase("")){

                JOptionPane.showMessageDialog(null, "Debes ingresar tu nombre.");
            }else {

                V43Licencia licencia = new V43Licencia();
                licencia.setBounds(0,0,600,360);
                licencia.setVisible(true);
                licencia.setResizable(false);
                licencia.setLocationRelativeTo(null);
                this.setVisible(false);
            }
        }
    }
    public static void main(String args[]){

        V42Bienvenida Bienvenida = new V42Bienvenida();
        Bienvenida.setBounds(0,0,350,450);
        Bienvenida.setVisible(true);
        Bienvenida.setResizable(false);
        Bienvenida.setLocationRelativeTo(null);
    }
}