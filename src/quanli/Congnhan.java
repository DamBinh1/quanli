package quanli;

public class Congnhan extends Canbo{
    private int bac;
    public Congnhan(String name, int age, int id, String address,int bac){
        super(name,age,id,address);
        this.bac=bac;
    }

    public int getBac() {
        return bac;
    }

    public void setBac(int bac) {
        this.bac = bac;
    }
}
