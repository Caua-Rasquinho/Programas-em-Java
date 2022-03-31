//exjw5

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Exjw5 extends JFrame implements ItemListener
{
JLabel l1;
JCheckBox c1, c2;
static int negrito=0, italico=0;

public static void main(String args[])
{
JFrame janela = new Exjw5();
janela.setVisible(true);

}


Exjw5()
{
	getContentPane().setBackground(new Color(180,180,180));;
	setTitle("ComboBox-JCheckBox");
	setSize(400,150);
	setLocation(50,50);
	getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER));

	l1 = new JLabel("Fito-2Sistemas/Internet- 7 Cauã Rasquinho de Queiroz Cruz");
	l1.setForeground(Color.white);
	l1.setFont(new Font("Arial", Font.PLAIN,20));
	c1 = new JCheckBox ("Negrito");
	c1.setBackground(new Color(180,180,180));
	c1.addItemListener(this);
	c2 = new JCheckBox("Italico");
	c2.setBackground(new Color(180,180,180));
	c2.addItemListener(this);

	getContentPane().add(l1);
	getContentPane().add(c1);
	getContentPane().add(c2);
}

public void itemStateChanged(ItemEvent e)
{
	if(e.getSource()==c1)
	{
		l1.setForeground(Color.green);
		if(e.getStateChange()==ItemEvent.SELECTED)
		negrito=Font.BOLD;
		else
		italico=Font.PLAIN;
	}
	if(e.getSource()==c2)
	{
		l1.setForeground(Color.yellow);
		if(e.getStateChange()==ItemEvent.SELECTED)
		italico=Font.ITALIC;
		else
		italico=Font.PLAIN;
	}
	l1.setFont(new Font("Arial", negrito+italico,20));

}}