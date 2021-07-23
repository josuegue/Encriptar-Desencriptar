/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encriptador;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIOTC
 */
public class Encriptador {
    
   public static Scanner read= new Scanner (System.in);
    public static void main(String[] args) {
        FuncionPrincipal();
      
    }
    public static void FuncionPrincipal(){
        String cadena= JOptionPane.showInputDialog("Ingresa un texto: ");
        String opcion = JOptionPane.showInputDialog("1. Desencriptar mensaje\n2. Encriptar mensaje\nIngrese su opcion: ");
        int op= Integer.parseInt(opcion);
       
        switch (op){
            case 1:
                Desencriptar(cadena);
                break;
            case 2: 
                Encriptador(cadena);
                break;
            default:
                JOptionPane.showMessageDialog(null,"Lo siento has seleccionado una opcion fuera de rango.\n¡Intenta nuevamenta!\n");
                break;
            
        }
    }
    public static void Encriptador(String cadena){
        int llave = 3;
        String resultado = " ";
        int codificar=0;
        
        for (int i=0; i<cadena.length(); i++){
            codificar = (int)cadena.charAt(i);
            codificar += llave;
            char caracter=(char) codificar;
            resultado+=caracter;
            //System.out.println(resultado);           
        }
         JOptionPane.showMessageDialog(null, resultado);
    }
    
    public static void Desencriptar(String cadena){
        int llave = 3; 
        String resultado = " ";
        int codificar=0;
        
        for (int i=0; i<cadena.length(); i++){
            codificar = (int)cadena.charAt(i);
            codificar -= llave;
            char caracter=(char) codificar;
            resultado+=caracter;
                      
        }
        
        JOptionPane.showMessageDialog(null, resultado);
        
    }
}
