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
public class Energi {
    private double massaBerat,kecepatan,kecepatanAwal;

    public double getMassaBerat() {
        return massaBerat;
    }

    public void setMassaBerat(double massaBerat) {
        this.massaBerat = massaBerat;
    }

    

    public double getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(double kecepatan) {
        this.kecepatan = kecepatan;
    }

    public double getKecepatanAwal() {
        return kecepatanAwal;
    }

    public void setKecepatanAwal(double kecepatanAwal) {
        this.kecepatanAwal = kecepatanAwal;
    }
    
    public double hitungEnergiKinetik(double massaBerat,double kecepatan){
        return  0.5 * massaBerat * (kecepatan * kecepatan);
    }
    
    public double hitungUsaha(double massaBerat,double kecepatanAwal,double kecepatan){
        return 0.5 * massaBerat * ((kecepatan * kecepatan) - (kecepatanAwal * kecepatanAwal));
    }
}
