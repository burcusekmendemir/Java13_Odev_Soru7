package com.burcu.entity;

import com.burcu.enums.MusteriTipi;
import com.burcu.enums.State;

import java.util.Date;
import java.util.UUID;

public abstract class Musteri {

    String  id;
    String adSoyad;
    String telefon;
    String adres;
    String email;
    Double aylikGelir;

    /**
     * BIREYSEL
     * KURUMSAL
     */
    MusteriTipi musteriTipi;

    /**
     * AKTIF
     * PASIF
     * BLOKE olarak belirtilmelidir.
     */
    State durum;
    String ibanNo;
    String hesapNo;
    String subeNo;
    Double bakiye;

    /**
     * Hesabın oluşturulma tarihidir.
     */
    String createAt;

    /**
     * Hesabın güncellenme tarihidir.
     */
    String updateAt;

    public Musteri(String ad, String soyad, String telefon, String adres, String email, Double aylikGelir) {
    }


    /**
     * Yıllık gelirleri hesaplanır.
     */
    public abstract double yillikGelirHesapla();


    public Musteri() {
        this.id= UUID.randomUUID().toString();
    }

    public Musteri(String adSoyad, String telefon, String adres, String email, Double aylikGelir, MusteriTipi musteriTipi, State durum, String ibanNo, String hesapNo, String subeNo, Double bakiye, String createAt, String updateAt) {
        this();
        this.adSoyad = adSoyad;
        this.telefon = telefon;
        this.adres = adres;
        this.email = email;
        this.aylikGelir = aylikGelir;
        this.musteriTipi = musteriTipi;
        this.durum = durum;
        this.ibanNo = ibanNo;
        this.hesapNo = hesapNo;
        this.subeNo = subeNo;
        this.bakiye = bakiye;
        this.createAt = createAt;
        this.updateAt = updateAt;
    }

    public Musteri(String adSoyad, String telefon, String adres, String email, Double aylikGelir) {
        this();
        this.adSoyad = adSoyad;
        this.telefon = telefon;
        this.adres = adres;
        this.email = email;
        this.aylikGelir = aylikGelir;
    }

    public Musteri(String adSoyad, MusteriTipi musteriTipi, State durum, String ibanNo, String hesapNo, String subeNo, Double bakiye) {
        this();
        this.adSoyad = adSoyad;
        this.musteriTipi = musteriTipi;
        this.durum = durum;
        this.ibanNo = ibanNo;
        this.hesapNo = hesapNo;
        this.subeNo = subeNo;
        this.bakiye = bakiye;
    }

    @Override
    public String toString() {
        return "Musteri{" +
                "id='" + id + '\'' +
                ", adSoyad='" + adSoyad + '\'' +
                ", telefon='" + telefon + '\'' +
                ", adres='" + adres + '\'' +
                ", email='" + email + '\'' +
                ", aylikGelir=" + aylikGelir +
                ", musteriTipi=" + musteriTipi +
                ", durum=" + durum +
                ", ibanNo='" + ibanNo + '\'' +
                ", hesapNo='" + hesapNo + '\'' +
                ", subeNo='" + subeNo + '\'' +
                ", bakiye=" + bakiye +
                ", createAt=" + createAt +
                ", updateAt=" + updateAt +
                '}';
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getAdSoyad() {
        return adSoyad;
    }
    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }
    public String getTelefon() {
        return telefon;
    }
    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }
    public String getAdres() {
        return adres;
    }
    public void setAdres(String adres) {
        this.adres = adres;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Double getAylikGelir() {
        return aylikGelir;
    }
    public void setAylikGelir(Double aylikGelir) {
        this.aylikGelir = aylikGelir;
    }
    public MusteriTipi getMusteriTipi() {
        return musteriTipi;
    }
    public void setMusteriTipi(MusteriTipi musteriTipi) {
        this.musteriTipi = musteriTipi;
    }
    public State getDurum() {
        return durum;
    }
    public void setDurum(State durum) {
        this.durum = durum;
    }
    public String getIbanNo() {
        return ibanNo;
    }
    public void setIbanNo(String ibanNo) {
        this.ibanNo = ibanNo;
    }
    public String getHesapNo() {
        return hesapNo;
    }
    public void setHesapNo(String hesapNo) {
        this.hesapNo = hesapNo;
    }
    public String getSubeNo() {
        return subeNo;
    }
    public void setSubeNo(String subeNo) {
        this.subeNo = subeNo;
    }
    public Double getBakiye() {
        return bakiye;
    }
    public void setBakiye(Double bakiye) {
        this.bakiye = bakiye;
    }
    public String getCreateAt() {
        return createAt;
    }
    public void setCreateAt(String createAt) {
        this.createAt = createAt;
    }
    public String getUpdateAt() {
        return updateAt;
    }
    public void setUpdateAt(String updateAt) {
        this.updateAt = updateAt;
    }
}
