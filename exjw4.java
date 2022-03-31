//exjw4

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;

class exjw4 extends JFrame implements ListSelectionListener, ActionListener
{
	JLabel l1;
	JTextField t1;
	JList lista;
	JButton b1, b2, b3;
	DefaultListModel listmodel;

		 public static void main(String args[])
		  {
		      JFrame Janela = new exjw4();
		     Janela.setVisible(true);
		 }

		exjw4()
		{
			setTitle("JList box - Fito");
			setSize(200,250);
			setLocation(300,100);

			t1 = new JTextField();
			t1.addActionListener(this);

			l1 = new JLabel("Sem Selecao: ");
			l1.setForeground(Color.black);

			b1 = new JButton("Quantidade de Itens: ");
			b1.addActionListener(this);
			b2 = new JButton("Indice Selecionado: ");
			b2.addActionListener(this);
			b3 = new JButton("Remover Item: ");
			b3.addActionListener(this);

			listmodel = new DefaultListModel();
			listmodel.addElement("Ensino Medio Basico");
			listmodel.addElement("Tecnico em Administração");
			listmodel.addElement(" Tecnico em Construção Civil");
			listmodel.addElement("Tecnico em Des. Sistemas");
			listmodel.addElement("Tecnico em Internet");
			lista = new JList(listmodel);
			lista.addListSelectionListener(this);

			JScrollPane painel = new JScrollPane(lista);
			getContentPane().setLayout(new GridLayout(6,2));
			getContentPane().add(l1);
			getContentPane().add(t1);
			getContentPane().add(painel);
			getContentPane().add(b1);
			getContentPane().add(b2);
			getContentPane().add(b3);
			       }

			       public void actionPerformed(ActionEvent e)
			        {
			         if(e.getSource()==t1)
			        {
			           listmodel.addElement(t1.getText());
			          t1.setText(" ");
			        }
			         if(e.getSource()==b1)
			          t1.setText("Quantidade: " + listmodel.getSize());
			         if(e.getSource()==b2)
			          t1.setText("Indice Selecionado: "+ lista.getSelectedIndex());
			         if(e.getSource()==b3)
			           {
			          t1.setText("Removido: " + lista.getSelectedValue());
			           listmodel.remove(0);
			        }
			       }

			      public void valueChanged(ListSelectionEvent e)
			    {
			      l1.setText("Selecionado: " + lista.getSelectedValue());
			      }
    }



