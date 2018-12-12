public class Moto extends Rodado{
    private int cilindrada;

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public Moto(int id, String marca, String modelo, int año, String color, float cantkm, float precio, int cilindrada) {
        super(id, marca, modelo, año, color, cantkm, precio);
        this.cilindrada = cilindrada;
    }
    //constructor por default
    public Moto(){

    }

    @Override
    public String toString() {
        return  super.toString() +
                " Cilindrada=" + cilindrada;
    }
}
