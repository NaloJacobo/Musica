
/**
 *
 * @author Nalo
 */
import java.util.*;

public class Album {
     String nombre;
     Artista artista;
     List<Cancion> canciones;

    public Album(String nombre, Artista artista, List<Cancion> canciones) {
        this.nombre = nombre;
        this.artista = artista;
        this.canciones = canciones;
    }
    
    public Album(String nombre, Artista artista) {
        this.nombre = nombre;
        this.artista = artista;
    }

    public String getNombre() {
        return nombre;
    }

    public Artista getArtista() {
        return artista;
    }

    public List<Cancion> getCanciones() {
        return canciones;
    }
}
