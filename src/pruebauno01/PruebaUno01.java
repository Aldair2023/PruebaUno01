/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebauno01;

import java.util.Scanner;

/**
 *
 * @author aldair
 */
public class PruebaUno01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Scanner lea = new Scanner (System.in);
        
        int n1, n2, s;
        
        System.out.println("ingrese numero uno");
        n1=Integer.parseInt(lea.next());
        System.out.println("ingrese numero dos");
        n2=Integer.parseInt(lea.next());
        s=n1+n2;
        System.out.println("el resultado es: "+s);
    
        */
        
        
    }
    public static void promedio(){
         Scanner lea = new Scanner (System.in);
        double n1, n2, n3, p;
         
         System.out.println("ingrese nota 1");
         n1=Double.parseDouble(lea.next());
         System.out.println("ingrese nota 2");
         n2=Double.parseDouble(lea.next());
         System.out.println("ingrese nota 3");
         n3=Double.parseDouble(lea.next());
         p=(n1+n2+n3)/3;
         System.out.println("el promedio resultane es: "+p);
         
    /*if(p < 3){
                System.out.println("Lo siento Reprobo");
            }else {
                System.out.println("Felicidades!!! Aprobo");
            }       
*/
    
    }
    
}    

