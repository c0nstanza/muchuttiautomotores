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

    //trata la modificacion de un camion indicando su id
    public void buscar_modificar_Camion(int id){
        Scanner sc = new Scanner(System.in);
        int opcion;
        String texto;
        Camion camion_buscado = null;
        for (Camion item : coleccionCamiones) {
            if(item.getId() == id){
                camion_buscado = item;
            }
        }
        if (camion_buscado != null){
            System.out.println("Que desea modificar?");
            System.out.println("1. Marca\n2. Modelo:\n3. Año\n4. Color\n5. Cant de km\n6. Precio\n7. Potencia");
            System.out.print("Opcion: ");
            opcion = sc.nextInt();
            switch (opcion){
                case 1:
                    System.out.print("Marca: ");
                    texto = sc.next();
                    camion_buscado.setMarca(texto);
                    coleccionCamiones.add(id-1,camion_buscado);
                    coleccionCamiones.remove(camion_buscado);
                    break;
                case 2:
                    System.out.print("Modelo: ");
                    texto = sc.next();
                    camion_buscado.setModelo(texto);
                    coleccionCamiones.add(id-1,camion_buscado);
                    coleccionCamiones.remove(camion_buscado);
                    break;
                case 3:
                    System.out.print("Año: ");
                    texto = sc.next();
                    camion_buscado.setAño(Integer.parseInt(texto));
                    coleccionCamiones.add(id-1,camion_buscado);
                    coleccionCamiones.remove(camion_buscado);
                    break;
                case 4:
                    System.out.print("Color: ");
                    texto = sc.next();
                    camion_buscado.setColor(texto);
                    coleccionCamiones.add(id-1,camion_buscado);
                    coleccionCamiones.remove(camion_buscado);
                    break;
                case 5:
                    System.out.print("Cantidad de km: ");
                    texto = sc.next();
                    camion_buscado.setCantkm(Integer.parseInt(texto));
                    coleccionCamiones.add(id-1,camion_buscado);
                    coleccionCamiones.remove(camion_buscado);
                    break;
                case 6:
                    System.out.print("Precio: $");
                    texto = sc.next();
                    camion_buscado.setPrecio(Integer.parseInt(texto));
                    coleccionCamiones.add(id-1,camion_buscado);
                    coleccionCamiones.remove(camion_buscado);
                    break;
                case 7:
                    System.out.print("Potencia: ");
                    texto = sc.next();
                    camion_buscado.setPotencia(Integer.parseInt(texto));
                    coleccionCamiones.add(id-1,camion_buscado);
                    coleccionCamiones.remove(camion_buscado);
            }
        }else {
            System.out.println("No se ha encontrado el ID " + id + " dentro de la coleccion de autos");
            System.out.println("No se pudo realizar la operacion.");
        }
    }


}