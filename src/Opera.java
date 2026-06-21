import java.util.Objects;

class Opera extends MusicalShow {
    private int choirSize;

    Opera(String title, int duraction, Director director, String musicAuthor, String librettoText, int choirSize) {
        super(title, duraction, director, musicAuthor, librettoText);
        this.choirSize = choirSize;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Opera opera = (Opera) obj;
        return choirSize == opera.choirSize &&
                super.equals(obj);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), choirSize);
    }
}
