import javax.swing.JOptionPane;
public class AreaTriangulo{
   public static void main (String [] args){
      int base = Integer.parseInt(JOptionPane.showInputDialog("Digite a base do triangulo :"));
      int altura = Integer.parseInt(JOptionPane.showInputDialog("Digite a altura do triangulo :"));
      int area = ((base*altura)/2);
      
      JOptionPane.showMessageDialog (null,"Area do Triangulo  " + area);
    
   }
}