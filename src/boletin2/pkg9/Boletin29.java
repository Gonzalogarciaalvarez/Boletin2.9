/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2.pkg9;

import java.util.Scanner;

/**
 *
 * @author ggarciaalvarez
 */
public class Boletin29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int D, C, V, S, N;
        Scanner obx1 = new Scanner (System.in);
        D = obx1.nextInt();
        C=D/100;
        V=(D-(C*100))/20;
        S=(D-(C*100)-(V*20))/5;
        N=((D-(C*100)-(V*20))-(S*5));
        System.out.println("Con "+D+" euros, temos:");
        System.out.println(C+" billetes de 100");
        System.out.println(V+" billetes de 20");
        System.out.println(S+" billetes de 5");
        System.out.println(N+" monedas de 1");
        //Gon is a fag
        System.out.println("Gon is a fag");
    }
    
}
