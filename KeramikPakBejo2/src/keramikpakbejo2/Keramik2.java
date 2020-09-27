/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package keramikpakbejo2;

/**
 *
 * @author niputunk
 */
public class Keramik2 {
    // atribut //
    int panjang;
    int lebar;
    int box;
    int harga;
    
   //constructor//
    Keramik2(int p, int l, int box, int harga){
        this.panjang = p;
        this.lebar = l;
        this.box = box;
        this.harga = harga;
    }
    //method//
    int Keramik(){
        int jkeramik = this.panjang*this.lebar*this.box;
        return jkeramik;
    }

    int jumlahBox(){
        int jbox = 1000000/this.Keramik();
        return jbox;              
    }

    int harga(){
        int bayar = this.jumlahBox()*this.harga;
        return bayar;
    }

void hasil(){
    System.out.println("Jumlah keramik:" +this.Keramik()+ "pcs");
    System.out.println("Jumlah box:" +this.jumlahBox()+ "box"); 
    System.out.println("yang harus dibayarkan: Rp" +this.harga());
    }
}