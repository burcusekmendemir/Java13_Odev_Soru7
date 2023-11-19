package com.burcu.repository;

import com.burcu.entity.BireyselMusteri;
import com.burcu.entity.KurumsalMusteri;
import com.burcu.entity.Musteri;

public interface MusteriInterface {



    void save(BireyselMusteri bireyselMusteri);
    void save(KurumsalMusteri kurumsalMusteri);
    void delete(BireyselMusteri bireyselMusteri);
    void delete (KurumsalMusteri kurumsalMusteri);

    BireyselMusteri[] findAllBireysel();
    KurumsalMusteri[] findAllKurumsal();
    BireyselMusteri findByTcKimlik(String tcKimlik);
    KurumsalMusteri findByVergiNo(String vergiNo);




}
