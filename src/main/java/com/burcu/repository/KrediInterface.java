package com.burcu.repository;

import com.burcu.entity.Krediler;

public interface KrediInterface {

    Krediler[] findAllKredi();
    double krediHesapla();
    double gunlukFaizHesapla();
    double aylikFaizHesapla();
    double yillikFaizHesapla();


}
