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
        System.out.println("Lista de Camiones");
        System.out.println("---------------");
        for (Camion item : coleccionCamiones) {
            System.out.println(item.getMarca());
        }
    }
    /*
    //busca un id dado de un camion en la coleccion
    public Camion buscarCamion(int id){
        Camion camion_buscado = null;
        for (Camion item : coleccionCamiones) {
            if(item.getId(id_ingresado) == id){
                camion_buscado = item;
            }
        }
        return camion_buscado;
    }
    //elimina el camion que se busco en el metodo buscarCamion y lo elimina de la coleccion
    public void eliminarCamion(Camion camion){
        coleccionCamiones.remove(camion);
    }*/

    public void buscar_borrar(int id){
        //buscar el id del camion en la coleccion y eliminarlo
        for (Camion item: coleccionCamiones) {
            if(item.getId(id) == id){
                coleccionCamiones.remove(id);
            }
        }
    }

}
