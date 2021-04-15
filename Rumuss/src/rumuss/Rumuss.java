/*
Nama            : Aliefa Haniif S
NIM             : 123190090
 */
package rumuss;

import java.util.Scanner;


public class Rumuss {
    public static void main(String[] args) {
        try{
        Scanner input = new Scanner(System.in);
        int menu;
        double pilih;
        
        do{
            System.out.println("+==========MENU===========+");
            System.out.println("| 1. Persegi              |");
            System.out.println("| 2. Lingkaran            |");
            System.out.println("| 3. Persegi Panjang      |");
            System.out.println("| 4. Segitiga             |");
            System.out.println("| 5. Kubus                |");
            System.out.println("| 6. Silinder             |");
            System.out.println("| 7. Balok                |");
            System.out.println("| 8. Exit                 |");
            System.out.println("+=========================+");
            System.out.print("Masukkan Pilihan : ");
            menu = input.nextInt();   
           
            if (menu==1){
                Persegi persegi = new Persegi();
                System.out.println("PERSEGI");
                System.out.print("Masukkan sisi : ");
                pilih = input.nextDouble();
                persegi.setPanjang(pilih);
                
                persegi.hitungLuas();
                persegi.hitungKeliling();
                persegi.cetak();
               
                }
                
            if (menu==2){
                Lingkaran lingkaran = new Lingkaran();
                System.out.println("LINGKARAN");
                System.out.print("Masukkan jari-jari : ");
                pilih = input.nextDouble();
                lingkaran.setPanjang(pilih);
                
                lingkaran.hitungLuas();
                lingkaran.hitungKeliling();
                lingkaran.cetak();
            }
            if (menu==3){
                PersegiPanjang persegipanjang = new PersegiPanjang();
                System.out.println("PERSEGI PANJANG");
                System.out.print("Masukkan panjang : ");
                pilih = input.nextDouble();
                persegipanjang.setPanjang(pilih);
                System.out.print("\nMasukkan lebar : ");
                pilih = input.nextDouble();
                persegipanjang.setLebar(pilih);
                
                persegipanjang.hitungLuas();
                persegipanjang.hitungKeliling();
                persegipanjang.cetak();
            }            
            if (menu==4){
                Segitiga segitiga = new Segitiga();
                System.out.println("SEGITIGA");
                System.out.print("Masukkan tinggi : ");
                pilih = input.nextDouble();
                segitiga.setPanjang(pilih);
                System.out.print("\nMasukkan alas : ");
                pilih = input.nextDouble();
                segitiga.setLebar(pilih);
                
                segitiga.hitungLuas();
                segitiga.hitungKeliling();
                segitiga.cetak();
            }
            if (menu==5){
                Kubus kubus = new Kubus();
                System.out.println("KUBUS");
                System.out.print("Masukkan sisi : ");
                pilih = input.nextDouble();
                kubus.setPanjang(pilih);
                
                kubus.hitungLuas();
                kubus.hitungKeliling();
                kubus.hitungVolume();
                kubus.hitungLuaspermukaan();
                kubus.cetaklagi();
            }
            if (menu==6){
                Silinder silinder = new Silinder();
                System.out.println("SILINDER");
                System.out.print("Masukkan jari-jari : ");
                pilih = input.nextDouble();
                silinder.setPanjang(pilih);
                System.out.print("Masukkan tinggi    : ");
                pilih = input.nextDouble();
                silinder.setLebar(pilih);
                
                
                silinder.hitungLuas();
                silinder.hitungKeliling();
                silinder.hitungVolume();
                silinder.hitungLuaspermukaan();
                silinder.cetaklagi();
            }
            if (menu==7){
                Balok balok = new Balok();
                System.out.println("BALOK");
                System.out.print("Masukkan panjang : ");
                pilih = input.nextDouble();
                balok.setPanjang(pilih);
                System.out.print("Masukkan lebar   : ");
                pilih = input.nextDouble();
                balok.setLebar(pilih);
                System.out.print("Masukkan tinggi  : ");
                pilih = input.nextDouble();
                balok.setTinggi(pilih);
                
                
                balok.hitungLuas();
                balok.hitungKeliling();
                balok.hitungVolume();
                balok.hitungLuaspermukaan();
                balok.cetaklagi();
            }
            if (menu==8){
                System.exit(0);
            }
            if(menu>=8){
                System.out.println("Yang anda masukkan tidak ada dalam menu!");
            }
            System.out.println("\n \nUlangi? \n1. Ya \n2. Tidak");
            System.out.print("= ");
            pilih = input.nextDouble();
            
        }while(pilih==1);
    }
        catch(Exception e){
                    System.out.println("ERROR! Harap masukkan angka!");
                    return;
                }
    }

}
