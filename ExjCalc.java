//calc

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class ExjCalc extends JFrame implements ActionListener

{
JButton b1,b2,b3,b4, b5, b6;
JLabel l1, l2, l3;
JTextField t1, t2, t3;

ExjCalc()
{
setTitle("Calculadora");
setSize(350,90);
setLocation(50,50);

t1 = new JTextField ();
t2 = new JTextField ();
t3 = new JTextField ();
t3.setEditable(false);

l1 = new JLabel ("Numero 1: ");
l1.setForeground(Color.black);
l1.setFont(new Font("",Font.BOLD,14));
l2 = new JLabel ("Numero 2: ");
l2.setForeground(Color.black);
l2.setFont(new Font("",Font.BOLD,14));
l3 = new JLabel ("Resultado: ");
l1.setForeground(Color.black);
l1.setFont(new Font("",Font.BOLD,14));
b1 = new JButton ("*");
b1.addActionListener(this);
b2 = new JButton ("/");
b2.addActionListener(this);
b3 = new JButton ("Limpar");
b3.addActionListener(this);
b4 = new JButton ("+");
b4.addActionListener(this);
b5 = new JButton ("-");
b5.addActionListener(this);
b6 = new JButton ("Sair");
b6.addActionListener(this);

getContentPane().setBackground(Color.cyan);
getContentPane().setLayout(new GridLayout(3,3));
getContentPane().add(l1); getContentPane().add(t1); getContentPane().add(b1);
getContentPane().add(b4);
getContentPane().add(l2); getContentPane().add(t2); getContentPane().add(b2);
getContentPane().add(b5);
getContentPane().add(l3); getContentPane().add(t3); getContentPane().add(b3);
getContentPane().add(b6);

}

public void actionPerformed(ActionEvent e)
{
	float n1=0, n2=0, Resultado=0;
	if(e.getSource()==b3)
	{
		t1.setText("");t2.setText("");t3.setText("");
		return;
	}
	if(e.getSource()==b6)
	System.exit(0);
	n1 = Float.parseFloat(t1.getText());
	n2 = Float.parseFloat(t2.getText());
	if(e.getSource()==b1)
	Resultado=n1*n2;
	if(e.getSource()==b2)
	if (n2==0)
	{ t3.setText("Erro!Div por 0");
	return;
	} else {
	Resultado=n1/n2;}
	t3.setText(" "+Resultado);


if(e.getSource()==b4)

	Resultado=n1+n2;
	t3.setText(" " +Resultado);

if(e.getSource()==b5)
	Resultado=n1-n2;
	t3.setText(" " +Resultado);

}

public static void main(String args[])
  {
      JFrame Janela = new Porc();
     Janela.setVisible(true);
 }
}








