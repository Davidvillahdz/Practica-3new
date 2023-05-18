/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Dao.CompositorDAO;
import Modelo.Cancion;
import Modelo.Compositor;
import Vista.VistaCancion;
import Vista.VistaCompositor;
import java.util.List;

/**
 *
 * @author HP
 */
public class ComtroladorCompositor {
  private VistaCompositor vistaCompositor;
    private VistaCancion vistaCancion;

    private Compositor compositor;
    private Cancion cancion;

    private IControladorCompositor compositorDAO;
    

    public ComtroladorCompositor(VistaCompositor vistaCompositor, CompositorDAO compositorDAO, VistaCancion vistaCancion) {
        this.vistaCompositor = vistaCompositor;
        this.compositorDAO = (IControladorCompositor) compositorDAO;
        this.vistaCancion = vistaCancion;
      
    }
    
    public void registrar() {
        compositor = vistaCompositor.ingresarCompositor();
        compositorDAO.create(compositor);
    }

    //llama al DAO para obtener un cliente por el id y luego los muestra en la vista
    public void verCantante() {
        int codigo = vistaCompositor.buscarCompositor();
        compositor = compositorDAO.read(codigo);
        vistaCompositor.verCompositor(compositor);
    }

    public void actualizar() {
        compositor = vistaCompositor.actualizarCompositor();
        compositorDAO.update(compositor);
    }

    public void eliminar() {
        compositor = vistaCompositor.eliminarCompositor();
        compositorDAO.delete(compositor);
    }

   
    public void verCompositores() {
        List<Compositor> compositores;
        compositores = compositorDAO.findAll();
        vistaCompositor.verCompositores(compositores);
    }

  
    public void agregarCancion() {
        int codigo = vistaCompositor.buscarCompositor();
        compositor = compositorDAO.read(codigo);
        vistaCompositor.verCompositor(compositor);
        compositor.agregarCancion(cancion);
    }   
}
