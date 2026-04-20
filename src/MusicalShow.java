import java.util.ArrayList;

public class MusicalShow extends Show {
    final MusicAuthor musicAuthor;
    final String librettoText;

    public MusicalShow(
            String title,
            int duration,
            Director director,
            ArrayList<Actor> listOfActors,
            MusicAuthor musicAuthor, String librettoText
    ) {
        super(title, duration, director, listOfActors);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    protected void printLibrettoText() {
        System.out.println(this.librettoText);
    }

    @Override
    public String toString() {
        return "Музыкальное Шоу - " + this.getTitle() +
                ",\n " + musicAuthor +
                ",\n Либретто текст - " + librettoText +
                ",\n Длительность: " + this.getDuration() + " мин." +
                ",\n " + this.getDirector() +
                ",\n " + getActors() + "\n ";
    }
}
