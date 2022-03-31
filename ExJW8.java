import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class ExJW8 extends JFrame implements ActionListener
{
JTextField T1;
JLabel L1;
JTextArea TA1,TA2;

JButton B1,B2,B3;
public static void main(String args[])
{
JFrame Janela = new ExJW8();
Janela.setVisible(true);
}
ExJW8()
{
setTitle("JTextArea - Meu Pequeno Editor de Texto");
setSize(480,280);
getContentPane().setLayout(new
FlowLayout(FlowLayout.CENTER));
T1 = new JTextField(22);
T1.addActionListener(this);
L1 = new JLabel("Aperte ENTER para Inserir o String");
B1 = new JButton ("Copia Tudo");
B1.addActionListener(this);
B2 = new JButton ("Copia Selecionado");
B2.addActionListener(this);
B3 = new JButton ("Limpa Tudo");
B3.addActionListener(this);
TA1 = new JTextArea (5,40);//5 linhas e 40 colunas do TextArea
TA2 = new JTextArea(5,40);
JScrollPane painel1 = new JScrollPane(TA1);
JScrollPane painel2 = new JScrollPane(TA2);
getContentPane().add(painel1);
getContentPane().add(T1);getContentPane().add(L1);
getContentPane().add(B1); getContentPane().add(B2);
getContentPane().add(B3);
getContentPane().add(painel2);
}

public void actionPerformed(ActionEvent e)
{
if(e.getSource()==T1) // ao pressionar ENTER no JTextField
{
TA1.append(T1.getText()); //append insere o conteudo do T1 no TA1
T1.setText(" ");
}
if(e.getSource()==B1) // copia o conteúdo de TA1 em TA2
TA2.setText(TA1.getText());
if(e.getSource()==B2) // copia selecionado
TA2.setText(TA1.getSelectedText());
if(e.getSource()==B3) // Limpa conteúdo TA1 e TA2
{ TA1.setText(" ");
TA2.setText(" ");
}
} }