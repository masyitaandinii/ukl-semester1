/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ukl6.pkg2;

/**
 *
 * @author MASTER 10
 */
public class UKL62 {

    public static void main(String[] args) {
        int a[][] = { 
            {2, 4},
            {2, 4},
            {2, 4},
            {2, 4}
        };
        int b[][] = {
            {4, 2, 4, 2},
            {2, 4, 2, 4}
        };
        int h[][] = new int[a.length][b[0].length];
        
        System.out.println("Hasil AxB = ");
        for (int i = 0; i < a.length; i++) { //angka depan
            for (int j = 0; j < b[0].length; j++) { //angka belakang
                for (int k = 0; k < a[0].length; k++) { //angka tengah
                    h[i][j] += (a[i][k] * b[k][j]);
                }
                System.out.print(h[i][j] + "\t");
            }
            System.out.println("");
        }
    }
}
