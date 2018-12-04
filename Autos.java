import java.util.ArrayList;
import java.util.List;

public class Autos {

    private List<Auto> coleccionAutos;

   /*
        Constructor, instancia la clase con una nueva coleccion
   */
    public Autos(){
        coleccionAutos = new ArrayList<Auto>();
    }

    /*
        Funcion que permite agregar un auto a la colecciòn
    */
    public void Agregar(Auto auto){
        coleccionAutos.add(auto);
    }

    public void Listar(){
        System.out.println("Lista de Autos");
        System.out.println("---------------");
        for (Auto item:coleccionAutos) {
            System.out.println(item.getMarca());
        }
    }

    /*
    *
    */
    public Auto BuscarAuto(int id){
        //buscar el auto del id en la coleccion
        Auto ret = null;
        for (Auto item: coleccionAutos) {
            if(item.getId() == id){
                ret = item;
            }
        }

        return ret;
    }


    public void EliminarAuto(Auto auto)
    {
        coleccionAutos.remove(auto);
    }


}
