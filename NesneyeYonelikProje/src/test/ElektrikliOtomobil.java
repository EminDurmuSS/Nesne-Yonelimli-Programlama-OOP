package test;

public class ElektrikliOtomobil extends Otomobil {
    private String MotorAkuTipi;
    public ElektrikliOtomobil(int i) {
        super("Kırmızı","Demir");
        this.sarjDurumu=i;
    }
    public ElektrikliOtomobil(){

    }
    public void setMotorAkuTipi(String motorAkuTipi){
        this.MotorAkuTipi = motorAkuTipi;
    }
    public String getMotorAkuTipi(){
         return this.MotorAkuTipi;
    }
    public void ElektrikliOtomobil(int sarj){
    this.sarjDurumu=sarj;
    }
    private int sarjDurumu;
    public void sarjEt(){
        this.sarjDurumu=100;
    }
    public int getSarj(){
        int sarjDurumu1 = this.sarjDurumu;
        return sarjDurumu1 ;
    }

}
