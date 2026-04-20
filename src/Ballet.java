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
        return "Балет - " + this.getTitle()+
                ",\n " + this.getMusicAuthor() +
                ",\n Либретто текст - " + this.getLibrettoText() +
                ",\n Длительность: " + this.getDuration() + " мин." +
                ",\n " + this.getChoreographer() +
                ",\n " + this.getDirector() +
                ",\n " + getActors() + "\n ";
    }

    public Choreographer getChoreographer() {
        return choreographer;
    }
}
