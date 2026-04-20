import java.util.ArrayList;

public class Show {
    private String title;
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
        String actors = "Актеры: \n";
        if (this.listOfActors.isEmpty()) {
            return "Актёры еще формируются.";
        }
        for (Actor actor : this.listOfActors) {
            actors += "   " + actor.toString() + "\n";
        }
        return actors;
    }

    public void addActor(Actor actor) {
        if (this.listOfActors.contains(actor)) {
            System.out.println(actor + " уже участвует в " + this.title + " .");
            return;
        }
        this.listOfActors.add(actor);
        System.out.println(actor + " успешно добавлен в состав актёров произведения " + this.title);
    }

    public void replaceActor(Actor oldActor, Actor newActor) {
        if (oldActor != null && newActor != null && this.listOfActors.contains(oldActor)) {
            int index = this.listOfActors.indexOf(oldActor);
            this.listOfActors.set(index, newActor);
            System.out.println("Актёр " + oldActor + " заменён на " + newActor + " успешно.");
        } else {
            System.out.println("Чтобы добавить актёра, нужно выбрать его из списка участников и выбрать ему замену.");
        }
    }

    public String getTitle() {
        return title;
    }
}
