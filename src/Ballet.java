import java.util.ArrayList;

public class Ballet extends MusicalShow {
    Choreographer choreographer;

    public Ballet(
            String title,
            int duration,
            Director director,
            ArrayList<Actor> listOfActors,
            MusicAuthor musicAuthor,
            String librettoText,
            Choreographer choreographer
    ) {
        super(title, duration, director, listOfActors, musicAuthor, librettoText);
        this.choreographer = choreographer;
    }

    @Override
    public String toString() {
        return "Балет - " + this.getTitle()+
                ",\n " + musicAuthor +
                ",\n Либретто текст - " + librettoText +
                ",\n Длительность: " + duration + " мин." +
                ",\n " + choreographer +
                ",\n " + director +
                ",\n " + getActors() + "\n ";
    }
}
