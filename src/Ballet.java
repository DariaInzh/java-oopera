class Ballet extends MusicalShow {
    private String choreographer;

    Ballet(String title, int duraction, Director director, String musicAuthor, String librettoText, String choreographer) {
        super(title, duraction, director, musicAuthor, librettoText);
        this.choreographer = choreographer;
    }
}
