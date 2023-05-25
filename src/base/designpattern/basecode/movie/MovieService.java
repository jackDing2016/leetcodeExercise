package base.designpattern.basecode.movie;

public interface MovieService {

    Movie getMovie(Integer movieId);

    Movie getMovie(String movieName);

    void play(Integer movieId);

    void stop(Integer movieId);

}
