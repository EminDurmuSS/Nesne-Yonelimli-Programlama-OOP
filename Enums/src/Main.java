public class Main {
    enum Mevsimler{
        YAZ,KIS,ILKBAHAR
    }
    class Mevsimler2{
        public static final int YAZ=0;
        public static final int SONBAHAR=0;
        public static final int KIS=0;
        public static final int ILKBAHAR=0;

    }

    public static void main(String[] args) {

        Mevsimler deger = Mevsimler.YAZ;
        System.out.println(deger);
        //newlenemez

    }
}