import java.util.ArrayList;

public class Opera extends MusicalShow {
    private int choirSize;

    public Opera(
            String title,
            int duration,
            Director director,
            ArrayList<Actor> listOfActors,
            MusicAuthor musicAuthor,
            String librettoText,
            int choirSize
    ) {
        super(title, duration, director, listOfActors, musicAuthor, librettoText);
        this.choirSize = choirSize;
    }

    @Override
    public String toString() {
        return "Опера - " + getTitle() +
                ",\n " + getMusicAuthor() +
                ",\n Либретто текст - " + getLibrettoText() +
                ",\n Длительность: " + getDuration() + " мин." +
                ",\n " + getDirector() +
                ",\n " + getActors() + "\n ";
    }

    public int getChoirSize() {
        return choirSize;
    }
}
