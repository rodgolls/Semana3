import javax.swing.*;
public class Expoente
{
   public static void main (String args[])
   {
      int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero que voce quer elevar ao quadrado"));
      int b = 2;
      double res = Math.pow(a,b);
      String c = "O valor" + " " + a + " " + "elevado ao quadrado é igual a :" + res;
      JOptionPane.showMessageDialog(null,c); 
   }
}