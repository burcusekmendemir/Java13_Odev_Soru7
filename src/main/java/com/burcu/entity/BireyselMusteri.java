package com.burcu.entity;

import com.burcu.enums.Cinsiyet;
import com.burcu.enums.MusteriTipi;
import com.burcu.enums.State;

import java.util.UUID;

public class BireyselMusteri extends Musteri {
    String tcKimlik;


    /**
     * KADIN
     * ERKEK
     * BELIRTMEK ISTEMIYOR
     */
    Cinsiyet cinsiyet;
    String dogumTarihi;


    @Override
    public double yillikGelirHesapla() {
        return getAylikGelir()*12;
    }

    /**
     * Müşteri id'si almak için kullanılan methodtur.
     */
    public BireyselMusteri() {
        this.id= UUID.randomUUID().toString();
    }

    /**
     * Aşağıdaki parametreleri alan methodtur.
     *
     * @param ad
     * @param soyad
     * @param telefon
     * @param adres
     * @param email
     * @param aylikGelir
     * @param tcKimlik
     * @param cinsiyet
     * @param dogumTarihi
     */
    public BireyselMusteri(String ad, String soyad, String telefon, String adres, String email, Double aylikGelir, String tcKimlik, Cinsiyet cinsiyet, String dogumTarihi) {
        super(ad, soyad, telefon, adres, email, aylikGelir);
        this.id= UUID.randomUUID().toString();
        this.tcKimlik = tcKimlik;
        this.cinsiyet = cinsiyet;
        this.dogumTarihi = dogumTarihi;
    }

    /**
     * Aşağıdaki parametreleri alan methodtur.
     * @param adSoyad
     * @param musteriTipi
     * @param durum
     * @param ibanNo
     * @param hesapNo
     * @param subeNo
     * @param bakiye
     */
    public BireyselMusteri(String adSoyad, MusteriTipi musteriTipi, State durum, String ibanNo, String hesapNo, String subeNo, Double bakiye) {
        super(adSoyad, musteriTipi, durum, ibanNo, hesapNo, subeNo, bakiye);
    }

    public BireyselMusteri(String adSoyad, String telefon, String adres, String email, Double aylikGelir, MusteriTipi musteriTipi, State durum, String ibanNo, String hesapNo, String subeNo, Double bakiye, String createAt, String updateAt, String tcKimlik, Cinsiyet cinsiyet, String dogumTarihi) {
        super(adSoyad, telefon, adres, email, aylikGelir, musteriTipi, durum, ibanNo, hesapNo, subeNo, bakiye, createAt, updateAt);
        this.tcKimlik = tcKimlik;
        this.cinsiyet = cinsiyet;
        this.dogumTarihi = dogumTarihi;
    }

    public String getTcKimlik() {
        return tcKimlik;
    }

    public void setTcKimlik(String tcKimlik) {
        this.tcKimlik = tcKimlik;
    }

    public Cinsiyet getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(Cinsiyet cinsiyet) {
        this.cinsiyet = cinsiyet;
    }

    public String getDogumTarihi() {
        return dogumTarihi;
    }

    public void setDogumTarihi(String dogumTarihi) {
        this.dogumTarihi = dogumTarihi;
    }


}
