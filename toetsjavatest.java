/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Toets;

    import java.util.Random;
    import java.util.Scanner;
    import javax.swing.JOptionPane;
/**
 *
 * @author marco
 */
public class toetsjavatest {
    
    
    public static void main(String args[]) {
        java mijnJava = new java();
        Scanner in = new Scanner(System.in);
        
        System.out.println("Geef twee getallen! :)");
        String inputGetal1 = JOptionPane.showInputDialog("Geef het eerste getal!");
        String inputGetal2 = JOptionPane.showInputDialog("Geef het tweede getal!");
        int getal1 = Integer.valueOf(inputGetal1);
        int getal2 = Integer.valueOf(inputGetal2);
        System.out.println("De som van de getallen is "+mijnJava.berekening(getal1,getal2));
        
        System.out.println("Geef je naam");
        String naam = in.nextLine();
        System.out.println(mijnJava.naam(naam));
        
        System.out.println("Steen papier schaar, Typ 1 2 of 3");
        int getal = in.nextInt();
        System.out.println(mijnJava.steenPapierSchaar(getal));

       
  
        System.out.println("Type een cijfer in");
        int cijfer = in.nextInt();
        int cijfer2 = in.nextInt();
        System.out.println(mijnJava.welkeisgroot(cijfer, cijfer2));
        
    }
}
