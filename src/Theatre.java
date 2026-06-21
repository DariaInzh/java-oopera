public class Theatre {
    public static void main(String[] args) {
        // актёры
        Actor actor1 = new Actor("Анна", "Иванова", Gender.FEMALE, 1.70);
        Actor actor2 = new Actor("Пётр", "Сидоров", Gender.MALE, 1.85);
        Actor actor3 = new Actor("Мария", "Петрова", Gender.FEMALE, 1.65);

        // режиссёры
        Director director1 = new Director("Иван", "Васильев", Gender.MALE, 5);
        Director director2 = new Director("Елена", "Николаева", Gender.FEMALE, 3);

        // автор музыки и хореограф
        String musicAuthor = "Пётр Чайковский";
        String choreographer = "Мариус Петипа";

        // спектакли
        Show regularShow = new Show("Гамлет", 120, director1);
        Opera opera = new Opera("Травиата", 180, director2, "Джузеппе Верди",
                "История любви Виолетты и Альфреда", 20);
        Ballet ballet = new Ballet("Лебединое озеро", 150, director1, musicAuthor,
                "История Одетты и принца", choreographer);

        // Распределение актёров по спектаклям
        regularShow.addActor(actor1);
        regularShow.addActor(actor2);
        opera.addActor(actor2);
        opera.addActor(actor3);
        ballet.addActor(actor1);
        ballet.addActor(actor3);

        // Вывод списков актёров для каждого спектакля
        regularShow.printListOfActors();
        System.out.println();
        opera.printListOfActors();
        System.out.println();
        ballet.printListOfActors();
        System.out.println();

        // Замена актёра в одном из спектаклей
        ballet.replaceActor(actor2, "Иванова");
        System.out.println();
        ballet.printListOfActors();
        System.out.println();

        // замена несуществующего актёра
        regularShow.replaceActor(actor3, "Смирнов");
        System.out.println();

        // либретто для оперного и балетного спектакля
        opera.printLibrettoText();
        System.out.println();
        ballet.printLibrettoText();
    }
}
