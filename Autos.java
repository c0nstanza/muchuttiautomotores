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

    //lista la coleccion de autos
    public void listar(){
        System.out.println("\n");
        System.out.println("Lista de Autos");
        System.out.println("---------------");
        for (Auto item:coleccionAutos) {
            System.out.println(item.toString());
        }
    }

    //busca un id dado de un auto en la coleccion y si lo encuentra lo elimina
    public void buscar_borrar_Auto(int id){
        Auto auto_buscado = null;
        for (Auto item : coleccionAutos) {
            if(item.getId() == id){
                auto_buscado = item;
            }
        }
        if (auto_buscado != null){
            coleccionAutos.remove(auto_buscado);
        }else
            System.out.println("No se ha encontrado el ID "+id+" dentro de la coleccion");
    }

    //trata la modificacion de un auto indicando su id
    public void buscar_modificar_Auto(int id){
        Auto auto_buscado = null;
        for (Auto item : coleccionAutos) {
            if(item.getId() == id){
                auto_buscado = item;
            }                               ////falta terminar
        }
        if (auto_buscado != null){
            System.out.println("Que campo desea modificar?");
           // auto_buscado.setMarca(texto);
        }else
            System.out.println("No se ha encontrado el ID "+id+" dentro de la coleccion");
    }
}
