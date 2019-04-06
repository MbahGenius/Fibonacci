/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deret.fibonacci;

import java.util.Scanner;

/**
 *
 * @author Praktikan
 */
public class DeretFibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukan Jumlah deret fibonacci :    ");
        int n = scan.nextInt();
        long fib[] = new long[n];
        int hasil = 0;
         
        fib[0] = 0;
        fib[1] = 1;
         
        for(int i = 2; i < n; i++) {
            fib[i] = fib[i-1] + fib[i-2];
            hasil+=fib[i];
        }
         
        for (int i = n; i != 0; i--) {
            System.out.print(fib[i-1] +  " ");
        }
        System.out.println("");
        System.out.println("hasil penjumlahan deret = "+(hasil+1));
    }
 
}