import java.util.List;
import java.util.Scanner;

public class Menu {

    private Autos listaAuto;

    public void setListaAuto(Autos listaAuto) {
        this.listaAuto = listaAuto;
    }

    public final static void clearConsole()
    {
        try
        {
            final String os = System.getProperty("os.name");

            if (os.contains("Windows"))
            {
                Runtime.getRuntime().exec("cls");
            }
            else
            {
                Runtime.getRuntime().exec("clear");
            }
        }
        catch (final Exception e)
        {
            //  Handle any exceptions.
        }
    }

    public void TratarAltaAuto(){
        Scanner sc = new Scanner(System.in);
        String texto;
        int continuar = 1;
        while (continuar == 1) {
            Auto auto = new Auto();
            System.out.println("Ingrese marca: ");
            texto = sc.next();
            auto.setMarca(texto);
            System.out.println("Modelo: ");
            texto = sc.next();
            auto.setModelo(texto);
            System.out.println("Año: ");
            texto = sc.next();
            auto.setAño(Integer.parseInt(texto));
            listaAuto.Agregar(auto);
            System.out.println("Desea dar de alta otro auto? 1. Si / X. No");
            texto = sc.next();
            continuar = (Integer.parseInt(texto));
            if (continuar != 1) {
                mostrar();
            }
        }
    }

    public void mostrar(){
        Scanner sc = new Scanner(System.in);
        int opcion;

        System.out.println("/-/-/-/-/- MUCHUTTI AUTOS -/-/-/-/-/");
        System.out.println("Elija la operacion que desea realizar:");
        System.out.println("1. Alta");
        System.out.println("2. Baja");
        System.out.println("3. Modificacion");
        System.out.println("4. Listar rodados");
        System.out.println("5. Salir");
        opcion = sc.nextInt();
        clearConsole();
        switch (opcion){
            case 1:
                sc = new Scanner(System.in);
                System.out.println("Que desea dar de alta?");
                System.out.println("1. Auto");
                System.out.println("2. Moto");
                System.out.println("3. Camioneta");
                System.out.println("4. Camion");
                System.out.println("5. Volver al menu principal");
                opcion = sc.nextInt();
                clearConsole();
                switch (opcion) {
                    case 1: TratarAltaAuto();

                    case 4: listaAuto.Listar();

                }
        }
    }
}
