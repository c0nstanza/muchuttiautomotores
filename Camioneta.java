public class Camioneta extends Rodado {

    private boolean traccion;

    public boolean isTraccion() {
        return traccion;
    }

    public void setTraccion(boolean traccion) {
        this.traccion = traccion;
    }

    public Camioneta(int id, String marca, String modelo, int año, String color, float cantkm, float precio, boolean traccion) {
        super(id, marca, modelo, año, color, cantkm, precio);
        this.traccion = traccion;
    }
    //constructor por default
    public Camioneta(){

    }

    @Override
    public String toString() {
        return super.toString() +
                " 4x4? = " + traccion;
    }
}
