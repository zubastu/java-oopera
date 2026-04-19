import java.util.ArrayList;

public class Theatre {
    public static void main(String[] args) {
        // Актёры
        Actor a1 = new Actor("Иван", "Иванов", Gender.MALE, 180);
        Actor a2 = new Actor("Пётр", "Петров", Gender.MALE, 175);
        Actor a3 = new Actor("Анна", "Сидорова", Gender.FEMALE, 165);
        Actor a4 = new Actor("Мария", "Кузнецова", Gender.FEMALE, 170);
        Actor a5 = new Actor("Алексей", "Смирнов", Gender.MALE, 182);
        Actor a6 = new Actor("Елена", "Попова", Gender.FEMALE, 168);

        // Режиссёры
        Director d1 = new Director("Сергей", "Бондарчук", Gender.MALE, 20);
        Director d2 = new Director("Валерия", "Гай Германика", Gender.FEMALE, 10);

        // Музыкальные авторы
        MusicAuthor m1 = new MusicAuthor("Пётр", "Чайковский", Gender.MALE);
        MusicAuthor m2 = new MusicAuthor("Людвиг", "Бетховен", Gender.MALE);

        // Хореографы
        Choreographer c1 = new Choreographer("Мариус", "Петипа", Gender.MALE);
        Choreographer c2 = new Choreographer("Юрий", "Григорович", Gender.MALE);

        // Либретто
        String lt1 = "Что-то непонятное.";
        String lt2 = "Что-то понятное и знакомое.";

        // 3 спектакля, обычный, опера, балет.


        Show show = new MusicalShow("Драма 3", 110, d2, new ArrayList<>(), m1, lt1);
        Opera opera = new Opera("Евгений Онегин", 150, d1, new ArrayList<>(), m2, lt1, 10);
        Ballet ballet = new Ballet("Лебединое озеро", 140, d1, new ArrayList<>(), m1, lt2, c2);


        // Вывод текста Либретто
        System.out.println(show);
        System.out.println(opera);
        System.out.println(ballet);

        System.out.println(opera.printLibrettoText());
        System.out.println(ballet.printLibrettoText());

    }
}
