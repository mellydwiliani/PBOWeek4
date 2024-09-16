package com.polban.jtk.inventory;

public class Barang {
    String kode_barang;
    String nama_barang;
    int stok;

    public Barang(String kode, String nama, int stk) {
        kode_barang = kode;
        nama_barang = nama;
        stok = stk;
    }

    public int getStock(){
        return stok;
    }

    public void tambahStok(int jumlah){
        if (jumlah > 0) {
            stok += jumlah;
        }else{
            System.out.println ("Jumlah tidak valid. Harus positif.");
        }
    }

    public String getNamaBarang(){
        return nama_barang;
    }
}

