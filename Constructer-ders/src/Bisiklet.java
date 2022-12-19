public class Bisiklet {
    public static int bisiklet_Sayaci=0;
    public Bisiklet(){
        bisiklet_Sayaci++;
    }
    public Bisiklet(String isim){
        this();
        System.out.println(isim);
    }

    public Bisiklet(int deger){
        System.out.println(deger);
    }
    public Bisiklet(String isim,String soyisim){
        System.out.println("Küçük oruspu ali");
    }
}
