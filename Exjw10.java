//exjw10

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class Exjw10 extends JFrame implements ActionListener
{
JLabel l1;
JButton b1;

public static void main(String args[])
{
JFrame janela = new Exjw10();
janela.setVisible(true);
}

Exjw10()
{
	setBackground(new Color(100,100,100));
	setTitle("Caixa de Entrada");
	setSize(400,180);
	getContentPane().setLayout(new GridLayout(2,1));
	l1 = new JLabel(" ", JLabel.CENTER);
	l1.setForeground(Color.BLUE);
	b1 = new JButton("Login");
	b1.addActionListener(this);
	b1.setToolTipText("Clique aqui para entrar no sistema");
	b1.setMnemonic(KeyEvent.VK_L);
	getContentPane().add(b1);
	getContentPane().add(l1);
}

public void actionPerformed(ActionEvent e)
{
	String resp=JOptionPane.showInputDialog(null, "Qual seu nome", "Login no Sistema", JOptionPane.QUESTION_MESSAGE);
	if(resp==null||resp.equals(""))
	l1.setText("Favor digitar o campo");
	else
	l1.setText("Seja bem vindo"+resp+ "!!!");
}}