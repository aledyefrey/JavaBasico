import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;

public class V39Terminos extends JFrame implements ActionListener, ChangeListener{

    private JLabel nom1;
    private JButton btn1;
    private JCheckBox check1;

    public V39Terminos(){

        setLayout(null);

        nom1 = new JLabel("Aceptar terminos y condiciones");
        nom1.setBounds(10,10,400,30);
        add(nom1);

        check1 = new JCheckBox("Aceptar");
        check1.setBounds(10,50,100,30);
        check1.addChangeListener(this);
        add(check1);

        btn1 = new JButton("Continuar");
        btn1.setBounds(10,100,100,30);
        add(btn1);
        btn1.addActionListener(this);
        btn1.setEnabled(false);
    }
    public void stateChanged(ChangeEvent e){

        if(check1.isSelected() == true){

            btn1.setEnabled(true);
        }else{

            btn1.setEnabled(false);
        }
    }
    public void actionPerformed(ActionEvent e){

        if(e.getSource() == btn1){

            System.exit(0);
        }
    }
    public static void main(String args[]){

        V39Terminos Formulario1 = new V39Terminos();
        Formulario1.setBounds(0,0,350,200);
        Formulario1.setVisible(true);
        Formulario1.setResizable(false);
        Formulario1.setLocationRelativeTo(null);
    }
}