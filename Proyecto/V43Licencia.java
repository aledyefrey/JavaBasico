import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class V43Licencia extends JFrame implements ActionListener, ChangeListener{

    private JLabel lbl1, lbl2;
    private JCheckBox check1;
    private JButton btn1, btn2;
    private JScrollPane scroll1;
    private JTextArea area1;
    String nombre = "";

    public V43Licencia(){

        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setTitle("Licencia de uso");
        //setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
        V42Bienvenida bienvenida = new V42Bienvenida();
        nombre = bienvenida.texto;

        lbl1 = new JLabel("TERMINOS Y CONDICIONES");
        lbl1.setBounds(215,5,200,30);
        lbl1.setFont(new Font("Andale Mono", 1, 14));
        lbl1.setForeground(new Color(0,0,0));
        add(lbl1);

        area1 = new JTextArea();
        area1.setEditable(false);
        area1.setFont(new Font("Andale Mono", 0, 9));
        area1.setText("\n\n          TERMINOS Y CONDICIONES"+
"\n\n          A. PROHIBIDA SU VENTA O DISTRIBUCION SIN AUTORIZACION DE ALED JEFREY AVILES. "+
"\n          B. PROHIBIDA LA ALTERACION DEL CODIGO FUENTE O DISEÑO DE LAS INTERFACES GRAFICAS."+
"\n          C. ALED JEFREY AVILES NO SE HACE RESPONSABLE DEL MAL USO DE ESTE SOFTWARE."+
"\n\n          LOS ACUERDOS LEGALES EXPUESTOS ACONTINUACION RIGEN EL USO QUE USTED HAGA DE ESTE SOFTWARE."+
"\n          (ALED JEFREY AVILES EN COLABORACION CON LA GEEKIPEDIA DE HERNESTO), NO SE RESPONSABILIZAN DEL USO QUE USTED"+
"\n          HAGA CON ESTE SOFTWARE Y SUS SERVICIOS. PARA ACEPTAR ESTOS TERMINO HAGA CLICK EN (ACEPTO)"+
"\n          SI USTED NO ACEPTA ESTOS TERMINOS, HAGA CLICK EN (NO ACEPTO) Y NO UTILICE ESTE SOFTWARE."+
"\n\n          PARA MAYOR INFORMACION SOBRE NUESTROS PRODUCTOS O SERVICIOS, POR FAVOR VISITE"+
"\n\n          https://www.facebook.com/alex.avilezochoa");
        scroll1 = new JScrollPane(area1);
        scroll1.setBounds(10,40,575,200);
        add(scroll1);

        check1 = new JCheckBox("Yo "+ nombre +" Acepto");
        check1.setBounds(10,250,300,30);
        check1.addChangeListener(this);
        add(check1);

        btn1 = new JButton("Continuar");
        btn1.setBounds(10,290,100,30);
        btn1.addActionListener(this);
        btn1.setEnabled(false);
        add(btn1);

        btn2 = new JButton("No Acepto");
        btn2.setBounds(120,290,100,30);
        btn2.addActionListener(this);
        btn2.setEnabled(true);
        add(btn2);

        //ImageIcon imagen = new ImageIcon("images/coca-cola.png");
        lbl2 = new JLabel("imagen");
        lbl2.setBounds(315,135,300,300);
        add(lbl2);
    }
    public void stateChanged(ChangeEvent e){

        if(check1.isSelected() == true){

            btn1.setEnabled(true);
            btn2.setEnabled(false);
        }else{

            btn1.setEnabled(false);
            btn2.setEnabled(true);
        }
    }
    public void actionPerformed(ActionEvent e){

        if(e.getSource() == btn1){

            V44Principal principal = new V44Principal();
            principal.setBounds(0,0,640,535);
            principal.setVisible(true);
            principal.setResizable(false);
            principal.setLocationRelativeTo(null);
            this.setVisible(false);
        } else if(e.getSource() == btn2){

            V42Bienvenida Bienvenida = new V42Bienvenida();
            Bienvenida.setBounds(0,0,350,450);
            Bienvenida.setVisible(true);
            Bienvenida.setResizable(false);
            Bienvenida.setLocationRelativeTo(null);
            this.setVisible(false);
        }
    }
    public static void main(String args[]){

        V43Licencia licencia = new V43Licencia();
        licencia.setBounds(0,0,600,360);
        licencia.setVisible(true);
        licencia.setResizable(false);
        licencia.setLocationRelativeTo(null);
    }
}