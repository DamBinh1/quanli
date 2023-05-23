package quanli;

public class Kysu extends  Canbo{
    private String nganh;
    public Kysu(String name, int age, int id, String address,String nganh){
        super(name,age,id,address);
        this.nganh=nganh;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }
}
