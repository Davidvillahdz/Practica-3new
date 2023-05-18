
package Controlador;

import Dao.CantanteDAO;
import Modelo.Cantante;
import Modelo.Disco;
import Modelo.Persona;
import Vista.VistaCantante;
import Vista.VistaDisco;
import java.util.List;


public class ControladorCantante {
    //vista
    private VistaCantante vistaCantante;
    private VistaDisco vistaDisco;
    //modelo 
    private Cantante cantante;
    private Disco disco;
    //DAO
    
   private CantanteDAO cantanteDAO;

    public ControladorCantante(VistaCantante vistaCantante, VistaDisco vistaDisco, Cantante cantante, Disco disco, CantanteDAO cantanteDAO) {
        this.vistaCantante = vistaCantante;
        this.vistaDisco = vistaDisco;
        this.cantante = cantante;
        this.disco = disco;
        this.cantanteDAO = cantanteDAO;
    }
   public void registrar(){
       cantante = vistaCantante.ingresarCantante();
       cantanteDAO.create(cantante);
   }
   public void verCantante(){
       int codigo = vistaCantante.buscarCantante();
       cantanteDAO.read(codigo);
       vistaCantante.verCantante(cantante);
   }
   public void actualizar(){
       cantante = vistaCantante.actualizarCantante();
       cantanteDAO.update(cantante);
   }
   public void eliminarCantante(){
       cantante = vistaCantante.eliminarCantante();
       cantanteDAO.delete(cantante);
   }
   public void verCantantes(){
       List<Cantante> listacantantes;
       listacantantes = cantanteDAO.findAll();
       vistaCantante.verCantante(cantante);
   }
    public void agregarDisco(){
        int codigo = vistaCantante.buscarCantante();
        cantante = cantanteDAO.read(codigo);
        vistaCantante.verCantante(cantante);
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
