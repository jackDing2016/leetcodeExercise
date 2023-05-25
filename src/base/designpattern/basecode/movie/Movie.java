package base.designpattern.basecode.movie;

public class Movie implements IMovie, IMovieAuxiliary {

    private Integer id;

    private String name;

    private Object content;

    public Movie(String name) {
        this.name = name;
    }

    public Movie(String name, Object content) {
        this.name = name;
        this.content = content;
    }

    @Override
    public void play() {
        System.out.println("The movie: " + this.name + " is playing!");
    }

    @Override
    public void stop() {
        System.out.println("The movie: " + this.name + " stopped");
    }

    @Override
    public void adjustSpeed(Integer speed) {
        System.out.println("Adjust speed to " + speed);
    }


    // todo set play speed, forward 10 seconds, backward 10 seconds etc.


}
