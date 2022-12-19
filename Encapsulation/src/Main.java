public class Main {
    public static void main(String[] args) {
        Kullanici k1 = new Kullanici();
        k1.setKullanici_adi("KadirBaba123");
        k1.setSifre("123456");

        System.out.println(k1.getKullanici_adi());
        System.out.println(k1.getSifre());

        Kullanici k2 = new Kullanici();
        k2.setKullanici_adi("admin");
        k2.setSifre("123123123123123123");
        System.out.println(k1.getKullanici_adi());
        k2.setSifre(k2.getSifre());

    }
}