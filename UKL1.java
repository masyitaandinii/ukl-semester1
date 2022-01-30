/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ukl1;

/**
 *
 * @author MASTER 10
 */
public class UKL1 {
   
    public static void main(String[] args) {
        int sukupertama = 14;
        int selisih = 4;
        int sukuawal = 1;
        int sukuakhir = 11;
        int deret = sukupertama;
        int total = 0;
        
        for(int n=1; n<=sukuakhir; n++){
            total += deret;
            if(n>=sukuawal){
            System.out.println("Nilai suku ke "+n+" = "+deret);
            
            }
            
            deret += selisih;
            
        }
        
            System.out.println("Total = "+total);
                            
    }
  
}
