package com.burcu.repository;

import com.burcu.entity.BireyselMusteri;
import com.burcu.entity.KurumsalMusteri;
import com.burcu.entity.Musteri;
import com.burcu.utility.Databases;

public class MusteriRepository implements MusteriInterface{

    /**
     * Kayıt işlemi yapıldığında, yeni kayıtların(müşteri,bireysel müşteri, kurumsal müşteri)
     * ilgili listelerine eklenmesini sağlayan methodlardır.
     */


    @Override
    public void save(BireyselMusteri bireyselMusteri) {
        Databases.bireyselMusteriListesi[Databases.getBireyselMusteriIndex()]=bireyselMusteri;
    }

    @Override
    public void save(KurumsalMusteri kurumsalMusteri) {
        Databases.kurumsalMusteriListesi[Databases.getKurumsalMusteriIndex()]=kurumsalMusteri;
    }

    @Override
    public void delete(BireyselMusteri bireyselMusteri) {

    }

    @Override
    public void delete(KurumsalMusteri kurumsalMusteri) {

    }


    /**
     * Tüm kayıtların yer aldığı müşteri, bireysel müşteri ve
     * kurumsal müşteri listelerini veren methodlardır.
     * @return
     */


    @Override
    public BireyselMusteri[] findAllBireysel() {
        BireyselMusteri[] sonuc=new BireyselMusteri[Databases.getBireyselMusteriIndex()];
        for (int i = 0; i <Databases.getBireyselMusteriIndex() ; i++) {
            sonuc[i]=Databases.bireyselMusteriListesi[i];
        }
        return sonuc;
    }

    @Override
    public KurumsalMusteri[] findAllKurumsal() {
        KurumsalMusteri[] sonuc=new KurumsalMusteri[Databases.getKurumsalMusteriIndex()];
        for (int i = 0; i <Databases.getKurumsalMusteriIndex() ; i++) {
            sonuc[i]=Databases.kurumsalMusteriListesi[i];
        }
        return sonuc;
    }

    /**
     * Bireysel müşterileri TC kimlik numaralarına göre bulmamızı sağlayan methodtur.
     * @param tcKimlik
     * @return
     */

    @Override
    public BireyselMusteri findByTcKimlik(String tcKimlik) {
        for (BireyselMusteri bireyselMusteri: Databases.bireyselMusteriListesi){
            if (bireyselMusteri.getTcKimlik().contains(tcKimlik))
                return bireyselMusteri;
        }
        return null;
    }


    /**
     * Kurumsal müşterileri vergi numaralarına göre bulmamızı sağlayan methodtur.
     * @param vergiNo
     * @return
     */
    @Override
    public KurumsalMusteri findByVergiNo(String vergiNo) {
        for (KurumsalMusteri kurumsalMusteri: Databases.kurumsalMusteriListesi){
            if (kurumsalMusteri.getVergiNo().contains(vergiNo))
                return kurumsalMusteri;
        }
        return null;
    }
}
