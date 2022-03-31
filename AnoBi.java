//anobi

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class AnoBi extends JFrame implements ActionListener
{
    JLabel L1, L2;
    JButton B1, B2, B3;
    JTextField TF1, TF2;

AnoBi()
{
    setTitle("Quer verificar se o ano é bissexto?");
    setSize(300, 200);
    setLocation(400, 150);
    setResizable(true);

    getContentPane().setBackground(Color.cyan);

    L1 = new JLabel("Digite o ano: ");

    TF1 = new JTextField(10);

    TF2 = new JTextField(10);
    TF2.setEditable(false);

    B1 = new JButton("Verificar Ano");
    B1.addActionListener(this);

    B2 = new JButton("Limpar");
    B2.addActionListener(this);

    B3 = new JButton("Sair");
    B3.addActionListener(this);

    getContentPane().setLayout(new GridLayout(2, 3));

    getContentPane().add(L1); getContentPane().add(TF1);getContentPane().add(TF2);
    getContentPane().add(B1); getContentPane().add(B2); getContentPane().add(B3);
}

public static void main(String args[])
{
    JFrame Janela = new AnoBi();
    Janela.setVisible(true);
}

public void actionPerformed(ActionEvent e)
{
    if(e.getSource()==B3)
        System.exit(0);

    if(e.getSource()==B2)
        {
            TF1.setText("");
            TF2.setText("");
            return;
    }

    int ano = Integer.parseInt(TF1.getText());

    if(e.getSource()==B1)
    {

         if((ano % 4 == 0) || (ano % 400 == 0) && (ano % 100 != 0))
         {
             TF2.setText("O Ano é Bissexto!");
             TF2.setForeground(Color.blue);
         }
         else
         {
             TF2.setText("O Ano não é Bissexto!");
             TF2.setForeground(Color.red);

         }
        }
}
}
