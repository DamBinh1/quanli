package quanli;

public class Nhanvien extends Canbo{
    private String congviec;
    public Nhanvien(String name, int age, int id, String address,String congviec){
        super(name,age,id,address);
        this.congviec=congviec;
    }

    public String getCongviec() {
        return congviec;
    }

    public void setCongviec(String congviec) {
        this.congviec = congviec;
    }
}


