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
        Scanner lea = new Scanner (System.in);
        
        int n1, n2, s;
        
        System.out.println("ingrese numero uno");
        n1=Integer.parseInt(lea.next());
        System.out.println("ingrese numero dos");
        n2=Integer.parseInt(lea.next());
        s=n1+n2;
        System.out.println("el resultado es: "+s);
        
    }
}
