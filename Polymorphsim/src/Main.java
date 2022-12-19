public class Main {
    public static void hayvaniKonustur(Hayvan hayvan){
        hayvan.sesCikar();
    }
    public  static void hayvanKonustur2(Object object){
        if(object instanceof Kedi){
            Kedi kedi = (Kedi) object;

        }
    }
    public static void main(String[] args) {
    Hayvan hayvan=new Hayvan("Tekir");
    Kedi kedi=new Kedi("Bekir");
    Kopek kopek=new Kopek("Faruk");
    hayvaniKonustur(kedi);



    }
}