import java.util.ArrayList;

public class Theatre {
    public static void main(String[] args) {
        System.out.println("\n1. Создаю актёров и режиссеров");
        // Актёры
        Actor actor1 = new Actor("Иван", "Иванов", Gender.MALE, 180);
        Actor actor2 = new Actor("Пётр", "Петров", Gender.MALE, 175);
        Actor actor3 = new Actor("Анна", "Сидорова", Gender.FEMALE, 165);
        Actor actor4 = new Actor("Мария", "Кузнецова", Gender.FEMALE, 170);
        Actor actor5 = new Actor("Алексей", "Смирнов", Gender.MALE, 182);
        Actor actor6 = new Actor("Елена", "Попова", Gender.FEMALE, 168);

        // Режиссёры
        Director director1 = new Director("Сергей", "Бондарчук", Gender.MALE, 20);
        Director director2 = new Director("Валерия", "Гай Германика", Gender.FEMALE, 10);

        // Музыкальные авторы
        MusicAuthor musicAuthor1 = new MusicAuthor("Пётр", "Чайковский", Gender.MALE);
        MusicAuthor musicAuthor2 = new MusicAuthor("Людвиг", "Бетховен", Gender.MALE);

        // Хореографы
        Choreographer choreographer1 = new Choreographer("Мариус", "Петипа", Gender.MALE);
        Choreographer choreographer2 = new Choreographer("Юрий", "Григорович", Gender.MALE);

        // Либретто
        String librettoText1 = "Что-то непонятное.";
        String librettoText2 = "Что-то понятное и знакомое.";

        System.out.println("\n2. Создаю спектакли");
        // 3 спектакля, обычный, опера, балет.
        Show show = new MusicalShow("Драма 3", 110, director2,
                new ArrayList<>(), musicAuthor1, librettoText1);
        Opera opera = new Opera("Евгений Онегин", 150, director1,
                new ArrayList<>(), musicAuthor1, librettoText1, 10);
        Ballet ballet = new Ballet("Лебединое озеро", 140, director1,
                new ArrayList<>(), musicAuthor1, librettoText1, choreographer2);

/*        // Добавляем актёров
        System.out.println("\n3. Распределяю актёров");
        show.addActor(actor1);
        show.addActor(actor2);
        opera.addActor(actor3);
        opera.addActor(actor4);
        ballet.addActor(actor5);
        ballet.addActor(actor6);


        System.out.println("4. Для каждого спектакля вывожу список актёров");
        System.out.println(show.getActors());
        System.out.println(opera.getActors());
        System.out.println(ballet.getActors());

        System.out.println("5. Заменяю актёра в одном из спектаклей на актёра из другого спектакля и ещё раз");
        show.replaceActor(actor1, actor5.getSurname());
        ballet.replaceActor(actor6, actor2.getSurname());

        show.replaceActor(actor5, actor1.getSurname());
        ballet.replaceActor(actor2, actor6.getSurname());

        System.out.println("********* и вывожу список актеров всех шоу");
        System.out.println(show.getActors());
        System.out.println(opera.getActors());
        System.out.println(ballet.getActors());

        // Попытка заменить несуществующего актёра
        System.out.println("5. Меняю несуществующих актёров");
        ballet.replaceActor(actor1, actor2.getSurname());
        ballet.replaceActor(actor3, actor4.getSurname());
        opera.replaceActor(actor1, actor2.getSurname());
        opera.replaceActor(actor5, actor6.getSurname());
        show.replaceActor(actor3, actor4.getSurname());
        show.replaceActor(actor5, actor6.getSurname());

        // Вывод текста Либретто
        System.out.println("7. Для оперного и балетного спектакля выведите на экран текст либретто");
        opera.printLibrettoText();
        ballet.printLibrettoText();

        System.out.println("Полная информация про выступления");
        // Полный вывод всех шоу
        System.out.println(show);
        System.out.println(opera);
        System.out.println(ballet);*/
        Actor test1 = new Actor("Иван", "Тест", Gender.MALE, 180);
        Actor test2 = new Actor("Пётр", "Тест", Gender.MALE, 175);
        Actor test3 = new Actor("Анна", "Тест3", Gender.FEMALE, 165);
        Actor test4 = new Actor("Мария", "Тест3", Gender.FEMALE, 170);

        opera.addActor(test1);
        opera.addActor(test2);
        opera.addActor(test3);
        opera.addActor(test4);
        // Not Contains
        //opera.replaceActor(test1, test3.getSurname());
        //opera.replaceActor(test2, test4.getSurname());
        // Contains
        opera.replaceActor(test3, test1.getSurname());

        //System.out.println(opera);


    }
}
