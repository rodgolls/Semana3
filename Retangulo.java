import javax.swing.*;
public class Retangulo
{
   public static void main (String [] args)
   {
      int a = Integer.parseInt(JOptionPane.showInputDialog("Digite a altura positiva do seu retangulo"));
      int b = Integer.parseInt(JOptionPane.showInputDialog("Digite a base positiva do seu retangulo"));
      int res = a * b;
      String c = "A área do seu retangulo é :" + " " + res;
      JOptionPane.showMessageDialog(null,c);
   }
}