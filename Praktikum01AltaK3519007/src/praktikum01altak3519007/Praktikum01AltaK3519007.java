/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum01altak3519007;

/**
 *
 * @author Alta K3519007
 */
public class Praktikum01AltaK3519007 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /* instansiasi*/
        /*ukuran dalam satuan (cm) */
     Keramik a = new Keramik();
     a.ukuran = 30 * 30;
     a.box = 10;
     a.rupiah = 54000;
     a.hitungJumlah();
     a.jumlahDus();
     a.totalHarga();
             
     Keramik b = new Keramik();
     b.ukuran = 40 * 40;
     b.rupiah = 65000;
     b.box = 5;
     b.hitungJumlah();
     b.jumlahDus();
     b.totalHarga();
     
     Keramik c = new Keramik();
     c.ukuran = 30 * 40;
     c.rupiah = 60000;
     c.box = 8;
     c.hitungJumlah();
     c.jumlahDus();
     c.totalHarga();
    }
    
    
}
