import java.util.ArrayList;

public class Show {
    final String title;
    final int duration;
    final Director director;
    ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }


    @Override
    public String toString() {
        return "Шоу - " + title +
                ",\n Длительность: " + duration + " мин." +
                ",\n " + director + getActors() + "\n ";
    }

    public String getActors() {
        String actors = "Актеры: ";
        if (this.listOfActors.isEmpty()) {
            return "Актёры еще формируются.";
        }
        for (Actor actor : this.listOfActors) {
            actors += actor.toString();
        }
        return actors + ".";
    }
}
