
/**
 *
 * @author Nalo
 */

import java.util.*;

public class BaseDeDatos {
    
     List<Album> albums;

    public BaseDeDatos() {
        albums = new ArrayList<>();
       
        Artista artist1 = new Artista("The Beatles");
        
        List<Cancion> can1 = new ArrayList<>();
        can1.add(new Cancion("Help!", Genero.ROCK));
        can1.add(new Cancion("Yesterday", Genero.POP));
        can1.add(new Cancion("Blackbird", Genero.ROCK));
        
        albums.add(new Album("Help!", artist1, can1));
        
        Artista artist2 = new Artista("Arctic Monkeys");
        
        List<Cancion> can2 = new ArrayList<>();
        can2.add(new Cancion("Crying Lightning", Genero.ROCK));
        can2.add(new Cancion("Secret Door", Genero.ROCK));
        can2.add(new Cancion("Dance Little Liar", Genero.ROCK));
        
        albums.add(new Album("Humbug", artist2, can2));
        
        Artista artist3 = new Artista("The Smiths");
        
        List<Cancion> can3 = new ArrayList<>();
        can3.add(new Cancion("This Night Has Opened My Eyes", Genero.ROCK));
        can3.add(new Cancion("Heaven Knows I'm Miserable Now", Genero.ROCK));
        can3.add(new Cancion("Please, Please, Please, Let Me Get What I Want", Genero.ROCK));
        
        albums.add(new Album("Hatful Of Hollow", artist3, can3));

        
    }
    
    public void setAlbums(List<Album> albums) {
        this.albums = albums;
    }

    public List<Album> getAlbums() {
        return albums;
    } 
    
}
