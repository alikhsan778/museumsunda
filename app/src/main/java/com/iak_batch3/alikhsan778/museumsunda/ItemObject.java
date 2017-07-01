package com.iak_batch3.alikhsan778.museumsunda;

/**
 * Created by Axioo on 08/05/2017.
 */
public class ItemObject {
    private String name, alamat, hp, harga, waktu;
    private int photo;

    public ItemObject(String name, int photo, String alamat, String hp, String harga, String waktu){
        this.name = name;
        this.photo = photo;
        this.alamat = alamat;
        this.hp = hp;
        this.harga = harga;
        this.waktu = waktu;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getHp() {
        return hp;
    }

    public void setHp(String hp) {
        this.hp = hp;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public String getWaktu() {
        return waktu;
    }

    public void setWaktu(String waktu) {
        this.waktu = waktu;
    }
}
