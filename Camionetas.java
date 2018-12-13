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

    //trata la modificacion de una camioneta indicando su id
    public void buscar_modificar_Camioneta(int id){
        Scanner sc = new Scanner(System.in);
        int opcion, texto2;
        String texto;
        Camioneta camioneta_buscada = null;
        for (Camioneta item : coleccionCamionetas) {
            if(item.getId() == id){
                camioneta_buscada = item;
            }
        }
        if (camioneta_buscada != null){
            System.out.println("Que desea modificar?");
            System.out.println("1. Marca\n2. Modelo\n3. Año\n4. Color\n5. Cant de km\n6. Precio\n7. 4x4?");
            System.out.print("Opcion: ");
            opcion = sc.nextInt();
            switch (opcion){
                case 1:
                    System.out.print("Marca: ");
                    texto = sc.next();
                    camioneta_buscada.setMarca(texto);
                    coleccionCamionetas.add(id-1,camioneta_buscada);
                    coleccionCamionetas.remove(camioneta_buscada);
                    break;
                case 2:
                    System.out.print("Modelo: ");
                    texto = sc.next();
                    camioneta_buscada.setModelo(texto);
                    coleccionCamionetas.add(id-1,camioneta_buscada);
                    coleccionCamionetas.remove(camioneta_buscada);
                    break;
                case 3:
                    System.out.print("Año: ");
                    texto = sc.next();
                    try {
                        camioneta_buscada.setAño(Integer.parseInt(texto));
                    }catch(NumberFormatException ex){
                        System.out.println("Error. Esto es un campo numerico.");
                        System.out.print("Año: " );
                        texto = sc.next();
                        camioneta_buscada.setAño(Integer.parseInt(texto));
                    }
                    coleccionCamionetas.add(id-1,camioneta_buscada);
                    coleccionCamionetas.remove(camioneta_buscada);
                    break;
                case 4:
                    System.out.print("Color: ");
                    texto = sc.next();
                    camioneta_buscada.setColor(texto);
                    coleccionCamionetas.add(id-1,camioneta_buscada);
                    coleccionCamionetas.remove(camioneta_buscada);
                    break;
                case 5:
                    System.out.print("Cantidad de km: ");
                    texto = sc.next();
                    try{
                        camioneta_buscada.setCantkm(Float.parseFloat(texto));
                    }catch(NumberFormatException ex) {
                        System.out.println("Error. Esto es un campo numerico.");
                        System.out.print("Cantidad de km: ");
                        texto = sc.next();
                        camioneta_buscada.setCantkm(Float.parseFloat(texto));
                    }
                    coleccionCamionetas.add(id-1,camioneta_buscada);
                    coleccionCamionetas.remove(camioneta_buscada);
                    break;
                case 6:
                    System.out.print("Precio: $");
                    texto = sc.next();
                    try{
                        camioneta_buscada.setPrecio(Float.parseFloat(texto));
                    }catch (NumberFormatException ex){
                        System.out.println("Error. Esto es un campo numerico.");
                        System.out.print("Precio: " );
                        texto = sc.next();
                        camioneta_buscada.setPrecio(Float.parseFloat(texto));
                    }
                    coleccionCamionetas.add(id-1,camioneta_buscada);
                    coleccionCamionetas.remove(camioneta_buscada);
                    break;
                case 7:
                    System.out.print("4x4? 1. Si - 2. No: ");
                    texto2 = sc.nextInt();
                    if (texto2 == 1) camioneta_buscada.setTraccion(true); else camioneta_buscada.setTraccion(false);
                    coleccionCamionetas.add(id-1,camioneta_buscada);
                    coleccionCamionetas.remove(camioneta_buscada);
                    break;
            }
        }else {
            System.out.println("No se ha encontrado el ID " + id + " dentro de la coleccion de autos");
            System.out.println("No se pudo realizar la operacion.");
        }
    }

}
