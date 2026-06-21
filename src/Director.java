class Director extends Person {
    private int numberOfShows;

    Director(String name, String surname, Gender gender, int numberOfShows) {
        super(name, surname, gender);
        this.numberOfShows = numberOfShows;
    }

    int getNumberOfShows() {
        return numberOfShows;
    }

    void setNumberOfShows(int numberOfShows) {
        this.numberOfShows = numberOfShows;
    }

    @Override
    public String toString() {
        return "Режиссёр: " + name + " " + surname +
                ", спектаклей поставлено: " + numberOfShows;
    }
}
