
package Test;

import Controlador.ControladorPersona;
import Modelo.Cantante;
import Modelo.Compositor;
import Vista.VistaCantante;
import Vista.VistaCompositor;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option = 0;
        Cantante cantante = new Cantante();
        Compositor compositor = new Compositor();

        boolean salir = false;
        while (!salir) {
            System.out.println("Menú Principal");
            System.out.println("1. Ingreso de Cantante");
            System.out.println("2. Ingreso de Compositor");
            System.out.println("3. Agregar Clientes");
            System.out.println("4. Imprimir persona");
            System.out.println("5. Búsqueda de cantante por nombre de disco");
            System.out.println("6. Búsqueda de compositor por nombre de canción");
            System.out.println("7. Salir");
            System.out.print("Ingrese una opción que quiera: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de lí
            switch (option) {
                case 1:
                    VistaCantante vistaCantante = new VistaCantante();
                    vistaCantante.ingresarCantante();
                    
                    break;
                case 2:
                    VistaCompositor vistaCompositor = new VistaCompositor();
                    vistaCompositor.ingresarCompositor();
                    
                    break;
                case 3:
                    Cantante vistaCantante1 = new Cantante();
                    compositor.agregarCliente(vistaCantante1);
                    
                    break;
                case 4:
                    ControladorPersona controladorPersona = new ControladorPersona();
                    controladorPersona.list();
                    break;
                case 5:
                    System.out.println("Ingrese el titulo del disco a buscar: ");
                    Scanner principal = new Scanner(System.in);
                    String tituloDisco = principal.next();
                    Compositor compositor1 = new Compositor();
                    compositor1.buscarNombreDeCancion(tituloDisco);
                    
                    break;
                case 6:
                    System.out.println("Ingrese el nombre de la cancion a buscar: ");
                    Scanner entrada2 = new Scanner(System.in);
                    String tituloCancion = entrada2.next();
                    cantante.buscarNombreDeCancion(tituloCancion);
                    
                    break;
                case 7:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }     
        } 
        System.out.println("¡Adios vuelva pronto!");
    }
}