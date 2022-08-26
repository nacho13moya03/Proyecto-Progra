public class Sucursal {
    private String sede1;
    private String sede2;
    private String sede3;

    public Sucursal(){

    }

    public Sucursal(String sede1, String sede2, String sede3) {
        this.sede1 = sede1;
        this.sede2 = sede2;
        this.sede3 = sede3;
    }

    public String getSede1() {
        return sede1;
    }

    public void setSede1(String sede1) {
        this.sede1 = sede1;
    }

    public String getSede2() {
        return sede2;
    }

    public void setSede2(String sede2) {
        this.sede2 = sede2;
    }

    public String getSede3() {
        return sede3;
    }
    
    public void setSede3(String sede3) {
        this.sede3 = sede3;
    }

}