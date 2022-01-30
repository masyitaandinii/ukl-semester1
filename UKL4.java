/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ukl4;

/**
 *
 * @author MASTER 10
 */
public class UKL4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int sukupertama = 14;
       int selisih = 4;
       int sisi = 5;
       int deret = sukupertama;
             
       for(int a=0; a<sisi; a++){
           for(int b=a; b<sisi; b++){
               System.out.print(deret+"\t");
               
               deret+=selisih;
           }
                System.out.println("");
       }
       for(int a=0; a<sisi; a++){
           for(int b=0; b<=a; b++){
               System.out.print(deret+"\t");
               
               deret+=selisih;
           }
               System.out.println("");
       }
    }
    
}
