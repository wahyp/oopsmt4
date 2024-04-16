
package luas_segitiga;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author Ega
 * 
 */
public class Luas_Segitiga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BufferedReader dtIN = new BufferedReader(new InputStreamReader(System.in));
        
        Double luas;
        int a = 0;
        int t = 0;
        String alas = "";
        String tinggi = "";
        
        System.out.println("Luas Segitiga");
        System.out.println("");
        System.out.print("Nilai alas : ");
        try {
            alas = dtIN.readLine();
            System.out.print("Nilai tinggi : ");
            tinggi = dtIN.readLine();
        }catch(IOException e){
            System.out.println("Error!");
        }
        a = Integer.parseInt(alas);
        t = Integer.parseInt(tinggi);
        luas = 0.5 * a * t;
        System.out.println("Luasnya adalah : "+ luas + "cm2");
    }
    
}
