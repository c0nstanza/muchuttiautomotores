import java.util.ArrayList;
import java.util.List;

public class Motos {

    private List<Moto> coleccionMotos;

    //Constructor, instancia la clase con una nueva coleccion
    public Motos(){
        coleccionMotos = new ArrayList<Moto>();
    }

    //Funcion que permite agregar una moto a la colecciòn
    public void agregar(Moto moto){
        coleccionMotos.add(moto);
    }

    //Imprime un listado de la coleccion de motos
    public void listar(){
        System.out.println("Lista de Motos");
        System.out.println("---------------");
        for (Moto item : coleccionMotos) {
            System.out.println(item.getMarca());
        }
    }
    /*
    //busca un id dado de una moto en la coleccion
    public Moto buscarMoto(int id){
        Moto moto_buscada = null;
        for (Moto item : coleccionMotos) {
            if(item.getId(id_ingresado) == id){
                moto_buscada = item;
            }
        }
        return moto_buscada;
    }
    //elimina la moto que se busco en el metodo BuscarMoto y la elimina de la coleccion
    public void eliminarMoto(Moto moto){
        coleccionMotos.remove(moto);
    }*/

    public void buscar_borrar(int id){
        //buscar el id de la camioneta en la coleccion y eliminarlo
        for (Moto item: coleccionMotos) {
            if(item.getId(id) == id){
                coleccionMotos.remove(id);
            }
        }
    }
}