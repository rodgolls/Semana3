import javax.swing.*;
public class ConversaoDias
{
   public static void main(String [] args)
   {
      int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade"));
      int dias = idade * 365;
      String res = "Os seus dias na terra de acordo com sua idade são :" + " " + dias;
      JOptionPane.showMessageDialog(null,res);
   }
}