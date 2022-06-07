package SetExercises;

import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;

/* Dadas as seguintes informações sobre séries, crie um conjunto e ordene-o exibindo nome - genero - tempo de episódio. */

/*
Serie 1 = nome: strangerThings, genero: Ficção, tempoEpisodio: 60;
Serie 2 = nome: dark, genero: drama, tempoEpisodio = 60;
Serie 3 = nome: that '70 show, genero: comédia, tempoEpisodio = 25;

 */

public class SetOrderExercises {
  public static void main(String[] args) {
    System.out.println("--\tOrdem aleatória\t--");
    Set<Show> myShows = new HashSet<Show>() {
      {
        add(new Show("strangerThings", "fiction", 60));
        add(new Show("dark", "fiction", 60));
        add(new Show("friends", "comedy", 25));
      }
    };

    for (Show show : myShows)
      System.out.println(show.getName() + " " + show.getGenre() + " " + show.getTime());

    System.out.println("--\tOrdem inserção\t--");
    Set<Show> myShows1 = new LinkedHashSet<>() {
      {
        add(new Show("strangerThings", "fiction", 60));
        add(new Show("dark", "fiction", 60));
        add(new Show("friends", "comedy", 25));
      }
    };

    for (Show show : myShows1)
      System.out.println(show.getName() + " " + show.getGenre() + " " + show.getTime());

    System.out.println("--\tOrdem natural: (tempo)\t--");
    Set<Show> myShows2 = new TreeSet<>(myShows);
    for (Show show : myShows2)
      System.out.println(show.getName() + " " + show.getGenre() + " " + show.getTime());

    System.out.println("--\tOrdem Nome/Gênero/Tempo\t-- ");
    Set<Show> myShows3 = new TreeSet<>(new ComparatorNameGenreTime());
    myShows3.addAll(myShows);

    for (Show show : myShows3)
      System.out.println(show.getName() + " " + show.getGenre() + " " + show.getTime());

  }
}

class Show implements Comparable<Show> {
  private String name;
  private String genre;
  private Integer time;

  public Show(String name, String genre, Integer time) {
    this.name = name;
    this.genre = genre;
    this.time = time;
  }

  public String getName() {
    return name;
  }

  public String getGenre() {
    return genre;
  }

  public Integer getTime() {
    return time;
  }

  @Override
  public String toString() {
    return "{" +
        "name='" + name + '\'' +
        ", genre='" + genre + '\'' +
        ", time=" + time +
        "}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == null)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;
    Show show = (Show) o;
    return name.equals(show.name) && genre.equals(show.genre) && time.equals(show.time);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, genre, time);
  }

  @Override
  public int compareTo(Show show) {
    int time = Integer.compare(this.getTime(), show.getTime());
    if (time != 0)
      return time;

    return this.getGenre().compareTo(show.getGenre());
  }
}

class ComparatorNameGenreTime implements Comparator<Show> {
  public int compare(Show s1, Show s2) {
    int name = s1.getName().compareTo(s2.getName());
    if (name != 0)
      return name;

    int genre = s1.getGenre().compareTo(s2.getGenre());
    if (genre != 0)
      return genre;

    return Integer.compare(s1.getTime(), s2.getTime());
  }
}