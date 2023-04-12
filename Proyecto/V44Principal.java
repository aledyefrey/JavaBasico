import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class V44Principal extends JFrame implements ActionListener{

    private JMenuBar mb;
    private JMenu mOpciones, mCalcular, mAcercade, mColorFondo;
    private JMenuItem miCalculo, miRojo, miNegro, miMorado, miCreador, miSalir, miNuevo;
    private JLabel lblLogo, lblBienvenido, lblTitulo, lblNombre, lblAPaterno, lblAMaterno, lblDepartamento, lblAntiguedad, lblResultado, lblFooter;
    private JTextField txtNomTrabajador, txtAPaterno, txtAMaterno;
    private JComboBox cmbDepartamento, cmbAntiguedad;
    private JScrollPane scroll1;
    private JTextArea area1;
    String nombreAdmin = "";

    V44Principal(){

        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setTitle("Pantalla Principal");
        getContentPane().setBackground(new Color(255,0,0));
        //setIconImage(new ImageIcon(getClass().getResource("image/icon.png")).getImage());
        V42Bienvenida bienvenida = new V42Bienvenida();
        nombreAdmin = bienvenida.texto;

        mb = new JMenuBar();
        mb.setBackground(new Color(255,0,0));
        setJMenuBar(mb);

        mOpciones = new JMenu("Opciones");
        mOpciones.setBackground(new Color(255,0,0));
        mOpciones.setFont(new Font("Andale Mono", 1, 14));
        mOpciones.setForeground(new Color(255,255,255));
        mb.add(mOpciones);

        mCalcular = new JMenu("Calcular");
        mCalcular.setBackground(new Color(255,0,0));
        mCalcular.setFont(new Font("Andale Mono", 1, 14));
        mCalcular.setForeground(new Color(255,255,255));
        mb.add(mCalcular);

        mAcercade = new JMenu("Acerca de");
        mAcercade.setBackground(new Color(255,0,0));
        mAcercade.setFont(new Font("Andale Mono", 1, 14));
        mAcercade.setForeground(new Color(255,255,255));
        mb.add(mAcercade);

        mColorFondo = new JMenu("Color de fondo");
        mColorFondo.setBackground(new Color(51,0,51));
        mColorFondo.setFont(new Font("Andale Mono", 1, 14));
        mColorFondo.setForeground(new Color(255,255,255));
        mOpciones.add(mColorFondo);

        miCalculo = new JMenuItem("Vacaciones");
        miCalculo.setFont(new Font("Andale Mono", 1, 14));
        miCalculo.setForeground(new Color(255,0,0));
        mCalcular.add(miCalculo);
        miCalculo.addActionListener(this);

        miRojo = new JMenuItem("Rojo");
        miRojo.setFont(new Font("Andale Mono", 1, 14));
        miRojo.setForeground(new Color(255, 0, 0));
        mColorFondo.add(miRojo);
        miRojo.addActionListener(this);

        miNegro = new JMenuItem("Negro");
        miNegro.setFont(new Font("Andale Mono", 1, 14));
        miNegro.setForeground(new Color(255, 0, 0));
        mColorFondo.add(miNegro);
        miNegro.addActionListener(this);

        miMorado = new JMenuItem("Morado");
        miMorado.setFont(new Font("Andale Mono", 1, 14));
        miMorado.setForeground(new Color(255, 0, 0));
        mColorFondo.add(miMorado);
        miMorado.addActionListener(this);

        miNuevo = new JMenuItem("Nuevo");
        miNuevo.setFont(new Font("Andale Mono", 1, 14));
        miNuevo.setForeground(new Color(255, 0, 0));
        mOpciones.add(miNuevo);
        miNuevo.addActionListener(this);

        miCreador = new JMenuItem("El creador");
        miCreador.setFont(new Font("Andale Mono", 1, 14));
        miCreador.setForeground(new Color(255, 0, 0));
        mAcercade.add(miCreador);
        miCreador.addActionListener(this);

        miSalir = new JMenuItem("Salir");
        miSalir.setFont(new Font("Andale Mono", 1, 14));
        miSalir.setForeground(new Color(255, 0, 0));
        mOpciones.add(miSalir);
        miSalir.addActionListener(this);

        //ImagenIcon imagen = new ImageIcon("images/logo-coca.png");
        lblLogo = new JLabel("Imagen");
        lblLogo.setBounds(5,5,250,100);
        add(lblLogo);

        lblBienvenido = new JLabel("Bienvenido "+ nombreAdmin);
        lblBienvenido.setBounds(280,30,300,100);
        lblBienvenido.setFont(new Font("Andale Mono", 1, 32));
        lblBienvenido.setForeground(new Color(255,255,255));
        add(lblBienvenido);

        lblTitulo = new JLabel("Datos del trabajador para el calculo de vacaciones");
        lblTitulo.setBounds(45,140,900,25);
        lblTitulo.setFont(new Font("Andale Mono", 0, 24));
        lblTitulo.setForeground(new Color(255,255,255));
        add(lblTitulo);

        lblNombre = new JLabel("Nombre completo");
        lblNombre.setBounds(25,188,180,25);
        lblNombre.setFont(new Font("Andale Mono", 1, 12));
        lblNombre.setForeground(new Color(255, 255, 255));
        add(lblNombre);

        txtNomTrabajador = new JTextField();
        txtNomTrabajador.setBounds(25,213,150,25);
        txtNomTrabajador.setBackground(new Color(224, 244, 244));
        txtNomTrabajador.setFont(new Font("Andale Mono", 1, 14));
        txtNomTrabajador.setForeground(new Color(255, 0, 0));
        add(txtNomTrabajador);

        lblAPaterno = new JLabel("Apellido Paterno");
        lblAPaterno.setBounds(25,240,180,25);
        lblAPaterno.setFont(new Font("Andale Mono", 1, 12));
        lblAPaterno.setForeground(new Color(255, 255, 255));
        add(lblAPaterno);

        txtAPaterno = new JTextField();
        txtAPaterno.setBounds(25,273,150,25);
        txtAPaterno.setBackground(new Color(224, 244, 244));
        txtAPaterno.setFont(new Font("Andale Mono", 1, 14));
        txtAPaterno.setForeground(new Color(255, 0, 0));
        add(txtAPaterno);

        lblAMaterno = new JLabel("Apellido Materno");
        lblAMaterno.setBounds(25,304,150,25);
        lblAMaterno.setFont(new Font("Andale Mono", 1, 12));
        lblAMaterno.setForeground(new Color(255, 255, 255));
        add(lblAMaterno);

        txtAMaterno = new JTextField();
        txtAMaterno.setBounds(25,334,150,25);
        txtAMaterno.setBackground(new Color(244, 244, 244));
        txtAMaterno.setFont(new Font("Andale Mono", 1, 14));
        txtAMaterno.setForeground(new Color(255, 0, 0));
        add(txtAMaterno);

        lblDepartamento = new JLabel("Selecciona el departamento");
        lblDepartamento.setBounds(220,188,180,25);
        lblDepartamento.setFont(new Font("Andale Mono", 1, 12));
        lblDepartamento.setForeground(new Color(255, 255, 255));
        add(lblDepartamento);

        cmbDepartamento = new JComboBox();
        cmbDepartamento.setBounds(220,213,220,25);
        cmbDepartamento.setBackground(new Color(224, 224, 224));
        cmbDepartamento.setFont(new Font("Andale Mono", 1, 14));
        cmbDepartamento.setForeground(new Color(255, 0, 0));
        add(cmbDepartamento);
        cmbDepartamento.addItem("");
        cmbDepartamento.addItem("Atencion al cliente");
        cmbDepartamento.addItem("Departamento de logistica");
        cmbDepartamento.addItem("Departamento de gerencia");

        lblAntiguedad = new JLabel("Selecciona la antiguedad");
        lblAntiguedad.setBounds(220,248,180,25);
        lblAntiguedad.setFont(new Font("Andale Mono", 1, 12));
        lblAntiguedad.setForeground(new Color(255, 255, 255));
        add(lblAntiguedad);

        cmbAntiguedad = new JComboBox();
        cmbAntiguedad.setBounds(220,273,220,25);
        cmbAntiguedad.setBackground(new Color(224, 224, 224));
        cmbAntiguedad.setFont(new Font("Andale Mono", 1, 14));
        cmbAntiguedad.setForeground(new Color(255, 0, 0));
        add(cmbAntiguedad);
        cmbAntiguedad.addItem("");
        cmbAntiguedad.addItem("1 año de servicio");
        cmbAntiguedad.addItem("2 a 6 años de servicio");
        cmbAntiguedad.addItem("7 o mas años de servicio");

        lblResultado = new JLabel("Resultado del calculo");
        lblResultado.setBounds(220,307,180,25);
        lblResultado.setFont(new Font("Andale Mono", 1, 12));
        lblResultado.setForeground(new Color(255, 255, 255));
        add(lblResultado);

        area1 = new JTextArea();
        area1.setEditable(false);
        area1.setBackground(new Color(224, 224, 224));
        area1.setFont(new Font("Andale Mono", 1, 11));
        area1.setForeground(new Color(255, 0, 0));
        area1.setText("\n Aqui Aparece el resulatdo del calculo de las vacaciones.");
        scroll1 = new JScrollPane(area1);
        scroll1.setBounds(220,333,385,90);
        add(scroll1);

        lblFooter = new JLabel("©2018 The Coca-Cola Company | Todos los derechos reservados");
        lblFooter.setBounds(135,445,500,30);
        lblFooter.setFont(new Font("Andale Mono", 1, 12));
        lblFooter.setForeground(new Color(255, 255, 255));
        add(lblFooter);
    }
    public void actionPerformed(ActionEvent e ){

        if(e.getSource() == miCalculo){

            String NomTrabajador = txtNomTrabajador.getText();
            String AP = txtAPaterno.getText();
            String AM = txtAMaterno.getText();
            String Departamento = cmbDepartamento.getSelectedItem().toString();
            String Antiguedad = cmbAntiguedad.getSelectedItem().toString();

            if(NomTrabajador.equals("") || AP.equals("") || AM.equals("") || Departamento.equals("") || Antiguedad.equals("")){

                JOptionPane.showMessageDialog(null, "Debes llenar todos los campos.");
            }else {

                if(Departamento.equals("Atencion al cliente")){

                    if(Antiguedad.equals("1 año de servicio")){

                        area1.setText("\n   El trabajador "+ NomTrabajador +" "+ AP +" "+ AM +"\n   quien labora en "+ Departamento +" con "+ Antiguedad +"\n   Recibe 6 dias de vacaciones.");
                    } else if(Antiguedad.equals("2 a 6 años de servicio")){

                        area1.setText("\n   El trabajador "+ NomTrabajador +" "+ AP +" "+ AM +"\n   quien labora en "+ Departamento +" con "+ Antiguedad +"\n   Recibe 14 dias de vacaciones.");
                    } else if(Antiguedad.equals("7 o mas años de servicio")){

                        area1.setText("\n   El trabajador "+ NomTrabajador +" "+ AP +" "+ AM +"\n   quien labora en "+ Departamento +" con "+ Antiguedad +"\n   Recibe 20 dias de vacaciones.");
                    }
                }
                if(Departamento.equals("Departamento de logistica")){

                    if(Antiguedad.equals("1 año de servicio")){

                        area1.setText("\n   El trabajador "+ NomTrabajador +" "+ AP +" "+ AM +"\n   quien labora en "+ Departamento +" con "+ Antiguedad +"\n   Recibe 7 dias de vacaciones.");
                    } else if(Antiguedad.equals("2 a 6 años de servicio")){

                        area1.setText("\n   El trabajador "+ NomTrabajador +" "+ AP +" "+ AM +"\n   quien labora en "+ Departamento +" con "+ Antiguedad +"\n   Recibe 15 dias de vacaciones.");
                    } else if(Antiguedad.equals("7 o mas años de servicio")){

                        area1.setText("\n   El trabajador "+ NomTrabajador +" "+ AP +" "+ AM +"\n   quien labora en "+ Departamento +" con "+ Antiguedad +"\n   Recibe 22 dias de vacaciones.");
                    }
                }
                if(Departamento.equals("Departamento de gerencia")){

                    if(Antiguedad.equals("1 año de servicio")){

                        area1.setText("\n   El trabajador "+ NomTrabajador +" "+ AP +" "+ AM +"\n   quien labora en "+ Departamento +" con "+ Antiguedad +"\n   Recibe 10 dias de vacaciones.");
                    } else if(Antiguedad.equals("2 a 6 años de servicio")){

                        area1.setText("\n   El trabajador "+ NomTrabajador +" "+ AP +" "+ AM +"\n   quien labora en "+ Departamento +" con "+ Antiguedad +"\n   Recibe 20 dias de vacaciones.");
                    } else if(Antiguedad.equals("7 o mas años de servicio")){

                        area1.setText("\n   El trabajador "+ NomTrabajador +" "+ AP +" "+ AM +"\n   quien labora en "+ Departamento +" con "+ Antiguedad +"\n   Recibe 30 dias de vacaciones.");
                    }
                }
            }
        }
        if(e.getSource() == miRojo){

            getContentPane().setBackground(new Color(255, 0, 0));
        }
        if(e.getSource() == miMorado){

            getContentPane().setBackground(new Color(51, 0, 51));
        }
        if(e.getSource() == miNegro){

            getContentPane().setBackground(new Color(0, 0, 0));
        }
        if(e.getSource() == miNuevo){

            txtNomTrabajador.setText("");
            txtAPaterno.setText("");
            txtAMaterno.setText("");
            cmbDepartamento.setSelectedIndex(0);
            cmbAntiguedad.setSelectedIndex(0);
            area1.setText("\n   Aqui aparece el resultado del calculo de las vacaciones");
        }
        if(e.getSource() == miSalir){

            V42Bienvenida Bienvenida = new V42Bienvenida();
            Bienvenida.setBounds(0,0,350,450);
            Bienvenida.setVisible(true);
            Bienvenida.setResizable(false);
            Bienvenida.setLocationRelativeTo(null);
            this.setVisible(false);
        }
        if(e.getSource() == miCreador){

            JOptionPane.showMessageDialog(null, "Desarrollado por Aled Yefrey Aviles en colaboracion con la geekipedia de hernesto\n   https://www.facebook.com/alex.avilezochoa");
        }
    }
    public static void main(String args[]){

        V44Principal principal = new V44Principal();
        principal.setBounds(0,0,640,535);
        principal.setVisible(true);
        principal.setResizable(false);
        principal.setLocationRelativeTo(null);
    }
}