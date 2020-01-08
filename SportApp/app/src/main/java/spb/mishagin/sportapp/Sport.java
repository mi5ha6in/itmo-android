package spb.mishagin.sportapp;

public class Sport {
    private String name;
    private String description;
    private int imageResourceId;

    private Sport(String name, String description, int imageResourceId){
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    public static final Sport[] sports = {
            new Sport("Футбол", "командный вид спорта, в котором целью является забить мяч " +
                    "в ворота соперника ногами или другими частями тела (кроме рук)" +
                    " большее количество раз, чем команда соперника. ", R.drawable.football),
            new Sport("Хоккей", " командная спортивная игра на льду, заключающаяся" +
                    " в противоборстве двух команд на коньках, которые, передавая шайбу клюшками," +
                    "стремятся забросить её наибольшее количество голов в ворота соперника" +
                    "и не пропустить в свои.", R.drawable.hockey),
            new Sport("Волейбол", "вид спорта, командная спортивная игра, в процессе " +
                    "которой две команды соревнуются на специальной площадке, разделённой сеткой, стремясь " +
                    "направить мяч на сторону соперника таким образом," +
                    " чтобы он приземлился на площадке противника (добить до пола), либо чтобы игрок защищающейся " +
                    "команды допустил ошибку.", R.drawable.volleyball),
            new Sport("Регби", " Регбийный матч представляет собой соревнование двух команд, каждая " +
                    "из которых представлена пятнадцатью полевыми игроками", R.drawable.rugby),
            new Sport("Танцы", "ритмичные, выразительные телодвижения, обычно выстраиваемые в" +
                    " определённую композицию и исполняемые с музыкальным сопровождением", R.drawable.dancing),
            new Sport("Баскетбол", "спортивная командная игра с мячом, в которой мяч забрасывают руками в корзину (кольцо) соперника.", R.drawable.basketball),
            new Sport("Тенис", "", R.drawable.tennis),
            new Sport("Плавание", "", R.drawable.swimming),
            new Sport("Карате", "", R.drawable.karate),
            new Sport("Бокс", "", R.drawable.boxing),
    };

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
