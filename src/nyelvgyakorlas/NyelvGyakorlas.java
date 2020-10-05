/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nyelvgyakorlas;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author jager.balazs
 */
public class NyelvGyakorlas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
         System.setProperty("file.encoding", "UTF8");
         BufferedReader br = new BufferedReader(new FileReader("szotar.txt"));
         BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
         System. out.println("A fájl tartalma: ");
         String sor;
         boolean sw = true;
         ArrayList<String> angol = new ArrayList<>();
         ArrayList<String> magyar = new ArrayList<>();
         ArrayList<String> bekert = new ArrayList<>();
         while((sor = br.readLine()) != null){ 
             
             if (sw) {
                 angol.add(sor);
                 sw=false;
                 
             }else{
                 magyar.add(sor);
                 sw=true;
             }
             
         } 
        br.close();
        
        for (int i = 0; i < angol.size(); i++) {
            System.out.println(" Kerem az "+ angol.get(i)+ " szo magyar megfelelojet. " );
            bekert.add(rd.readLine());
            
        }
        int helyes = 0;
        
        for (int i = 0; i < magyar.size(); i++) {
            if (magyar.get(i).equals(bekert.get(i).toLowerCase())) {
                helyes++;
            }
        }
        
        System.out.println("A helyes valaszok szama " + helyes);
        
    }
    
}
