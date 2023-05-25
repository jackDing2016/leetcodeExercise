package base.designpattern.basecode.movie;

public class MovieServiceImpl implements MovieService {

    @Override
    public Movie getMovie(Integer movieId) {
        return new Movie("Star War");
    }

    @Override
    public void play(Integer movieId) {
        new Movie("Star War").play();
    }

    @Override
    public void stop(Integer movieId) {
        new Movie("Star War").stop();
    }

    @Override
    public Movie getMovie(String movieName) {
        return new Movie("Star War");
    }
}
