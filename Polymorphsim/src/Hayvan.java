public class Hayvan {
    private String HayvanAdi;
    public Hayvan(String HayvanAdi){
        this.HayvanAdi=HayvanAdi;
    }
    public void setHayvanAdi(String hayvanAdi) {
        HayvanAdi = hayvanAdi;
    }
    public  String GethayvanAdi(){
        return this.HayvanAdi;
    }
    public  void sesCikar(){
        System.out.println(this.HayvanAdi+" Ses çıkarıyor");
    }


}
