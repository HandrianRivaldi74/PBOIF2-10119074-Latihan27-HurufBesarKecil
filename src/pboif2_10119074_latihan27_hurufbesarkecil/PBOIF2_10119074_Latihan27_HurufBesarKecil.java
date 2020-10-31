/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2_10119074_latihan27_hurufbesarkecil;

import java.util.Scanner;

/**
 *
 * @author Acer
 * NAMA     : Handrian Rivaldi
 * Kelas    : PBOIF2
 * NIM      : 10119074
 * Deskrifsi : Mennghasilkan huruf besar dan kecil
 */
public class PBOIF2_10119074_Latihan27_HurufBesarKecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String besar, kecil;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Kalimat : ");
        String nama = scanner.nextLine();
        System.out.println();
        System.out.println("====Hasil Formatting====");
        System.out.println("Huruf Besar : "+nama.toUpperCase());
        System.out.println("Huruf Kecil : "+nama.toLowerCase());
    }
    
}
