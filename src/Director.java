import java.util.Objects;

class Director extends Person {
    private int numberOfShows;

    Director(String name, String surname, Gender gender, int numberOfShows) {
        super(name, surname, gender);
        this.numberOfShows = numberOfShows;
    }

    public int getNumberOfShows() {
        return numberOfShows;
    }

    public void setNumberOfShows(int numberOfShows) {
        this.numberOfShows = numberOfShows;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Director director = (Director) obj;
        return numberOfShows == director.numberOfShows &&
                super.equals(obj);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numberOfShows);
    }

    @Override
    public String toString() {
        return "Режиссёр: " + name + " " + surname +
                ", спектаклей поставлено: " + numberOfShows;
    }
}
