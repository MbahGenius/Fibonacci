/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ketupat;

import java.util.Scanner;

/**
 *
 * @author Praktikan
 */
public class Ketupat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int tinggi, setengahTinggi;
 Scanner data = new Scanner(System.in);
    System.out.print("Masukkan tinggi : ");
    
    tinggi = data.nextInt();
 int l = 1;
 int n = tinggi/2;
 System.out.println();
 System.out.println("output: ");
 for(int i=1;i<=n;i++){
     for(int k=n;k>i;k--){
         System.out.print("0");
     }
     for(int j=1;j<=l;j++){
         System.out.print("*");
     }
         l+=2;
         System.out.println("0");
 }
 l -= 4;
 for(int i=(n-1);i>=1;i--){
     for(int k=i;k<=(n-1);k++){
         System.out.print("0");
     }
     for(int j=l;j>=1;j--){
         System.out.print("*");
     }
     l-=2;
     System.out.println("0");
 }
 } 
}
