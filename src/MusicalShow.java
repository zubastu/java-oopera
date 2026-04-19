import java.util.ArrayList;

public class MusicalShow extends Show {
    MusicAuthor musicAuthor;
    String librettoText;

    public MusicalShow(
            String title,
            int duration,
            Director director,
            ArrayList<Actor> listOfActors,
            MusicAuthor musicAuthor
    ) {
        super(title, duration, director, listOfActors);
        this.musicAuthor = musicAuthor;
    }

    protected String printLibrettoText() {
        return this.librettoText;
    }
}
