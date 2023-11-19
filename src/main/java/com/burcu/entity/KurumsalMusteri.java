package com.burcu.entity;

import com.burcu.enums.MusteriTipi;
import com.burcu.enums.SirketTuru;
import com.burcu.enums.State;
import com.burcu.repository.KrediInterface;

public class KurumsalMusteri extends Musteri {
    String vergiNo;

    /**
     * SAHIS SIRKETI,
     * ANONIM SIRKET,
     * LIMITED SIRKET,
     * PAYLI KOMANDIT olarak belirtilmelidir.
     */
    SirketTuru sirketTuru;

    @Override
    public double yillikGelirHesapla() {
        return getAylikGelir()*12;
    }

    public KurumsalMusteri() {

    }

    /**
     * Aşağıdaki parametreleri alan methodtur.
     * @param adSoyad
     * @param telefon
     * @param adres
     * @param email
     * @param aylikGelir
     * @param vergiNo
     * @param sirketTuru
     */
    public KurumsalMusteri(String adSoyad, String telefon, String adres, String email, Double aylikGelir, String vergiNo, SirketTuru sirketTuru) {
        super(adSoyad, telefon, adres, email, aylikGelir);
        this.vergiNo = vergiNo;
        this.sirketTuru = sirketTuru;
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
     * @param vergiNo
     * @param sirketTuru
     */
    public KurumsalMusteri(String adSoyad, MusteriTipi musteriTipi, State durum, String ibanNo, String hesapNo, String subeNo, Double bakiye, String vergiNo, SirketTuru sirketTuru) {
        super(adSoyad, musteriTipi, durum, ibanNo, hesapNo, subeNo, bakiye);
        this.vergiNo = vergiNo;
        this.sirketTuru = sirketTuru;
    }

    public KurumsalMusteri(String adSoyad, String telefon, String adres, String email, Double aylikGelir, MusteriTipi musteriTipi, State durum, String ibanNo, String hesapNo, String subeNo, Double bakiye, String createAt, String updateAt, String vergiNo, SirketTuru sirketTuru) {
        super(adSoyad, telefon, adres, email, aylikGelir, musteriTipi, durum, ibanNo, hesapNo, subeNo, bakiye, createAt, updateAt);
        this.vergiNo = vergiNo;
        this.sirketTuru = sirketTuru;
    }



    @Override
    public String toString() {
        return "KurumsalMusteri{" +
                "vergiNo='" + vergiNo + '\'' +
                ", sirketTuru=" + sirketTuru +
                ", id='" + id + '\'' +
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

    public String getVergiNo() {
        return vergiNo;
    }

    public void setVergiNo(String vergiNo) {
        this.vergiNo = vergiNo;
    }

    public SirketTuru getSirketTuru() {
        return sirketTuru;
    }

    public void setSirketTuru(SirketTuru sirketTuru) {
        this.sirketTuru = sirketTuru;
    }


}
