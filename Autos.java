import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
        Scanner sc = new Scanner(System.in);
        int opcion;
        String texto;
        Auto auto_buscado = null;
        for (Auto item : coleccionAutos) {
            if(item.getId() == id){
                auto_buscado = item;
            }
        }
        if (auto_buscado != null){
            System.out.println("Que desea modificar?");
            System.out.println("1. Marca\n2. Modelo:\n3. Año\n4. Color\n5. Cant de km\n6. Precio");
            System.out.print("Opcion: ");
            opcion = sc.nextInt();
            switch (opcion){
                case 1:
                    System.out.print("Marca: ");
                    texto = sc.next();
                    auto_buscado.setMarca(texto);
                    coleccionAutos.add(id-1,auto_buscado);
                    coleccionAutos.remove(auto_buscado);
                case 2:
                    System.out.print("Modelo: ");
                    texto = sc.next();
                    auto_buscado.setModelo(texto);
                    coleccionAutos.add(id-1,auto_buscado);
                    coleccionAutos.remove(auto_buscado);
                case 3:
                    System.out.print("Año: ");
                    texto = sc.next();
                    auto_buscado.setAño(Integer.parseInt(texto));
                    coleccionAutos.add(id-1,auto_buscado);
                    coleccionAutos.remove(auto_buscado);
                case 4:
                    System.out.print("Color: ");
                    texto = sc.next();
                    auto_buscado.setColor(texto);
                    coleccionAutos.add(id-1,auto_buscado);
                    coleccionAutos.remove(auto_buscado);
                case 5:
                    System.out.print("Cantidad de km: ");
                    texto = sc.next();
                    auto_buscado.setCantkm(Integer.parseInt(texto));
                    coleccionAutos.add(id-1,auto_buscado);
                    coleccionAutos.remove(auto_buscado);
                case 6:
                    System.out.print("Precio: $");
                    texto = sc.next();
                    auto_buscado.setPrecio(Integer.parseInt(texto));
                    coleccionAutos.add(id-1,auto_buscado);
                    coleccionAutos.remove(auto_buscado);
                case 7:
                    System.out.print("Cantidad de puertas: ");
                    texto = sc.next();
                    auto_buscado.setCantpuertas(Integer.parseInt(texto));
                    coleccionAutos.add(id-1,auto_buscado);
                    coleccionAutos.remove(auto_buscado);
                case 8:
                    System.out.print("Motor: ");
                    texto = sc.next();
                    auto_buscado.setMotor(Integer.parseInt(texto));
                    coleccionAutos.add(id-1,auto_buscado);
                    coleccionAutos.remove(auto_buscado);
                case 9:
                    System.out.print("Cantidad de valvulas: ");
                    texto = sc.next();
                    auto_buscado.setCantvalvulas(Integer.parseInt(texto));
                    coleccionAutos.add(id-1,auto_buscado);
                    coleccionAutos.remove(auto_buscado);
                case 10:
                    System.out.print("Baul (litros): ");
                    texto = sc.next();
                    auto_buscado.setBaul(Integer.parseInt(texto));
                    coleccionAutos.add(id-1,auto_buscado);
                    coleccionAutos.remove(auto_buscado);
            }
        }else {
            System.out.println("No se ha encontrado el ID " + id + " dentro de la coleccion de autos");
            System.out.println("No se pudo realizar la operacion.");
        }
    }
}
