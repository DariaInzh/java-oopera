import java.util.Objects;

class Ballet extends MusicalShow {
    private String choreographer;

    Ballet(String title, int duraction, Director director, String musicAuthor, String librettoText, String choreographer) {
        super(title, duraction, director, musicAuthor, librettoText);
        this.choreographer = choreographer;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Ballet ballet = (Ballet) obj;
        return Objects.equals(choreographer, ballet.choreographer) &&
                super.equals(obj);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), choreographer);
    }
}
