
package Vista;

import Controlador.ControladorPersona;
import Modelo.Cantante;


import ec.edu.ups.clases.Modelo.Compositor;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class VistaGeneral {
    public  void otrowhile() {
        Scanner mm = new Scanner(System.in);
        boolean s = true;
        while (s) {
            int c = mm.nextInt();
            switch (c) {
                case 1:
                    System.out.println("Estas en el segundo menu");
                    
                    break;
                case 2:
                    s = false;
                    break;
                case 3:
                VistaCantante vistaCantante = new VistaCantante();
                vistaCantante.imCantante();

                case 4:
                VistaCompositor vistaCompositor = new VistaCompositor();
                vistaCompositor.imCompositor();

                case 5:
                Cantante vistaCantante1 = new Cantante();
                Compositor compositor = new Compositor();
                compositor.agregarCliente(vistaCantante1);

                case 6:
                ControladorPersona controladorPersona = new ControladorPersona();
                controladorPersona.list();

                case 7:
                System.out.println("Ingrese el titulo del disco a buscar: ");
                Scanner entrada1 = new Scanner(System.in);
                String tituloDisco = entrada1.next();
                Compositor compositor1 = new Compositor();
                compositor1.buscarNombreDeCancion(tituloDisco);

                case 8:
                System.out.println("Ingrese el nombre de la cancion a buscar: ");
                Scanner entrada2 = new Scanner(System.in);
                String tituloCancion = entrada2.next();
                Cantante cantante = new Cantante();
                cantante.buscarNombreDeCancion(tituloCancion);

                break;    
                
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
                
            }       
        }
    }  
}
