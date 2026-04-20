import java.util.ArrayList;

public class Theatre {
    public static void main(String[] args) {
        System.out.println("\n1. Создаю актёров и режиссеров");
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

        System.out.println("\n2. Создаю спектакли");
        // 3 спектакля, обычный, опера, балет.
        Show show = new MusicalShow("Драма 3", 110, d2, new ArrayList<>(), m1, lt1);
        Opera opera = new Opera("Евгений Онегин", 150, d1, new ArrayList<>(), m2, lt1, 10);
        Ballet ballet = new Ballet("Лебединое озеро", 140, d1, new ArrayList<>(), m1, lt2, c2);

        // Добавляем актёров
        System.out.println("\n3. Распределяю актёров");
        show.addActor(a1);
        show.addActor(a2);
        opera.addActor(a3);
        opera.addActor(a4);
        ballet.addActor(a5);
        ballet.addActor(a6);


        System.out.println("4. Для каждого спектакля вывожу список актёров");
        System.out.println(show.getActors());
        System.out.println(opera.getActors());
        System.out.println(ballet.getActors());

        System.out.println("5. Заменяю актёра в одном из спектаклей на актёра из другого спектакля и ещё раз");
        show.replaceActor(a1, a5);
        ballet.replaceActor(a6, a2);

        show.replaceActor(a5, a1);
        ballet.replaceActor(a2, a6);

        System.out.println("********* и вывожу список актеров всех шоу");
        System.out.println(show.getActors());
        System.out.println(opera.getActors());
        System.out.println(ballet.getActors());

        // Попытка заменить несуществующего актёра
        System.out.println("5. Меняю несуществующих актёров");
        ballet.replaceActor(a1, a2);
        ballet.replaceActor(a3, a4);
        opera.replaceActor(a1, a2);
        opera.replaceActor(a5, a6);
        show.replaceActor(a3, a4);
        show.replaceActor(a5, a6);

        // Вывод текста Либретто
        System.out.println("7. Для оперного и балетного спектакля выведите на экран текст либретто");
        opera.printLibrettoText();
        ballet.printLibrettoText();

        System.out.println("Полная информация про выступления");
        // Полный вывод всех шоу
        System.out.println(show);
        System.out.println(opera);
        System.out.println(ballet);

    }
}
