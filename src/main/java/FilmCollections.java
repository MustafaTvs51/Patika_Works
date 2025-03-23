

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class FilmCollections {

    public  Set<Film> TreeFilmCollections = new TreeSet<>();
    public  Set<Film> FilmCollections = new HashSet<>();

    public  FilmCollections(){
    Film film1 = new Film("Interstellar", 8.7, "Adventure", 2014);
    Film film2 = new Film("Gladiator", 8.5, "Action", 2000);
    Film film3 = new Film("The GodFather", 9.2, "Gangster", 1972);
    Film film4 = new Film("The Matrix", 8.7, "Action", 1999);
    Film film5 = new Film("Alien", 8.5, "Horror", 1979);

        FilmCollections.add(film1);
        FilmCollections.add(film2);
        FilmCollections.add(film3);
        FilmCollections.add(film4);
        FilmCollections.add(film5);




        TreeFilmCollections.add(film1);
        TreeFilmCollections.add(film2);
        TreeFilmCollections.add(film3);
        TreeFilmCollections.add(film4);
        TreeFilmCollections.add(film5);

    }


    public void FilmKindFilter(String kindOfFilm) {

        boolean found = false;

        System.out.println("\n" + kindOfFilm + " türündeki filmler  :");
        for (Film film : TreeFilmCollections) {
            if (film.getKindOfFilm().equalsIgnoreCase(kindOfFilm)) {
                System.out.println(film);
                found = true;
            }

        }
            if (!found){
                System.out.println("Bu Türde Film Bulunamadı.");
            }

    }
    public void  printAllFilms(){
        System.out.println("\n Tüm Filmler : ");
        for (Film film : TreeFilmCollections){
            System.out.println(film);

        }

    }
    public  static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        FilmCollections collections = new FilmCollections();
        collections.printAllFilms();
        System.out.println();
        System.out.println();
        System.out.println("Film Türü Giriniz (Adventure,Gangster,Action,Horror): ");
        String Kind = scanner.nextLine();


        // Film türüne göre filtreleme (örneğin: "Action")

        collections.FilmKindFilter(Kind);



   }
}