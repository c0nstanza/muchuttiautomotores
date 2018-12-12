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
        System.out.println("\n");
        System.out.println("Lista de Camionetas");
        System.out.println("---------------");
        for (Camioneta item : coleccionCamionetas) {
            System.out.println(item.toString());
        }
    }

    //busca un id dado de una camioneta en la coleccion y si lo encuentra lo elimina
    public void buscar_borrar_Camioneta(int id){
        Camioneta camioneta_buscada = null;
        for (Camioneta item : coleccionCamionetas) {
            if(item.getId() == id){
                camioneta_buscada = item;
            }
        }
        if (camioneta_buscada != null){
            coleccionCamionetas.remove(camioneta_buscada);
        }else
            System.out.println("No se ha encontrado el ID "+id+" dentro de la coleccion");
    }

}
