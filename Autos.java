import java.util.ArrayList;
import java.util.List;

public class Autos {

    private List<Auto> coleccionAutos;

   //Constructor, instancia la clase con una nueva coleccion
       public Autos(){
        coleccionAutos = new ArrayList<Auto>();
    }

    //Funcion que permite agregar un auto a la colecciòn
       public void agregar(Auto auto){
        coleccionAutos.add(auto);
    }

    public void listar(){
        System.out.println("Lista de Autos");
        System.out.println("---------------");
        for (Auto item:coleccionAutos) {
            System.out.println(item.getMarca());
        }
    }

    public void buscar_borrar(int id){
        //buscar el auto del id en la coleccion y eliminarlo
        for (Auto item: coleccionAutos) {
            if(item.getId(id) == id){
                coleccionAutos.remove(id);
            }
        }
    }
}
