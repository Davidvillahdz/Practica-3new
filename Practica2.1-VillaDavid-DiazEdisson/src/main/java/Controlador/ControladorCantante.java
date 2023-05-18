
package Controlador;

import Dao.CantanteDAO;
import Modelo.Cantante;
import Modelo.Disco;
import Modelo.Persona;
import Vista.VistaCantante;
import Vista.VistaDisco;
import java.util.List;


public class ControladorCantante {
    private VistaCantante vistacantante;
    private VistaDisco vistaDisco;
    private Cantante cantante;
    private Disco disco;
    private CantanteDAO cantanteDAO;
   public ControladorCantante(VistaCantante vistaCantante, VistaDisco vistaDisco, Cantante cantante, Disco disco, CantanteDAO cantanteDAO) {
        this.vistacantante = vistaCantante;
        this.vistaDisco = vistaDisco;
        this.cantante = cantante;
        this.disco = disco;
        this.cantanteDAO = cantanteDAO;
    }
   public void registrar(){
       cantante = vistacantante.ingresarCantante();
       cantanteDAO.create(cantante);
   }
   public void verCantante(){
       int codigo = vistacantante.buscarCantante();
       cantanteDAO.read(codigo);
       vistacantante.verCantante(cantante);
   }
   public void actualizar(){
       cantante = vistacantante.actualizarCantante();
       cantanteDAO.update(cantante);
   }
   public void eliminarCantante(){
       cantante = vistacantante.eliminarCantante();
       cantanteDAO.delete(cantante);
   }
   public void verCantantes(){
       List<Cantante> listacantantes;
       listacantantes = cantanteDAO.findAll();
       vistacantante.verCantante(cantante);
   }
    public void agregarDisco(){
        int codigo = vistacantante.buscarCantante();
        cantante = cantanteDAO.read(codigo);
        vistacantante.verCantante(cantante);
        cantante.agregarDisco(disco);
    }
    public void eliminarDisco(){
        int idDisco =  VistaDisco.readcodigo();
        int idCantante = VistaCantante.readId();
        cantante = cantanteDAO.read(idCantante);
        cantante.eliminarDisco(idDisco);
        cantanteDAO.update(cantante);
    }
}
