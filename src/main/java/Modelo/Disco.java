
package Modelo;

public class Disco {
    private int codigo;
    private String nombredisco;
    private int anioDeLanzamiento;

    public Disco() {
    }

    public Disco(int codigo, String nombredisco, int anioDeLanzamiento) {
        this.codigo = codigo;
        this.nombredisco = nombredisco;
        this.anioDeLanzamiento = anioDeLanzamiento;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombredisco() {
        return nombredisco;
    }

    public void setNombredisco(String nombredisco) {
        this.nombredisco = nombredisco;
    }

    public int getAnioDeLanzamiento() {
        return anioDeLanzamiento;
    }

    public void setAnioDeLanzamiento(int anioDeLanzamiento) {
        this.anioDeLanzamiento = anioDeLanzamiento;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.codigo;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Disco other = (Disco) obj;
        return this.codigo == other.codigo;
    }

    @Override
    public String toString() {
        return "Disco{" + "codigo=" + codigo + ", nombredisco=" + nombredisco + ", anioDeLanzamiento=" + anioDeLanzamiento + '}';
    }

    public void set(int i, Disco disco) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    Object getNombre() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
