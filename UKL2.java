/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ukl2;

/**
 *
 * @author MASTER 10
 */
public class UKL2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nilaisukupertama = 14;
        int selisih = 4;
        int baris = 5;
        int kolom = 3;
        int deret = nilaisukupertama;
        int total = 0;
        
        for (int n=0; n<baris; n++){
            for(int p=0; p<kolom; p++ ){
                System.out.print(deret + "\t");
            
            total += deret;
            deret += selisih;                          
            }
                System.out.println("");

        }
                System.out.println("Total = "+total);
    }
    

    }
    

