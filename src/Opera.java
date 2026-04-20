import java.util.ArrayList;

public class Opera extends MusicalShow {
    int choirSize;

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
        return "Опера - " + this.getTitle() +
                ",\n " + musicAuthor +
                ",\n Либретто текст - " + librettoText +
                ",\n Длительность: " + this.getDuration() + " мин." +
                ",\n " + this.getDirector() +
                ",\n " + getActors() + "\n ";
    }
}
