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
        System.out.println("\n");
        System.out.println("Lista de Motos");
        System.out.println("---------------");
        for (Moto item : coleccionMotos) {
            System.out.println(item.toString());
        }
    }

    //busca un id dado de una moto en la coleccion y si lo encuentra lo elimina
    public void buscar_borrar_Moto(int id){
        Moto moto_buscada = null;
        for (Moto item : coleccionMotos) {
            if(item.getId() == id){
                 moto_buscada = item;
            }
        }
        if (moto_buscada != null){
            coleccionMotos.remove(moto_buscada);
        }else
            System.out.println("No se ha encontrado el ID "+id+" dentro de la coleccion");
    }


}