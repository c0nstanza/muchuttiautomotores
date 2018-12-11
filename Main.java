import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main (String[]args){
        Autos autos = new Autos();
        Motos motos = new Motos();
        Camionetas camionetas = new Camionetas();
        Camiones camiones = new Camiones();
        Menu menu = new Menu();
        menu.setListaAuto(autos);
        menu.setListaMoto(motos);
        menu.setListaCamioneta(camionetas);
        menu.setListaCamion(camiones);
        menu.mostrar();
    }



}
