/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Toets;
    import java.util.Random;
    
/**
 *
 * @author marco
 */
public class java {
    
public int welkeisgroot (int a, int b) {
    if (a < b) {
        return b;
    }   else {
            return a;
    }
}

   public String naam(String naam) {
        int stringLength = naam.length(); // check de string length
        if (stringLength <= 3) {            // als het kleiner is dan 3 rurn naam is te klein
            return "naam is te klein";
        }
        
        String garix = naam.substring(0, naam.length() - 2) + "x"; // checkt de naam length en verwijdert laatste 2 letters
        return garix;
    }
   
   public int berekening (int a, int b){
       return a + b;
   }
   
   public String steenPapierSchaar(int speler){
        int computer = new Random().nextInt(3)+1;
        String result = "";
        if(speler==computer){
            result= "gelijkspel";
        }
        else {
            if (speler==1){
                if (computer==2){
                    result="computer wint";
                }
                else{
                    result = "speler wint";
                }
            }
            if (speler==2){
                if (computer==3){
                    result="computer wint";
                }
                else{
                    result = "speler wint";
                }
                
            }
            if (speler==3){
                if (computer==1){
                    result="computer wint";
                }
                else{
                    result = "speler wint";
                }
            }
        }
        
            
        return result;
    }
}


