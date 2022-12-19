public class Main {
    public static void main(String[] args) {
        TarımKrediManager tarımKrediManager=new TarımKrediManager();
        tarımKrediManager.Hesapla();
        OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
        KrediUi krediUi=new KrediUi();
        krediUi.KrediHesapla(ogretmenKrediManager);
        krediUi.KrediHesapla(new TarımKrediManager());
    }
}