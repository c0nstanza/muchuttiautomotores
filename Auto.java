import java.util.Objects;

public class Auto extends Rodado{

    private int cantpuertas;
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

    public Auto(int id, String marca, String modelo, int año, String color, float cantkm, float precio, int cantpuertas, float motor, int cantvalvulas, int baul) {
        super(id, marca, modelo, año, color, cantkm, precio);
        this.cantpuertas = cantpuertas;
        this.motor = motor;
        this.cantvalvulas = cantvalvulas;
        this.baul = baul;
    }

    public Auto(){

    }

    @Override
    public String toString() {
        return
                super.toString()+
                "cantpuertas=" + cantpuertas +
                ", motor=" + motor +
                ", cantvalvulas=" + cantvalvulas +
                ", baul=" + baul;
    }
}
