import java.util.ArrayList;

public class Ballet extends MusicalShow {
    private Choreographer choreographer;

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
        return "Балет - " + getTitle()+
                ",\n " + getMusicAuthor() +
                ",\n Либретто текст - " + getLibrettoText() +
                ",\n Длительность: " + getDuration() + " мин." +
                ",\n " + getChoreographer() +
                ",\n " + getDirector() +
                ",\n " + getActors() + "\n ";
    }

    public Choreographer getChoreographer() {
        return choreographer;
    }
}
