public class Auto extends Rodado{

    private int cantpuertas;
    private enum tipocaja{
        AUTO, MANUAL
    }
    private float motor;
    private int cantvalvulas;
    private int baul;

    public int getCantpuertas() {
        return cantpuertas;
    }

    public void setCantpuertas(int cantpuertas) {
        this.cantpuertas = cantpuertas;
    }

    public float getMotor() {
        return motor;
    }

    public void setMotor(float motor) {
        this.motor = motor;
    }

    public int getCantvalvulas() {
        return cantvalvulas;
    }

    public void setCantvalvulas(int cantvalvulas) {
        this.cantvalvulas = cantvalvulas;
    }

    public int getBaul() {
        return baul;
    }

    public void setBaul(int baul) {
        this.baul = baul;
    }

    public Auto(){

    }

    public Auto(int cantpuertas, float motor, int cantvalvulas, int baul, String marca, String modelo, int año) {
        this.cantpuertas = cantpuertas;
        this.motor = motor;
        this.cantvalvulas = cantvalvulas;
        this.baul = baul;
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setAño(año);
    }

    @Override
    public String toString() {
        return "Auto{" +
                "marca ="+ this.getMarca() +
                "modelo ="+ this.getModelo() +
                "año ="+ this.getAño() +
                "cantpuertas =" + cantpuertas +
                ", motor =" + motor +
                ", cantvalvulas =" + cantvalvulas +
                ", baul =" + baul +
                '}';
    }
}
