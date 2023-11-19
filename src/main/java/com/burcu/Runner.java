package com.burcu;

import com.burcu.entity.BireyselMusteri;
import com.burcu.entity.Krediler;
import com.burcu.entity.KurumsalMusteri;
import com.burcu.entity.Musteri;
import com.burcu.enums.*;
import com.burcu.repository.KrediRepository;
import com.burcu.repository.MusteriRepository;
import com.burcu.utility.Databases;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {


        BireyselMusteri bireyselMusteri1=new BireyselMusteri("Murat Kar","05552369875","Maltepe","murat@gmail.com",25_000d,MusteriTipi.BIREYSEL,State.AKTIF,"TR7894561231545","789456","7894",30_000d, "5/8/2021","23/8/2023","4567891332",Cinsiyet.ERKEK,"24/9/1994");
        BireyselMusteri bireyselMusteri2= new BireyselMusteri("Burcu Sekmen Demir", "05442651284","Pendik","burcu@gmail.com",30_000d, MusteriTipi.BIREYSEL,State.AKTIF,"TR1234567897979","1234560","1234",50_000d,"20/10/2020","14/11/2023","4561378978",Cinsiyet.KADIN,"16/06/1997");

        KurumsalMusteri kurumsalMusteri1=new KurumsalMusteri("Koç Holding", "0212456123","Sarıyer","koc@info.com.tr",25_000_000d,MusteriTipi.KURUMSAL,State.AKTIF,"TR7541258963255","78569","7854",150_000_000_000d, "19/5/1980","17/11/2023","6859452136",SirketTuru.LIMITEDSIRKET);
        KurumsalMusteri kurumsalMusteri2=new KurumsalMusteri("Sabancı Holding", "0212365895","Levent","sabanc,@info.com.tr", 30_000_000d, MusteriTipi.KURUMSAL,State.AKTIF,"TR524589632254564",  "524685", "5264", 120_000_000_000d, "8/6/1985", "17/11/2023", "6543219887",SirketTuru.LIMITEDSIRKET);

        System.out.println(bireyselMusteri1);
        System.out.println(bireyselMusteri2);
        System.out.println(kurumsalMusteri1);
        System.out.println(kurumsalMusteri2);
        System.out.println();

        kurumsalMusteri1.setAylikGelir(35_000_000d);
        System.out.println(kurumsalMusteri1.getAdSoyad()+ " adlı müşterinin yıllık geliri: " + kurumsalMusteri1.yillikGelirHesapla() + " TL");
        bireyselMusteri1.setAylikGelir(32_000d);
        System.out.println(bireyselMusteri1.getAdSoyad() + " adlı müşterinin yıllık geliri: " + bireyselMusteri1.yillikGelirHesapla() + " TL");
        System.out.println();



        MusteriRepository musteriRepository=new MusteriRepository();
        musteriRepository.save(bireyselMusteri1);
        musteriRepository.save(bireyselMusteri2);
        musteriRepository.save(kurumsalMusteri1);
        musteriRepository.save(kurumsalMusteri2);
        System.out.println("Kurumsal Müşteriler: " + Arrays.toString(Databases.kurumsalMusteriListesi));
        System.out.println("Bireysel Müşteriler: " + Arrays.toString(Databases.bireyselMusteriListesi));


        System.out.println("4561378978 TC Kimlik Numaralı Müşterinin Aylık Geliri: " + musteriRepository.findByTcKimlik("4561378978").getAylikGelir());
        System.out.println();
        System.out.println("6859452136 Vergi Numaralı Müşterinin Adresi: " +musteriRepository.findByVergiNo("6859452136").getAdres());
        musteriRepository.findByVergiNo("6859452136").setAdres("Mecidiyeköy");
        System.out.println("Müşterinin adresi: " + musteriRepository.findByVergiNo("6859452136").getAdres() + " olarak güncellenmiştir.");
        musteriRepository.findByVergiNo("6859452136").setUpdateAt("17/11/2023");
        System.out.println("Müşteri adresi "+musteriRepository.findByVergiNo("6859452136").getUpdateAt() + " tarihinde güncellenmiştir.");
        System.out.println();



        Krediler krediler=new Krediler();
        krediler.setYil(3);
        krediler.setAnaPara(2_000_000);
        System.out.println("Faiz oranı: " + krediler.getFaizOrani());
        System.out.println("Ana Para: " + krediler.getAnaPara());
        System.out.println("Yıl: " + krediler.getYil());


        KrediRepository krediRepository=new KrediRepository();
        krediRepository.saveKredi(krediler);
        System.out.println("Yıllık Faiz Getirisi: " + krediRepository.yillikFaizHesapla());






    }
}
