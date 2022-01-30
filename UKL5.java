/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ukl5;

/**
 *
 * @author MASTER 10
 */
public class UKL5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int a[][] = {{5,3} , {5,3}};
       int b[][] = {{4,4} , {6,6}};
        System.out.println("Hasil A + B = ");
        for(int n=0; n<2; n++){
            for(int p=0; p<2; p++){
                System.out.print(a[n][p]+b[n][p]+"\t");                
            }
            System.out.println("");        
        }
    }
    
}
