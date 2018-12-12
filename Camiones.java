import java.util.*;

public class Camiones {
    private List<Camion> coleccionCamiones;

    //Constructor, instancia la clase con una nueva coleccion
    public Camiones(){
        coleccionCamiones = new ArrayList<Camion>();
    }

    //Funcion que permite agregar un camion a la colecciòn
    public void agregar(Camion camion){
        coleccionCamiones.add(camion);
    }

    //Imprime un listado de la coleccion de camiones
    public void listar(){
        System.out.println("\n");
        System.out.println("Lista de Camiones");
        System.out.println("---------------");
        for (Camion item : coleccionCamiones) {
            System.out.println(item.toString());
        }
    }

    //busca un id dado de un camion en la coleccion y si lo encuentra lo elimina
    public void buscar_borrar_Camion(int id){
        Camion camion_buscado = null;
        for (Camion item : coleccionCamiones) {
            if(item.getId() == id){
                camion_buscado = item;
            }
        }
        if (camion_buscado != null){
            coleccionCamiones.remove(camion_buscado);
        }else
            System.out.println("No se ha encontrado el ID "+id+" dentro de la coleccion");
    }




}
