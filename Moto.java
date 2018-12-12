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

    public Moto(){

    }

    @Override
    public String toString() {
        return "Moto{" +
                "cilindrada=" + cilindrada +
                '}';
    }
}
