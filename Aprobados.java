/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aprobados;

import javax.swing.JOptionPane;

/**
 *
 * @author Jose
 */

public class Aprobados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
        int num;
        int aprobados=0;
        int desaprobados=0;
        
        num=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el tamaño del arreglo"));
        
            int[]notas=new int[num];
     
        for (int i = 0; i < notas.length; i++) {
            do{
            notas[i]=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor["+i+"]"));
            }while(notas[i] > 20 || notas[i]<0);
            
             if (notas[i]>=11) {
                 aprobados++;
        }
             else desaprobados++;
    }
        
       JOptionPane.showMessageDialog(null, "El numero de aprobados es:  "+aprobados);
       JOptionPane.showMessageDialog(null, "El número de desaprobados es: "+desaprobados);
       
    }
}