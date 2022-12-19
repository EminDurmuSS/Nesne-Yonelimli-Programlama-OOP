package test;

public class Otomobil {
    public  Otomobil(String renk,String cant){
        this.renk=renk;
        this.cant=cant;
    }
    public  Otomobil(){
        this.renk="Mavi";
        this.cant="Normal";
        //this("Mavi","Normal");
    }
    private String renk;
    private String cant;
    private String model ="Auidi";
    private int en =2;
    private int boy=3;

    public String getModel() {
        return this.model;
    }
    public String getRenk() {
        return this.renk;
    }
    public int getBoy() {
        return this.boy;
    }
    public int getEn() {
        return this.en;
    }
    public String getCant() {
        return this.cant;
    }
    public void setRenk(String a){
        this.renk=a;
    }

}
