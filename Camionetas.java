import java.util.*;

public class Camionetas {
    private List<Camioneta> coleccionCamionetas;

    //Constructor, instancia la clase con una nueva coleccion
    public Camionetas(){
        coleccionCamionetas = new ArrayList<Camioneta>();
    }

    //Funcion que permite agregar una camioneta a la colecciòn
    public void agregar(Camioneta camioneta){
        coleccionCamionetas.add(camioneta);
    }

    //Imprime un listado de la coleccion de camionetas
    public void listar(){
        System.out.println("Lista de Camionetas");
        System.out.println("---------------");
        for (Camioneta item : coleccionCamionetas) {
            System.out.println(item.getMarca());
        }
    }
/*
    //busca un id dado de una camioneta en la coleccion
    public Camioneta buscarCamioneta(int id){

        Camioneta camioneta_buscada = null;
        for (Camioneta item : coleccionCamionetas) {
            if(item.getId(id) == id){
                camioneta_buscada = item;
            }
        }
        return camioneta_buscada;
    }
    //elimina la camioneta que se busco en el metodo buscarCamioneta y la elimina de la coleccion
    public void eliminarCamioneta(Camioneta camioneta){
        coleccionCamionetas.remove(camioneta);
    }*/

    public void buscar_borrar(int id){
        //buscar el id de la camioneta en la coleccion y eliminarlo
        for (Camioneta item: coleccionCamionetas) {
            if(item.getId(id) == id){
                coleccionCamionetas.remove(id);
            }
        }
    }
}
