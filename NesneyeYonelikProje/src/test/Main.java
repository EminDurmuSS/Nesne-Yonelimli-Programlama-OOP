package test;

public class Main {
    public static void main(String[] args) {
        Otomobil otomobil1 = new Otomobil("Yesil","Demir");
        System.out.println(otomobil1.getCant()+" "+otomobil1.getRenk());

        Otomobil otomobil2 = new Otomobil("kırmızı","Normal");
        System.out.println(otomobil2.getCant()+" "+otomobil2.getRenk());

        Otomobil otomobil3 = new Otomobil();
        System.out.println(otomobil3.getCant()+" "+otomobil3.getRenk());
        BenzinliOtomobil benzinliOtomobil = new BenzinliOtomobil();
        System.out.println(benzinliOtomobil.getCant());
        System.out.println(benzinliOtomobil.getRenk());
        ElektrikliOtomobil elektrikliOtomobil = new ElektrikliOtomobil(25);
        System.out.println(elektrikliOtomobil.getSarj());
        elektrikliOtomobil.setMotorAkuTipi("300Beygir");
        System.out.println(elektrikliOtomobil.getMotorAkuTipi());
    }
}
