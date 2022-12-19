abstract class Hayvan{
    public abstract void HayvanSesi();
    public void uyu(){
        System.out.println("zzz");
    }
}
    class Kedi extends Hayvan{
        public void HayvanSesi(){
            System.out.println("Kedi miyavlıyor");
        }
    }
    class Kopek extends Hayvan{
        public void HayvanSesi(){
            System.out.println("Hav havvvv ");
        }
    }


public class Main {
    public static void main(String[] args) {

        Kedi k1 = new Kedi();
        k1.HayvanSesi();
        k1.uyu();
    }
}
