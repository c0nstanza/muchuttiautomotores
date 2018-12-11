public class Camioneta extends Rodado {

    private boolean traccion;

    public boolean isTraccion() {
        return traccion;
    }

    public void setTraccion(boolean traccion) {
        this.traccion = traccion;
    }

    @Override
    public String toString() {
        return "Camioneta{" +
                "4x4? =" + traccion +
                '}';
    }
}
