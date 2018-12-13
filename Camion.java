public class Camion extends Rodado {

    private int potencia;

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public Camion(int id, String marca, String modelo, int año, String color, float cantkm, float precio, int potencia) {
        super(id, marca, modelo, año, color, cantkm, precio);
        this.potencia = potencia;
    }

    public Camion(){

    }
    @Override
    public String toString() {
        return super.toString()+
                " Potencia = " + potencia;
    }
}
