import java.util.Scanner;

class Hp {
    String merk;
    String model;
    Double harga;
    int tahunProduksi;
    String deskripsi;

    public Hp(){

    }
    
    public Hp(String merk, String model, Double harga, int tahunProduksi, String deskripsi) {
        this.merk = merk;
        this.model = model;
        this.harga = harga;
        this.tahunProduksi = tahunProduksi;
        this.deskripsi = deskripsi;
    }
    public String getMerk() {
        return merk;
    }
    public void setMerk(String merk) {
        this.merk = merk;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public Double getHarga() {
        return harga;
    }
    public void setHarga(Double harga) {
        this.harga = harga;
    }
    public int getTahunProduksi() {
        return tahunProduksi;
    }
    public void setTahunProduksi(int tahunProduksi) {
        this.tahunProduksi = tahunProduksi;
    }
    public String getDeskripsi() {
        return deskripsi;
    }
    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }


    public void displayInfo(){
        System.out.println("Merek: "+ getMerk());
        System.out.println("model: "+ getModel());
        System.out.println("harga: "+ getHarga());
        System.out.println("Tahun Produksi: "+ getTahunProduksi());
        System.out.println("Deskripsi: "+ getDeskripsi());

    }

}


public class Main {
    public static void main(String[] args) {
        
        Hp hp1 = new Hp("Iphone", "11", 90000.00, 2019, "sangat mahal");

        hp1.displayInfo();

        Hp hp2 = new Hp ();
        hp2.setMerk("samsung");
        hp2.setModel("7");
        hp2.setHarga(7000.00);
        hp2.setTahunProduksi(2018);
        hp2.setDeskripsi("cukup mahal");

        System.out.println(hp2.getMerk());
        System.out.println(hp2.getModel());
        System.out.println(hp2.getHarga());
        System.out.println(hp2.getTahunProduksi());
        System.out.println(hp2.getDeskripsi());

        SelfUtils.displaySelfData();
    }
}

class SelfUtils{

    public static void displaySelfData(){
        System.out.println("Nama: Muh. Aipun Pratama");
        System.out.println("NIM: H071231045");

        
    }
}
