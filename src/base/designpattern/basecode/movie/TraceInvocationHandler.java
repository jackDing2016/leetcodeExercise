package base.designpattern.basecode.movie;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class TraceInvocationHandler implements InvocationHandler {

    private IMovie movie;
//    private Movie movie;

    public TraceInvocationHandler(IMovie movie) {
        this.movie = movie;
    }

//    public TraceInvocationHandler(Movie movie) {
//        this.movie = movie;
//    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("This is trace component");
        return method.invoke(movie, args);
    }
//
//    @Override
//    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
////        return method.invoke(proxy, args);
//        System.out.println("This is trace component");
//        return method;
//    }
}
