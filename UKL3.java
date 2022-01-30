/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ukl3;

/**
 *
 * @author MASTER 10
 */
public class UKL3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int sukupertama = 14;
       int selisih = 4;
       int sisi = 4;
       int deret = sukupertama;
       
       for (int a=1; a<=sisi; a++){
           for(int b=a; b<=sisi; b++){
               System.out.print(deret+"\t");
               
        deret +=selisih;
        }
           System.out.println("");
       }
           
    }
    
}
