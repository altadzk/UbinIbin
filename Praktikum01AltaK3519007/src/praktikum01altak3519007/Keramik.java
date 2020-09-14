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
public class Keramik {
    /*atribut */
    /* satuan (m) dikonversi menjadi (cm)*/
    
    int luas = 1000*1000;
    int box;
    int ukuran;
    int rupiah;
            
    /*methods*/
    void hitungJumlah(){
        int jumlah;
                jumlah = this.luas/this.ukuran;
                System.out.println("jumlah keramik: "+jumlah+"buah");                   
    }
    void jumlahDus(){
        int dus;
                dus = (this.luas/this.ukuran)/this.box;
                System.out.println("jumlah box: "+dus+"pcs");
    }
    void totalHarga(){
        int harga;
                harga = ((this.luas/this.ukuran)/this.box)*this.rupiah;
                System.out.println("total harga: "+"Rp"+harga);
    }
}

