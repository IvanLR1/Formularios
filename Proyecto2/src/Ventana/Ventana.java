
package Ventana;


import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class Ventana extends JFrame {
JPanel panel1;
JPanel panel2;
JPanel panel3;
public Ventana(){
    
    
setSize(1200,700);
setResizable(false);
setDefaultCloseOperation(EXIT_ON_CLOSE);
setLocationRelativeTo(null);

//Componentes

Paneles();
Etiquetas1();
Fields1();
Botones1();
FieldScroll();
Etiquetas2();
Fields2();
Botones2();
Botones3();

//Tablas

JTable tabla = new JTable(Filas, Columnas);
JScrollPane scroll = new JScrollPane(tabla);
tabla.setBounds(80, 80, 1000, 100);
panel1.add(tabla);
JTable tabla2 = new JTable(Filas2, Columnas2);
JScrollPane scroll2 = new JScrollPane(tabla2);
tabla2.setBounds(50, 60, 400, 100);
panel3.add(tabla2);
}


//Paneles

private void Paneles(){
JPanel contenedor = new JPanel();
this.getContentPane().add(contenedor);
panel1 = new JPanel();
panel2 = new JPanel();
panel3 = new JPanel();
contenedor.setLayout(null);
contenedor.add(panel1);
contenedor.add(panel2);
contenedor.add(panel3);
panel1.setBounds(0, 0, 1194, 335);
panel2.setBounds(0, 337, 700, 400);
panel3.setBounds(702, 337, 490, 400);
panel1.setBorder(new LineBorder(Color.green));
panel2.setBorder(new LineBorder(Color.green));
panel3.setBorder(new LineBorder(Color.green));
panel1.setBackground(new Color(245, 245, 245));
panel2.setBackground(new Color(245, 245, 245));
panel3.setBackground(new Color(245, 245, 245));
panel1.setLayout(null);
panel2.setLayout(null);
panel3.setLayout(null);
}

//Etiquetas1

private void Etiquetas1(){
JLabel et1 = new JLabel();
et1.setText("Estatus de Creacion:");
et1.setBounds(30, 10, 200, 20);
panel1.add(et1); 
JLabel et2 = new JLabel();
et2.setText("Clave Dependencia:");
et2.setBounds(200, 10, 200, 20);
panel1.add(et2);
JLabel et3 = new JLabel();
et3.setText("Clave Funcion:");
et3.setBounds(400, 10, 200, 20);
panel1.add(et3);  
JLabel et4 = new JLabel();
et4.setText("Elaboro:");
et4.setBounds(295, 210, 200, 20);
panel1.add(et4);  
JLabel et5 = new JLabel();
et5.setText("Reviso:");
et5.setBounds(295, 240, 200, 20);
panel1.add(et5);  
JLabel et6 = new JLabel();
et6.setText("Autorizo:");
et6.setBounds(295, 270, 200, 20);
panel1.add(et6);
JLabel et7 = new JLabel();
et7.setText("Objetivo:");
et7.setBounds(295, 300, 200, 20);
panel1.add(et7);
}

//Etiquetas2

private void Etiquetas2(){
JLabel et8 = new JLabel();
et8.setText("Estatus:");
et8.setBounds(50, 30, 100, 20);
panel2.add(et8);
JLabel et9 = new JLabel();
et9.setText("ClaveDep:");
et9.setBounds(150, 30, 100, 20);
panel2.add(et9);
JLabel et10 = new JLabel();
et10.setText("ClvFun:");
et10.setBounds(270, 30, 100, 20);
panel2.add(et10);
JLabel et11 = new JLabel();
et11.setText("Clave Accion:");
et11.setBounds(20, 60, 200, 20);
panel2.add(et11);
JLabel et12 = new JLabel();
et12.setText("Descripcion:");
et12.setBounds(180, 60, 100, 20);
panel2.add(et12);
JLabel et13 = new JLabel();
et13.setText("Unidad de Medida:");
et13.setBounds(5, 90, 200, 20);
panel2.add(et13);
JLabel et14 = new JLabel();
et14.setText("% de Poblacion Beneficiada:");
et14.setBounds(350, 90, 250, 20);
panel2.add(et14);
JLabel et15 = new JLabel();
et15.setText("1er Trim:");
et15.setBounds(10, 150, 70, 20);
panel2.add(et15);
JLabel et16 = new JLabel();
et16.setText("2do Trim:");
et16.setBounds(10, 170, 70, 20);
panel2.add(et16);
JLabel et17 = new JLabel();
et17.setText("3er Trim:");
et17.setBounds(10, 190, 70, 20);
panel2.add(et17);
JLabel et18 = new JLabel();
et18.setText("4to Trim:");
et18.setBounds(10, 210, 70, 20);
panel2.add(et18);
JLabel et19 = new JLabel();
et19.setText("Tot Anu:");
et19.setBounds(10, 230, 70, 20);
panel2.add(et19);
JLabel et20 = new JLabel();
et20.setText("Cantidad Programada:");
et20.setBounds(70, 130, 200, 20);
panel2.add(et20);
JLabel et21 = new JLabel();
et21.setText("Amp o Red:");
et21.setBounds(260, 130, 200, 20);
panel2.add(et21);
JLabel et22 = new JLabel();
et22.setText("Cantidad Modificada:");
et22.setBounds(400, 130, 200, 20);
panel2.add(et22);
JLabel et23 = new JLabel();
et23.setText("Avance:");
et23.setBounds(590, 130, 100, 20);
panel2.add(et23);
}

//Fields1

private void Fields1(){
JTextField t1 = new JTextField();
t1.setBounds(150, 10, 20, 20);
panel1.add(t1);
JTextField t2 = new JTextField();
t2.setBounds(320, 10, 50, 20);
panel1.add(t2);
JTextField t3 = new JTextField();
t3.setBounds(490, 10, 70, 20);
panel1.add(t3);
JTextField t4 = new JTextField();
t4.setBounds(400, 180, 60, 20);
t4.setText("Nombre");
t4.setEditable(false);
panel1.add(t4);
JTextField t5 = new JTextField();
t5.setBounds(700, 180, 60, 20);
t5.setText("Cargo");
t5.setEditable(false);
panel1.add(t5);
JTextField t6 = new JTextField();
t6.setBounds(350, 210, 200, 20);
panel1.add(t6);
JTextField t7 = new JTextField();
t7.setBounds(650, 210, 200, 20);
panel1.add(t7);
JTextField t8 = new JTextField();
t8.setBounds(350, 240, 200, 20);
panel1.add(t8);
JTextField t9 = new JTextField();
t9.setBounds(650, 240, 200, 20);
panel1.add(t9);
JTextField t10 = new JTextField();
t10.setBounds(350, 270, 200, 20);
panel1.add(t10);
JTextField t11 = new JTextField();
t11.setBounds(650, 270, 200, 20);
panel1.add(t11);
}

//Field2

private void Fields2(){
JTextField t12 = new JTextField();
t12.setBounds(210, 30, 60, 20);
panel2.add(t12);
JTextField t13 = new JTextField();
t13.setBounds(315, 30, 90, 20);
panel2.add(t13);
JTextField t14 = new JTextField();
t14.setBounds(100, 60, 60, 20);
panel2.add(t14);
JTextField t15 = new JTextField();
t15.setBounds(260, 60, 300, 20);
panel2.add(t15);
JTextField t16 = new JTextField();
t16.setBounds(110, 90, 150, 25);
panel2.add(t16);
JTextField t17 = new JTextField();
t17.setBounds(510, 90, 40, 20);
panel2.add(t17);
JTextField t18 = new JTextField();
t18.setBounds(65, 150, 150, 20);
panel2.add(t18);
JTextField t19 = new JTextField();
t19.setBounds(225, 150, 150, 20);
panel2.add(t19);
JTextField t20 = new JTextField();
t20.setBounds(385, 150, 150, 20);
panel2.add(t20);
JTextField t21 = new JTextField();
t21.setBounds(545, 150, 150, 20);
panel2.add(t21);
JTextField t22 = new JTextField();
t22.setBounds(65, 170, 150, 20);
panel2.add(t22);
JTextField t23 = new JTextField();
t23.setBounds(225, 170, 150, 20);
panel2.add(t23);
JTextField t24 = new JTextField();
t24.setBounds(385, 170, 150, 20);
panel2.add(t24);
JTextField t25 = new JTextField();
t25.setBounds(545, 170, 150, 20);
panel2.add(t25);
JTextField t26 = new JTextField();
t26.setBounds(65, 190, 150, 20);
panel2.add(t26);
JTextField t27 = new JTextField();
t27.setBounds(225, 190, 150, 20);
panel2.add(t27);
JTextField t28 = new JTextField();
t28.setBounds(385, 190, 150, 20);
panel2.add(t28);
JTextField t29 = new JTextField();
t29.setBounds(545, 190, 150, 20);
panel2.add(t29);
JTextField t30 = new JTextField();
t30.setBounds(65, 210, 150, 20);
panel2.add(t30);
JTextField t31 = new JTextField();
t31.setBounds(225, 210, 150, 20);
panel2.add(t31);
JTextField t32 = new JTextField();
t32.setBounds(385, 210, 150, 20);
panel2.add(t32);
JTextField t33 = new JTextField();
t33.setBounds(545, 210, 150, 20);
panel2.add(t33);
JTextField t34 = new JTextField();
t34.setBounds(65, 230, 150, 20);
panel2.add(t34);
JTextField t35 = new JTextField();
t35.setBounds(225, 230, 150, 20);
panel2.add(t35);
JTextField t36 = new JTextField();
t36.setBounds(385, 230, 150, 20);
panel2.add(t36);
JTextField t37 = new JTextField();
t37.setBounds(545, 230, 150, 20);
panel2.add(t37);
}

//FieldScroll

private void FieldScroll(){
JTextField ts1 = new JTextField();
JScrollPane scroll1 = new JScrollPane(ts1);
ts1.setBounds(350, 300, 500, 30);
panel1.add(ts1);
}

//Button1

private void Botones1(){
JButton bt1 = new JButton();
bt1.setText("");
bt1.setBounds(1030, 10, 70, 40);
panel1.add(bt1);
JButton bt2 = new JButton();
bt2.setText("");
bt2.setBounds(1120, 10, 70, 40);
panel1.add(bt2);
JButton bt3 = new JButton();
bt3.setText("Aplicar");
bt3.setBounds(150, 30, 100, 20);
panel1.add(bt3);
JButton bt4 = new JButton();
bt4.setText("Inicializar");
bt4.setBounds(340, 30, 100, 20);
panel1.add(bt4);
JButton bt5 = new JButton();
bt5.setText("");
bt5.setBounds(1125, 60, 60, 20);
panel1.add(bt5);
JButton bt6 = new JButton();
bt6.setText("");
bt6.setBounds(1125, 90, 60, 20);
panel1.add(bt6);
JButton bt7 = new JButton();
bt7.setText("");
bt7.setBounds(1125, 120, 60, 20);
panel1.add(bt7);
JButton bt8 = new JButton();
bt8.setText("");
bt8.setBounds(1125, 150, 60, 20);
panel1.add(bt8);
JButton bt9 = new JButton();
bt9.setText("Salvar");
bt9.setFont(new Font("arial",2,8));
bt9.setBounds(1120, 190, 70, 30);
panel1.add(bt9);
JButton bt10 = new JButton();
bt10.setText("Deshacer");
bt10.setFont(new Font("arial",2,8));
bt10.setBounds(1120, 225, 70, 30);
panel1.add(bt10);
JButton bt11 = new JButton();
bt11.setText("Cancelar");
bt11.setFont(new Font("arial",2,8));
bt11.setBounds(1120, 265, 70, 30);
panel1.add(bt11);
}

//Button2

private void Botones2(){
JButton bt17 = new JButton();
bt17.setText("Salvar");
bt17.setFont(new Font("arial",2,8));
bt17.setBounds(70, 300, 70, 20);
panel2.add(bt17);
JButton bt18 = new JButton();
bt18.setText("Deshacer");
bt18.setFont(new Font("arial",2,8));
bt18.setBounds(150, 300, 70, 20);
panel2.add(bt18);
JButton bt19 = new JButton();
bt19.setText("Adiccionar");
bt19.setFont(new Font("arial",2,8));
bt19.setBounds(230, 300, 70, 20);
panel2.add(bt19);
JButton bt20 = new JButton();
bt20.setText("Borrar");
bt20.setFont(new Font("arial",2,8));
bt20.setBounds(310, 300, 70, 20);
panel2.add(bt20);
JButton bt21 = new JButton();
bt21.setText("Cancelar");
bt21.setFont(new Font("arial",2,8));
bt21.setBounds(390, 300, 70, 20);
panel2.add(bt21);
JButton bt22 = new JButton();
bt22.setText("");
bt22.setBounds(70, 270, 70, 20);
panel2.add(bt22);
JButton bt23 = new JButton();
bt23.setText("");
bt23.setBounds(150, 270, 70, 20);
panel2.add(bt23);
JButton bt24 = new JButton();
bt24.setText("");
bt24.setBounds(230, 270, 70, 20);
panel2.add(bt24);
JButton bt25 = new JButton();
bt25.setText("");
bt25.setBounds(310, 270, 70, 20);
panel2.add(bt25);
}

//Button3

private void Botones3(){
JButton bt12 = new JButton();
bt12.setText("Salvar");
bt12.setFont(new Font("arial",2,8));
bt12.setBounds(50, 250, 70, 20);
panel3.add(bt12);
JButton bt13 = new JButton();
bt13.setText("Deshacer");
bt13.setFont(new Font("arial",2,8));
bt13.setBounds(130, 250, 70, 20);
panel3.add(bt13);
JButton bt14 = new JButton();
bt14.setText("Adiccionar");
bt14.setFont(new Font("arial",2,8));
bt14.setBounds(210, 250, 70, 20);
panel3.add(bt14);
JButton bt15 = new JButton();
bt15.setText("Borrar");
bt15.setFont(new Font("arial",2,8));
bt15.setBounds(290, 250, 70, 20);
panel3.add(bt15);
JButton bt16 = new JButton();
bt16.setText("Cancelar");
bt16.setFont(new Font("arial",2,8));
bt16.setBounds(370, 250, 70, 20);
panel3.add(bt16);
}
  
//Tablas    
    
    private String [] Columnas={"St","FFuSuPrSpPy","Nombre proyecto","Nombre Dependencia"};
    private Object [][] Filas={
        {"","","","",""},
        {"","","","",""},
        {"","","","",""},
        {"","","","",""},
        {"","","","",""},
        {"","","","",""}
    };
        private String [] Columnas2={"No Loc","Clave Igecem","Nombre Localidad"};
    private Object [][] Filas2={
        {"","","","",""},
        {"","","","",""},
        {"","","","",""},
        {"","","","",""},
        {"","","","",""},
        {"","","","",""}
    };

    
}
