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
            System.out.println(item.toString());
        }
    }
/*
    public void buscar_borrar(int id){
        //buscar el auto del id en la coleccion y eliminarlo
        try{
        for (Auto item: coleccionAutos) {
            if(item.getId(id) == id){
                coleccionAutos.remove(id);
            }
        }}
        catch(NumberFormatException e){
            System.out.println("Debe ingresar un numero");
        }
    }*/


    //busca un id dado de un auto en la coleccion y si lo encuentra eliminarlo
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
    //elimina el auto que se busco en el metodo buscarAuto y lo elimina de la coleccion
    /*
    public void eliminarAuto(Auto auto){

        coleccionAutos.remove(auto);
    }*/

}
