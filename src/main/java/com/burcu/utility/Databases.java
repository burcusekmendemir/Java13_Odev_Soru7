package com.burcu.utility;

import com.burcu.entity.BireyselMusteri;
import com.burcu.entity.Krediler;
import com.burcu.entity.KurumsalMusteri;
import com.burcu.entity.Musteri;

public class Databases {


    /**
     * Musteri sayısını tutar.
     */
    public static int bireyselMusteriIndex=0;
    public static int KurumsalMusteriIndex=0;
    public static int krediIndex=0;



    /**
     * Musterilerin ve kredilerin listelerini tutar.
     */

    public static BireyselMusteri[] bireyselMusteriListesi =new BireyselMusteri[100];
    public static KurumsalMusteri[] kurumsalMusteriListesi=new KurumsalMusteri[100];
    public static Krediler[] krediListesi= new Krediler[100];


    /**
     * Listelere eklemeler yapıldıkça sayılarının 1'er 1'er artması
     * için kullanırız.
     * @return
     */
    public static int getKrediIndex() {
        return krediIndex++;
    }
    public static int getBireyselMusteriIndex() {
        return bireyselMusteriIndex++;
    }
    public static int getKurumsalMusteriIndex() {
        return KurumsalMusteriIndex++;
    }

}
