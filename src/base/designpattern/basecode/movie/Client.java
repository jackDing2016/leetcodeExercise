package base.designpattern.basecode.movie;

import java.lang.reflect.Proxy;

public class Client {

    public static void main(String[] args) {
        // get movie service
//        MovieService movieService = new MovieServiceImpl();
//        Movie starWar = movieService.getMovie("Star War");
//        starWar.play();
//        starWar.stop();

//        Proxy
//        MovieService movieService= (MovieService) Proxy.newProxyInstance(
//                MovieServiceImpl.class.getClassLoader(),
//                new Class<?>[]{MovieService.class},
//                new TraceInvocationHandler());
//
//        Movie starWar = movieService.getMovie("Star War");
//        starWar.play();
//        starWar.stop();

        Movie warStar = new Movie("War Star");
        ClassLoader movieClassLoader = warStar.getClass().getClassLoader();
        Class[] interfaces = warStar.getClass().getInterfaces();

//        IMovie warStarProxy = (IMovie) Proxy.newProxyInstance(
//                movieClassLoader,
//                interfaces,
//                new TraceInvocationHandler(warStar));
//
//        warStarProxy.play();

        IMovieAuxiliary warStarProxy = (IMovieAuxiliary) Proxy.newProxyInstance(
                movieClassLoader,
                interfaces,
                new TraceInvocationHandler(warStar));

        warStarProxy.adjustSpeed(1);


    }

}
