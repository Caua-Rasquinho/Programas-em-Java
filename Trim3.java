//AtividadeTrim3

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class Trim3 extends JFrame implements ActionListener
{
    JTextField TF1, TF2, TF3;
    JLabel L1, L2, L3;
    JButton B1, B2, B3;

    public static void main(String args[])
    {
            JFrame Janela = new Trim3();
            Janela.setVisible(true);
    }

Trim3()
{
    setTitle("Concatenação de String");
    setSize(300, 200);
    setLocation(400, 150);
    setResizable(true);

    getContentPane().setBackground(Color.cyan);
    getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER));

    L1 = new JLabel("Digite seu primeiro nome");
    L1.setForeground(Color.red);
    L2 = new JLabel("Digite seu sobrenome");
    L2.setForeground(Color.blue);
    L3 = new JLabel("Seu nome completo");
    L3.setForeground(Color.black);

    TF1 = new JTextField(40);

    TF2 = new JTextField(40);

    TF3 = new JTextField(40);

    B1 = new JButton("Concatenar");
    B1.addActionListener(this);

    B2 = new JButton("Limpar");
    B2.addActionListener(this);

    B3 = new JButton("Sair");
    B3.addActionListener(this);

    getContentPane().add(L1); getContentPane().add(TF1);
    getContentPane().add(L2); getContentPane().add(TF2);
    getContentPane().add(L3); getContentPane().add(TF3);
    getContentPane().add(B1);
    getContentPane().add(B2);
    getContentPane().add(B3);
}
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==B1)
        {
        String P1, P2, PC;
        P1 = TF1.getText();
        P2 = TF2.getText();

        PC = P1 + " " + P2;

        TF3.setText("" + PC);
        }

        if(e.getSource()==B2)
        {
        TF1.setText(" ");
        TF2.setText(" ");
        TF3.setText(" ");
        return;
        }

        if(e.getSource()==B3)
        System.exit(0);

    }
    }