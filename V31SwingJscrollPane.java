import javax.swing.*;

public class V31SwingJscrollPane extends JFrame{

    private JScrollPane scroll1;
    private JTextField txt1;
    private JTextArea txtArea1;

    public V31SwingJscrollPane(){

        setLayout(null);

        txt1 = new JTextField();
        txt1.setBounds(10,10,200,30);
        add(txt1);

        txtArea1 = new JTextArea();
        scroll1 = new JScrollPane(txtArea1);
        scroll1.setBounds(10,50,400,300);
        add(scroll1);
    }
    public static void main(String args[]){

        V31SwingJscrollPane Formulario1 = new V31SwingJscrollPane();
        Formulario1.setBounds(0,0,540,400);
        Formulario1.setVisible(true);
        Formulario1.setLocationRelativeTo(null);
        Formulario1.setResizable(false);
    }
}