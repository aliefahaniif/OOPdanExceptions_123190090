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
public class Kubus extends Persegi{
    public void hitungVolume (){
        double volume = getLuas()*getPanjang(); //ngambil luas di persegi 
        setVolume(volume); //hasilnya
    }
    public void hitungLuaspermukaan (){
        double luaspermukaan = getLuas()*6; // luas * 6
        setLuaspermukaan(luaspermukaan); //hasilnya
    }
}
