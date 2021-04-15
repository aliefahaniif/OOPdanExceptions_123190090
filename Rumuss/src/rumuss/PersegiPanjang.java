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

public class PersegiPanjang extends Bangundatar{
    public void hitungLuas (){
        double luas = getPanjang()*getLebar();
        setLuas(luas);
    }
    public void hitungKeliling (){
        double keliling = 2 * (getPanjang()+ getLebar());
        setKeliling(keliling);
    }
 
            
}