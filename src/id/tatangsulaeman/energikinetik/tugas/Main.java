/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.tatangsulaeman.energikinetik.tugas;

/**
 *
 * @author 
 * NAMA     : TATANG SULAEMAN
 * KELAS    : PBOIF2
 * NIM      : 10119068
 * Deskripsi program    : Menampilkan Energi Kinetik
 * 
 */
public class Main {
    public static void main(String[]args){
        Energi dataEnergi = new Energi();
        
        //set value
        dataEnergi.setMassaBerat(0.145);
        dataEnergi.setKecepatanAwal(0);
        dataEnergi.setKecepatan(25);
        
        //tampil 
        System.out.println("Massa bola baseball : "+ dataEnergi.getMassaBerat()+ " KG");
        System.out.println("Kecepatan Awal : "+ dataEnergi.getKecepatanAwal()+ " m/s");
        System.out.println("Kecepatan setelah dilempar : " + dataEnergi.getKecepatan()+" m/s");
        System.out.println("----------------------------------------------------------");
        System.out.println("Energi Kinetik yang dihasilkan : " + dataEnergi.hitungEnergiKinetik(dataEnergi.getMassaBerat(), dataEnergi.getKecepatan())+ " Joule");
        System.out.println("Usaha Yang diperlukan          : " + dataEnergi.hitungUsaha(dataEnergi.getMassaBerat(),dataEnergi.getKecepatanAwal(), dataEnergi.getKecepatan()) + " Joule");
    }
}
