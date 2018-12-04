import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main (String[]args){
        //List<Auto> listaAuto = new ArrayList<Auto>();
        Autos autos = new Autos();
        Menu menu = new Menu();
        menu.setListaAuto(autos);
        menu.mostrar();
    }



}
