package spb.mishagin.tvseriesapp;

import java.util.ArrayList;
import java.util.List;

public class SeriesList {
    List<String> getListTV (String spinner) {
        List<String> list = new ArrayList<>();
        if (spinner.equals("Комедия")) {
            list.add("Друзья");
        } if (spinner.equals("Фентези")) {
            list.add("Игра престолов");
        } if (spinner.equals("Ужасы")) {
            list.add("Ходячие мертфецы");
        } if (spinner.equals("Фантастика")) {
            list.add("Футурама");
        } if (spinner.equals("Криминал")) {
            list.add("Во все тяжкие");
            list.add("Менталист");
        }
        return list;
    }

}
