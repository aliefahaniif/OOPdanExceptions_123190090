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
public class Lingkaran extends Bangundatar{
    public void hitungLuas(){
        double luas = getPanjang()*getPanjang()*Math.PI; //panjang=jari-jari
        setLuas(luas); //hasilnya
    }
    public void hitungKeliling(){
        double keliling = 2*getPanjang()*Math.PI;
        setKeliling(keliling);
    }
}
