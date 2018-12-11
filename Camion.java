public class Camion extends Rodado {

    private int potencia;

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return "Camion{" +
                "potencia=" + potencia +
                '}';
    }
}
