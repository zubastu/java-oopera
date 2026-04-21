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
        for (Actor actor : listOfActors) {
            actors += "   " + actor.toString() + "\n";
        }
        return actors;
    }

    public void addActor(Actor actor) {
        if (this.listOfActors.contains(actor)) {
            System.out.println(actor + " уже участвует в " + getTitle() + " .");
            return;
        }
        this.listOfActors.add(actor);
        System.out.println(actor + " успешно добавлен в состав актёров произведения " + getTitle());
    }

    public void replaceActor(Actor newActor, String actorSurname) {
        if (newActor != null && actorSurname != null) {
            int surnameEqualsCounter = 0;
            int replaceIndex = -1;
            for (Actor actor : listOfActors) {
                if (actor.getSurname().equals(actorSurname)) {
                    surnameEqualsCounter++;
                    replaceIndex = listOfActors.indexOf(actor);
                }
            }

            if (surnameEqualsCounter > 1) {
                System.out.println("В спектакле по фамилии " + actorSurname + " есть несколько человек, заменить не получится.");
                return;
            } else if (surnameEqualsCounter == 0) {
                System.out.println("Актёра с такой фамилией нет.");
                return;
            }

            if (replaceIndex > -1 && surnameEqualsCounter == 1) {
                listOfActors.set(replaceIndex, newActor);
                System.out.println("Актёр успешно заменён.");
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
