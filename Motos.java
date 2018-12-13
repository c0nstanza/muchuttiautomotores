import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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

    //trata la modificacion de una moto indicando su id
    public void buscar_modificar_Moto(int id){
        Scanner sc = new Scanner(System.in);
        int opcion;
        String texto;
        Moto moto_buscada = null;
        for (Moto item : coleccionMotos) {
            if(item.getId() == id){
                moto_buscada = item;
            }
        } //si es distinto de null es porque encontro la moto con id ingresado
        if (moto_buscada != null){
            System.out.println("Que desea modificar?");
            System.out.println("1. Marca\n2. Modelo\n3. Año\n4. Color\n5. Cant de km\n6. Precio\n7. Cilindrada: ");
            System.out.print("Opcion: ");
            opcion = sc.nextInt();
            switch (opcion){
                case 1:
                    System.out.print("Marca: ");
                    texto = sc.next();
                    moto_buscada.setMarca(texto);
                    coleccionMotos.add(id-1,moto_buscada);
                    coleccionMotos.remove(moto_buscada);
                    break;
                case 2:
                    System.out.print("Modelo: ");
                    texto = sc.next();
                    moto_buscada.setModelo(texto);
                    coleccionMotos.add(id-1,moto_buscada);
                    coleccionMotos.remove(moto_buscada);
                    break;
                case 3:
                    System.out.print("Año: ");
                    texto = sc.next();
                    try {
                        moto_buscada.setAño(Integer.parseInt(texto));
                    }catch(NumberFormatException ex) {
                        System.out.println("Error. Esto es un campo numerico.");
                        System.out.print("Año: ");
                        texto = sc.next();
                        moto_buscada.setAño(Integer.parseInt(texto));
                    }
                    coleccionMotos.add(id-1,moto_buscada);
                    coleccionMotos.remove(moto_buscada);
                    break;
                case 4:
                    System.out.print("Color: ");
                    texto = sc.next();
                    moto_buscada.setColor(texto);
                    coleccionMotos.add(id-1,moto_buscada);
                    coleccionMotos.remove(moto_buscada);
                    break;
                case 5:
                    System.out.print("Cantidad de km: ");
                    texto = sc.next();
                    try {
                        moto_buscada.setCantkm(Float.parseFloat(texto));
                    }catch(NumberFormatException ex) {
                        System.out.println("Error. Esto es un campo numerico.");
                        System.out.print("Cantidad de km: ");
                        texto = sc.next();
                        moto_buscada.setCantkm(Float.parseFloat(texto));
                    }
                    coleccionMotos.add(id-1,moto_buscada);
                    coleccionMotos.remove(moto_buscada);
                    break;
                case 6:
                    System.out.print("Precio: $");
                    texto = sc.next();
                    try{
                        moto_buscada.setPrecio(Float.parseFloat(texto));
                    }catch (NumberFormatException ex){
                        System.out.println("Error. Esto es un campo numerico.");
                        System.out.print("Precio: " );
                        texto = sc.next();
                        moto_buscada.setPrecio(Float.parseFloat(texto));
                    }
                    coleccionMotos.add(id-1,moto_buscada);
                    coleccionMotos.remove(moto_buscada);
                    break;
                case 7:
                    System.out.print("Cilindrada: ");
                    texto = sc.next();
                    try {
                        moto_buscada.setCilindrada(Integer.parseInt(texto));
                    }catch (NumberFormatException ex) {
                        System.out.println("Error. Esto es un campo numerico.");
                        System.out.print("Cilindrada: ");
                        texto = sc.next();
                        moto_buscada.setCilindrada(Integer.parseInt(texto));
                    }
                    coleccionMotos.add(id-1,moto_buscada);
                    coleccionMotos.remove(moto_buscada);
                    break;
            }
        }else {
            System.out.println("No se ha encontrado el ID " + id + " dentro de la coleccion de autos");
            System.out.println("No se pudo realizar la operacion.");
        }
    }


}