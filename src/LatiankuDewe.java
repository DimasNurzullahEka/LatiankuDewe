import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*package latianku.dewe;*/

/**
 *
 * @author Dimas Nurzullah
 */
public class LatiankuDewe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int Baris,Kolom;
     Scanner in= new Scanner(System.in); 
     
        System.out.println("Masuukan Ordo Matriks");
        System.out.println("========");
        System.out.println("Masukkan Jumlah Baris:");
        Baris=in.nextInt();
        System.out.println("Masukkan Jumlah Kolom");
        Kolom=in.nextInt();
        
        int  A[][]=new int[Baris][Kolom];
        int B[][]= new int[Baris][Kolom];
        int SUM[][]= new int[Baris][Kolom];
        
        System.out.println("\n masukkan elemen Matriks A");
        System.out.println("==========");
        
        for (int i = 0; i < Baris; i++) {
            for (int j = 0; j < Kolom; j++) {
                System.out.println("["+(i+1)+ "]["+(j+1)+ "]:");
                A[i][j]=in.nextInt();
            }
        }
        System.out.println("\n masukkan elemen Matriks B");
        System.out.println("======");
        for (int i = 0; i < Baris; i++) {
            for (int j = 0; j < Kolom; j++) {
                System.out.println("["+(i+1)+ "]["+(j+1)+ "]:");
                B[i][j]=in.nextInt();
            }
        }
        
//       Penjumlahan Matriks
        for (int i = 0; i < Baris; i++) {
            for (int j = 0; j < Kolom; j++) {
                SUM[i][j]=  A[i][j]+B[i][j];
            }
        }
        System.out.println("\nHasil Penjumlahan Matriks");
        System.out.println("========");
        
        for (int i = 0; i < Baris; i++) {
            for (int j = 0; j < Kolom; j++) {
                System.out.println(SUM[i][j]+"\t");
            }
        }
        System.out.println();
    }
    
}
