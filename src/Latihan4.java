/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
public class Latihan4 {
    public static void hitung(double a, double b){
        System.out.print("kecepatan: " + (a / b) + " km/jam");
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukan jarak: ");
        double bil1 = input.nextDouble();
        
        System.out.print("Waktu tempuh: ");
        double bil2 = input.nextDouble();
        
        hitung(bil1, bil2);
        
    }
}
