
package pkg22205015.pbo.lat55;

// * Nama         : Ahmad Nurfaqih
// * Nim          : 22205015
// * prodi        : Teknik Informatia
// * Deskripsi    : Handpone

class Handphone {
    
    protected String manufacture;
    protected String operatingSystem;
    protected String model;
    protected int harga;
    
    public Handphone(String man, String os, String model, int harga){
        this.manufacture = man;
        this.operatingSystem = os;
        this.model = model;
        this.harga = harga;
    }
    
    public void displayProduct(){
        System.out.println("Manufaktur : " + this.manufacture);
        System.out.println("OS : " + this.operatingSystem);
        System.out.println("Model : " + this.model);
        System.out.println("Harga : Rp " + this.harga);
    }
}

class Android extends Handphone{
    
    private String keyStore;
    
    public Android(String man, String os, String model, int harga){
        super(man,os,model,harga);
    }
    
    public String getKeyStore(){
        return keyStore;
    }
    
    public void setKeyStore(String keyStore){
        this.keyStore = keyStore;
    }
}

class Blackberry extends Handphone{
    
    private String pinBB;
    
    public Blackberry(String man, String os, String model, int harga){
        super(man,os,model,harga);
    }
    
    public String getPinBB(){
        return pinBB;
    }
    
    public void setPinBB(String pinBB){
        this.pinBB = pinBB;
    }
}
class WindowsPhone extends Handphone{
    
    private String wpKeyStore;
    
    public WindowsPhone(String man, String os, String model, int harga){
        super(man,os,model,harga);
    }
    
    public String getWpKeyStore(){
        return wpKeyStore;
    }
    
    public void setWpKeyStore(String wpKeyStore){
        this.wpKeyStore = wpKeyStore;
    }
}

public class PBOLAT55 {
    public static void main(String[] args) {
        System.out.println("===LATIHAN 55===\n");
        
        Android oo1 = new Android("Samsung","Android","Grand",3000000);
        oo1.displayProduct();
        oo1.setKeyStore("234ibfd3840fo");
        System.out.println("Android Key Store : " + oo1.getKeyStore());
        System.out.println();
        
        Blackberry oo2 = new Blackberry("BlackB","RIM","Curve",2000000);
        oo2.displayProduct();
        oo2.setPinBB("BHS249");
        System.out.println("PIN : " + oo2.getPinBB());
        System.out.println();
        
        WindowsPhone oo3 = new WindowsPhone("Nokia","Win8","Lumia",1000000);
        oo3.displayProduct();
        oo3.setWpKeyStore("UUUQIJWORJ");
        System.out.println("Wp Key Store : " + oo3.getWpKeyStore());

    }
    
}
