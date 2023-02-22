
/**
 *
 * @author Nalo
 */
public class Cancion {
     String nombre;
     Genero genero;

    public Cancion(String nombre, Genero genero) {
        this.nombre = nombre;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public Genero getGenero() {
        return genero;
    }
}
