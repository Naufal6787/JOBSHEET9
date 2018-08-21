/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Naufal K D
 */
public class Latihan5 {
    public static void main(String[] args){
        int angka1, angka2, angka3, maks;
        angka1 = 26;
        angka2 = 35;
        angka3 = 78;
        if(angka2>angka1 && angka2>angka3){
            maks = angka1;
        }else if(angka2>angka1 && angka2>angka3){
            maks = angka2;
        }else{
            maks = angka3;
        }
        System.out.println("Angka maksimum adalah= " + maks);
    }
}
