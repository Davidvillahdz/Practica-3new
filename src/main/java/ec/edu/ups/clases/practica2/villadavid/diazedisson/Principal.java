
package ec.edu.ups.clases.practica2.villadavid.diazedisson;

import Modelo.Cantante;
import Vista.VistaCancion;
import Vista.VistaGeneral;
import ec.edu.ups.clases.Modelo.Compositor;
import java.util.Scanner;

public class Principal {
    
    private VistaCancion vc;
    
    
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
            scanner.nextLine(); // Consumir el salto de línea

            
           
                    VistaGeneral vistaGeneral = new VistaGeneral();
                    var vv=new VistaGeneral();
                    vv.otrowhile();
                    break;
        }       
    }
}