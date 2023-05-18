
package Dao;



import Controlador.IControladorCompositor;
import Modelo.Compositor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author HP
 */
public class CompositorDAO implements IControladorCompositor {
    //Atributos
    private List<Compositor> listaCompositor;

    public CompositorDAO() {
        listaCompositor = new ArrayList<>();
    }

    @Override
    public void create(Compositor compositor) {
        listaCompositor.add(compositor);
    }

    @Override
    public Compositor read(int codigo) {
        for (Compositor compositor : listaCompositor) {
            if (compositor.getCodigo() == codigo) {
                return compositor;
            }
        }
        return null;
    }

    @Override
    public void update(Compositor compositor) {
        for (int i = 0; i < listaCompositor.size(); i++) {
            Compositor c = listaCompositor.get(i);
            if (c.getCodigo() == compositor.getCodigo()) {
                listaCompositor.set(i, compositor);
                break;
            }
        }

    }

    @Override
    public void delete(Compositor compositor) {
        Iterator<Compositor> it = listaCompositor.iterator();
        while (it.hasNext()) {
            Compositor d = it.next();
            if (d.getCodigo() == compositor.getCodigo()) {
                it.remove();
                break;
            }
        }
    }

    @Override
    public List<Compositor> findAll() {
        return listaCompositor;
    }
}

