import java.util.ArrayList;

public class Show {
    private String title;
    private int duration;
    private Director director;
    private ArrayList<Actor> listOfActors;

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
            System.out.println(actor + " уже участвует в " + this.getTitle() + " .");
            return;
        }
        this.listOfActors.add(actor);
        System.out.println(actor + " успешно добавлен в состав актёров произведения " + this.getTitle());
    }

    public void replaceActor(Actor newActor, String actorSurname) {
        if (newActor != null && actorSurname != null) {
            if (this.listOfActors.contains(newActor)) {
                System.out.println("Актёр уже участвует.");
                return;
            }

            for (Actor actor : this.listOfActors) {
                if (actor.getSurname().equals(newActor.getSurname())) {
                    System.out.println("Нельзя добавить актёра с одной фамилией.");
                    return;
                }

                if (actor.getSurname().equals(actorSurname)) {
                    int index = this.listOfActors.indexOf(actor);
                    this.listOfActors.set(index, newActor);
                    System.out.println("Актёр " + newActor + " заменён на " + actorSurname + " успешно.");
                } else {
                    System.out.println("Актера с такой фамилией нет.");
                }
            }
        } else {
            System.out.println("Чтобы добавить актёра, нужно выбрать его из списка участников и выбрать ему замену.");
        }
    }

    public String getTitle() {
        return title;
    }
    public int getDuration() {
        return duration;
    }

    public Director getDirector() {
        return director;
    }
}
