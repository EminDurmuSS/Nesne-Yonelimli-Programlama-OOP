
public class Kullanici {
    private  String kullanici_adi;
    private String Sifre;

    public String getKullanici_adi() {
        return kullanici_adi;
    }

    public void setKullanici_adi(String kullanici_adi) {
        this.kullanici_adi = kullanici_adi;
    }

    public String getSifre() {
        return Sifre;
    }

    public void setSifre(String sifre) {
        if (sifre.length()>9){
            System.out.println("please enter a password with a maximum length of nine characters");
        }
        else
        Sifre = sifre;
    }
}
