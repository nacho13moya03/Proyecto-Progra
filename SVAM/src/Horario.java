public class Horario {
    private String temprano;

    private String tarde;

    public Horario(){

    }

    public Horario(String temprano, String tarde) {
        this.temprano = temprano;
        this.tarde = tarde;
    }

    public String getTemprano() {
        return temprano;
    }

    public void setTemprano(String temprano) {
        this.temprano = temprano;
    }

    public String getTarde() {
        return tarde;
    }

    public void setTarde(String tarde) {
        this.tarde = tarde;
    }

}