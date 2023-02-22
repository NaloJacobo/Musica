
/**
 *
 * @author Nalo
 */
import java.util.*;

public class Main {

    public static void main(String[] args) {

        BaseDeDatos db = new BaseDeDatos();

        List<Album> albums = db.getAlbums();

        for (Album album : albums) {
            System.out.println("Álbum: " + album.getNombre());
            System.out.println("Artista: " + album.getArtista().getNombre());
            System.out.println("Canciones:");
            List<Cancion> canciones = album.getCanciones();
            for (Cancion cancion : canciones) {
                System.out.println("- " + cancion.getNombre() + " (" + cancion.getGenero() + ")");
            }
            System.out.println();
        }
    }
}
