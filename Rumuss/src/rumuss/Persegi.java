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
public class Persegi extends Bangundatar{
    int input;
    public void hitungLuas (){
        double luas = getPanjang()*getPanjang(); //ngambil panjang di rumuss
        setLuas(luas); //hasilnya
    }
    public void hitungKeliling (){
        double keliling = getPanjang()*4; 
        setKeliling(keliling);
    }

 
            
}
