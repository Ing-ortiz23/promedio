package edu.universidad.promedio;

import javax.swing.JOptionPane;

public class App 
{
    public static void main( String[] args )
    {
        int num1;
        int num2;
        int num3;
        int num4;
        int num5;
        double prom;
        
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Introducce numero1"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Introducce numero2"));
        num3 = Integer.parseInt(JOptionPane.showInputDialog("Introducce numero3"));
        num4 = Integer.parseInt(JOptionPane.showInputDialog("Introducce numero4"));
        num5 = Integer.parseInt(JOptionPane.showInputDialog("Introducce numero5"));
        
        prom = (num1+num2+num3+num4+num5)/5;
        
        String resultado = "El promedio es: " + prom;
        JOptionPane.showMessageDialog(null, resultado);
    }
}
