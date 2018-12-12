import java.util.Objects;

public class Rodado {

    private int id;
    private String marca;
    private String modelo;
    private int año;
    private String color;
    private float cantkm;
    private float precio;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getCantkm() {
        return cantkm;
    }

    public void setCantkm(float cantkm) {
        this.cantkm = cantkm;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public Rodado(int id, String marca, String modelo, int año, String color, float cantkm, float precio) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.color = color;
        this.cantkm = cantkm;
        this.precio = precio;
    }

    public Rodado(){

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rodado rodado = (Rodado) o;

        return getId() == rodado.getId();
    }

    @Override
    public int hashCode() {
        return getId();
    }

    @Override
    public String toString() {
        return  "id =" + id +
                ", marca ='" + marca + '\'' +
                ", modelo ='" + modelo + '\'' +
                ", año =" + año +
                ", color ='" + color + '\'' +
                ", cantkm =" + cantkm +
                ", precio =" + precio;
    }

}

