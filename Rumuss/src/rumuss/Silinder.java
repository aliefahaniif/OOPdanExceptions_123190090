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
public class Silinder extends Lingkaran{
    public void hitungVolume (){
        double volume = getLuas()*getLebar(); //ngambil luas di persegi lebar=tinggi rumus=pi*r*r*t
        setVolume(volume); //hasilnya
    }
    public void hitungLuaspermukaan (){
        double luaspermukaan = (2*getLuas())+(2*Math.PI*getPanjang()*getLebar()); // luaspermukaan=(2*pi*r*r)+(2*pi*r*t)
        setLuaspermukaan(luaspermukaan); //hasilnya
    }
}
