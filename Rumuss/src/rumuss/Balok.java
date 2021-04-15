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
public class Balok extends PersegiPanjang{
    public void hitungVolume (){
        double volume = getLuas()*getTinggi();  //volume = p*l*t
        setVolume(volume); //hasilnya
    }
    public void hitungLuaspermukaan (){
        double luaspermukaan = 2*((getPanjang()*getLebar()) + (getPanjang()*getTinggi()) + (getLebar()*getTinggi()) ); //luaspermukaan=2*(pl+pt+lt)
        setLuaspermukaan(luaspermukaan); //hasilnya
    }
}

