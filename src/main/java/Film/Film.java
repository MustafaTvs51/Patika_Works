package Film;

import java.util.Objects;

public class Film implements Comparable<Film>{

    public String FilmName;
    public   int ReleaseDate;
    public  String KindOfFilm;
    public  double IMDbPoints;

    public Film(String filmName, double IMDbPoints, String kindOfFilm, int releaseDate) {
        FilmName = filmName;
        this.IMDbPoints = IMDbPoints;
        KindOfFilm = kindOfFilm;
        ReleaseDate = releaseDate;
    }


    public String getFilmName() {
        return FilmName;
    }

    public void setFilmName(String filmName) {
        FilmName = filmName;
    }

    public double getIMDbPoints() {
        return IMDbPoints;
    }

    public void setIMDbPoints(double IMDbPoints) {
        this.IMDbPoints = IMDbPoints;
    }

    public String getKindOfFilm() {
        return KindOfFilm;
    }

    public void setKindOfFilm(String kindOfFilm) {
        KindOfFilm = kindOfFilm;
    }

    public int getReleaseDate() {
        return ReleaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        ReleaseDate = releaseDate;
    }

    @Override
    public String toString() {
        return "Film{" +
                "FilmName = '" + FilmName + '\'' +
                "| ReleaseDate = " + ReleaseDate +
                "| KindOfFilm = '" + KindOfFilm + '\'' +
                "| IMDbPoints = " + IMDbPoints +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Film film = (Film) o;
        return ReleaseDate == film.ReleaseDate && Double.compare(IMDbPoints, film.IMDbPoints) == 0 && Objects.equals(FilmName, film.FilmName) && Objects.equals(KindOfFilm, film.KindOfFilm);
    }

    @Override
    public int hashCode() {
        return Objects.hash(FilmName, ReleaseDate, KindOfFilm, IMDbPoints);
    }

    @Override
    public int compareTo(Film other) {

            int imdbComparison = Double.compare(other.IMDbPoints, this.IMDbPoints);
            if (imdbComparison == 0) {
                return Double.compare(this.ReleaseDate, other.ReleaseDate);
            }
            return imdbComparison;
        }
}
