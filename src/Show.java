import java.util.ArrayList;

public class Show {
    private String title;
    private int duration;
    private Director director;
    private ArrayList<Actor> listOfActors;

    Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = new ArrayList<>();
    }

    public void addActor(Actor actor) {
        if (!listOfActors.contains(actor)) {
            listOfActors.add(actor);
            System.out.println("Актёр " + actor.getName() + " " + actor.getSurname() + " добавлен в спектакль.");
        } else {
            System.out.println("Предупреждение: актёр " + actor.getName() + " " + actor.getSurname() + " уже участвует в этом спектакле!");
        }
    }

    public void replaceActor(Actor newActor, String surnameToReplace) {
        for (int i = 0; i < listOfActors.size(); i++) {
            if (listOfActors.get(i).getSurname().equals(surnameToReplace)) {
                listOfActors.remove(i);           // удаляем актёра по индексу
                listOfActors.add(newActor);     // добавляем нового в конец
                System.out.println("Актёр с фамилией " + surnameToReplace +
                        " заменён на " + newActor.getName() + " " + newActor.getSurname());
                return; // выходим из метода после замены
            }
        }
        // если цикл прошёл, а return не сработал — актёр не найден
        System.out.println("Ошибка: актёр с фамилией " + surnameToReplace +
                " не найден в спектакле!");
    }

    public void printListOfActors() {
        System.out.println("Список актеров спектакля:");
        for (Actor actor : listOfActors) {
            System.out.println(actor);
        }
    }

    public void printDirectorInfo() {
        System.out.println(director);
    }
}
