//porcentagem

 import java.awt.*;
 import javax.swing.*;
 import java.awt.event.*;

 class Porc extends JFrame implements ActionListener
 {
 JButton b1, b2, b3;
 JTextField t1, t2, t3;
 JLabel l1, l2, l3;

 Porc()
 {
	  setTitle("Calculadora de Porcentagem");
	  setSize(300,250);
	  setLocation(500,300);
	  setResizable(true);
      getContentPane().setBackground(Color.cyan);

      t1 = new JTextField ();
	  t2 = new JTextField ();
	  t3 = new JTextField ();
      t3.setEditable(false);

      l1 = new JLabel("Valor Total: ");
      l1.setForeground(Color.black);
      l1.setFont(new Font("",Font.BOLD,14));
      l2 = new JLabel("Quantos %: ");
      l2.setForeground(Color.red);
      l2.setFont(new Font("",Font.BOLD,14));
      l3 = new JLabel ("Valor Final %");
      l3.setForeground(Color.blue);
      l3.setFont(new Font("",Font.BOLD,14));

      b1 = new JButton("%");
      b1.addActionListener(this);
      b2 = new JButton("Limpar");
      b2.addActionListener(this);
      b3 = new JButton("Sair");
      b3.addActionListener(this);

      getContentPane().setBackground(Color.cyan);
      getContentPane().setLayout(new GridLayout(3,3));
      getContentPane().add(l1); getContentPane().add(t1); getContentPane().add(b1);
      getContentPane().add(l2); getContentPane().add(t2); getContentPane().add(b2);
      getContentPane().add(l3); getContentPane().add(t3); getContentPane().add(b3);

  }

public void actionPerformed(ActionEvent e)
{
  float n1=0, n2=0, resultado=0;

  if(e.getSource()==b3)
		System.exit(0);

  if(e.getSource()==b2)
  	{
  		t1.setText("");t2.setText("");t3.setText("");
  		return;
	}

		n1 = Float.parseFloat(t1.getText());
	    n2 = Float.parseFloat(t2.getText());
	    if(e.getSource()==b1)
	    resultado=n1/100*n2;
	    t3.setText(" " +resultado);

	    }

		public static void main(String args[])
		  {
		      JFrame Janela = new Porc();
		     Janela.setVisible(true);
		 }
}











