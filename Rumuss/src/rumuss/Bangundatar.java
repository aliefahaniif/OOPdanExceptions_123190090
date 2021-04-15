/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rumuss;

/**
 *
 * @author user
 */
public class Bangundatar {
    private double panjang, lebar, luas, keliling, volume, luaspermukaan, tinggi; 
    
    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    public double getLuas() {
        return luas;
    }

    public void setLuas(double luas) {
        this.luas = luas;
    }

    public double getKeliling() {
        return keliling;
    }

    public void setKeliling(double keliling) {
        this.keliling = keliling;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getLuaspermukaan() {
        return luaspermukaan;
    }

    public void setLuaspermukaan(double luaspermukaan) {
        this.luaspermukaan = luaspermukaan;
    }
     public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
    
    
    public void cetak ()
    {
        System.out.println("Keliling = " + getKeliling());
        System.out.println("Luas     = " + getLuas());
    }
  
    public void cetaklagi ()
    {
        System.out.println("Luas alas       = " + getLuas());
        System.out.println("Keliling alas   = " + getKeliling());
        System.out.println("Volume          = " + getVolume());
        System.out.println("Luas Permukaan  = " + getLuaspermukaan());
    }

    
}
    



