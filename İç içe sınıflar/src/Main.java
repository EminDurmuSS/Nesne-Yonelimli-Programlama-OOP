
    class  Universite{
        String universite_isim;
        int x=10;
        //static
         class Fakulte{
            int x=5;
            String fakulte_ismi;
            /*void XDondur(){
                System.out.println(x);
            }*/
            void Xdondur(int x){
                System.out.println(x);
                System.out.println(this.x);
                System.out.println(Universite.this.x);
            }
        }
        class Myo{
            String myo_ismi;
        }
    }


public class Main {
    public static void main(String[] args) {
        Universite Kirklareli = new Universite();
        Universite.Fakulte f1 = Kirklareli.new Fakulte();
        f1.fakulte_ismi="Mühendislik Fakültesi";
        System.out.println(f1.fakulte_ismi);
        //f1.XDondur();
        f1.Xdondur(2);

        //Statikse böyle erişicez
        //Universiteyi newlemeden kullanıyoruz eğer statikse

        /*Universite.Fakulte f1= new Universite.Fakulte();
        f1.fakulte_ismi = "Hukuk Fakültesi";
        System.out.println(f1.fakulte_ismi);*/


    }
}