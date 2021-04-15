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

public class Segitiga extends Bangundatar{
    public void hitungLuas (){
        double luas = 0.5*getPanjang()*getLebar(); //panjang=tinggi lebar=alas
        setLuas(luas);
    }
    public void hitungKeliling (){
        double keliling = getLebar()*3;
        setKeliling(keliling);
    }
 
            
}

