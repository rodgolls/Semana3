import javax.swing.*;
public class SomaStrings
{
   public static void main(String args[])
   {
      String a = JOptionPane.showInputDialog("Digite uma palavra");
      String b = JOptionPane.showInputDialog("DIgite mais uma palavra");
      String c = JOptionPane.showInputDialog("Digite a terceira palavra");
      int n = a.length();
      int o = b.length();
      int p = c.length();
      int res = n + o + p;
      String res2 = "Essa é a quantidade de caracteres que foram somados:" + res;
      JOptionPane.showMessageDialog(null,res2);
   }
}