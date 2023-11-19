package com.burcu.repository;

import com.burcu.entity.Krediler;
import com.burcu.utility.Databases;

public class KrediRepository implements KrediInterface {

    public void saveKredi(Krediler kredi){
        Databases.krediListesi[Databases.getKrediIndex()]=kredi;
    }

    /**
     *  Tüm kredi kayıtların yer aldığı kredi listesini veren methodtur.
     * @return
     */

    @Override
    public Krediler[] findAllKredi(){
        Krediler[] sonuc=new Krediler[Databases.getKrediIndex()];
        for (int i = 0; i <Databases.getKrediIndex() ; i++) {
            sonuc[i]=Databases.krediListesi[i];
        }
        return sonuc;
    }



    /**
     * Kredi ve faiz getirisi hesapları yapılır.
     */
    @Override
    public double krediHesapla() {
        Krediler krediler=new Krediler();
        double brutGetiri= krediler.getAnaPara()* (krediler.getFaizOrani()/100)* krediler.getVadesi();
        return brutGetiri;
    }

    @Override
    public double gunlukFaizHesapla() {
        Krediler krediler=new Krediler();
        return (krediler.getAnaPara()/100)*(krediler.getFaizOrani()/365)* krediler.getGun();
    }

    @Override
    public double aylikFaizHesapla() {
        Krediler krediler=new Krediler();
        return (krediler.getAnaPara()/100)*(krediler.getFaizOrani()/12)* krediler.getAy();
    }

    @Override
    public double yillikFaizHesapla() {
        Krediler krediler=new Krediler();
        return (krediler.getAnaPara()/100)*(krediler.getFaizOrani()* krediler.getYil());

    }
}

