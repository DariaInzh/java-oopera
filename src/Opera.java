class Opera extends MusicalShow {
    private int choirSize;

    Opera(String title, int duraction, Director director, String musicAuthor, String librettoText, int choirSize) {
        super(title, duraction, director, musicAuthor, librettoText);
        this.choirSize = choirSize;
    }
}
