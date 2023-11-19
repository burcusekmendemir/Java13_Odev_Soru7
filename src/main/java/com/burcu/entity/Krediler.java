package com.burcu.entity;

import com.burcu.enums.KrediTurleri;

import java.util.UUID;

public class Krediler  {
    String id;
    Musteri musteriId;
    KrediTurleri krediTuru;
    double anaPara;
   public final double faizOrani=2.32;
    int vadesi;
    double aylikTaksit;
    double toplamOdeme;
    int gun;
    int ay;
    int yil;



    /**
     * Kredi id'si veren methodtur.
     */
    public Krediler() {
        this.id = UUID.randomUUID().toString();
    }


    /**
     * Aşağıdaki parametreleri alan methodtur.
     * @param krediTuru
     * @param anaPara
     * @param vadesi
     * @param aylikTaksit
     * @param toplamOdeme
     * @param gun
     * @param ay
     * @param yil
     */

    public Krediler(Musteri musteriId, KrediTurleri krediTuru, double anaPara, int vadesi, double aylikTaksit, double toplamOdeme, int gun, int ay, int yil) {
        this();
        this.musteriId = musteriId;
        this.krediTuru = krediTuru;
        this.anaPara = anaPara;
        this.vadesi = vadesi;
        this.aylikTaksit = aylikTaksit;
        this.toplamOdeme = toplamOdeme;
        this.gun = gun;
        this.ay = ay;
        this.yil = yil;
    }

    /**
     * Aşağıdaki parametreleri alan methodtur.
     * @param krediTuru
     * @param vadesi
     * @param aylikTaksit
     * @param toplamOdeme
     */
    public Krediler(KrediTurleri krediTuru, int vadesi, double aylikTaksit, double toplamOdeme) {
        this();
        this.krediTuru = krediTuru;
        this.vadesi = vadesi;
        this.aylikTaksit = aylikTaksit;
        this.toplamOdeme = toplamOdeme;
    }

    @Override
    public String toString() {
        return "Krediler{" +
                "id='" + id + '\'' +
                ", krediTuru=" + krediTuru +
                ", anaPara=" + anaPara +
                ", faizOrani=" + faizOrani +
                ", vadesi=" + vadesi +
                ", aylikTaksit=" + aylikTaksit +
                ", toplamOdeme=" + toplamOdeme +
                ", gun=" + gun +
                ", ay=" + ay +
                ", yil=" + yil +
                '}';
    }

    public Musteri getMusteriId() {
        return musteriId;
    }

    public void setMusteriId(Musteri musteriId) {
        this.musteriId = musteriId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public KrediTurleri getKrediTuru() {
        return krediTuru;
    }

    public void setKrediTuru(KrediTurleri krediTuru) {
        this.krediTuru = krediTuru;
    }

    public double getAnaPara() {
        return anaPara;
    }

    public void setAnaPara(double anaPara) {
        this.anaPara = anaPara;
    }

    public double getFaizOrani() {
        return faizOrani;
    }

    public int getVadesi() {
        return vadesi;
    }

    public void setVadesi(int vadesi) {
        this.vadesi = vadesi;
    }

    public double getAylikTaksit() {
        return aylikTaksit;
    }

    public void setAylikTaksit(double aylikTaksit) {
        this.aylikTaksit = aylikTaksit;
    }

    public double getToplamOdeme() {
        return toplamOdeme;
    }

    public void setToplamOdeme(double toplamOdeme) {
        this.toplamOdeme = toplamOdeme;
    }

    public int getGun() {
        return gun;
    }

    public void setGun(int gun) {
        this.gun = gun;
    }

    public int getAy() {
        return ay;
    }

    public void setAy(int ay) {
        this.ay = ay;
    }

    public int getYil() {
        return yil;
    }

    public void setYil(int yil) {
        this.yil = yil;
    }
}
