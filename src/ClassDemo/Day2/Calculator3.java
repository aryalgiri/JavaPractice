

package ClassDemo.Day2;

import javax.swing.*;

public class Calculator3 {
    public static void main(String[] args) {
        int a= Integer.parseInt(JOptionPane.showInputDialog("Enter the first integer"));
        int b=Integer.parseInt(JOptionPane.showInputDialog("Enter the second number"));
        int add=a+b;
        int sub=a-b;
        int mul=a*b;
        int div =a/b;
        JOptionPane.showMessageDialog(null,a + " + " + b + " = "+ add );
        JOptionPane.showMessageDialog(null, a + " - " + b + " = "+ sub);
        JOptionPane.showMessageDialog(null,a + " * " + b + " = "+ mul );
        JOptionPane.showMessageDialog(null, a + " / " + b + " = "+ div);
    }
}

