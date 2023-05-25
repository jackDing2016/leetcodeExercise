package book.javareflectioninaction.test;

public class Test {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {

        Class<?> cls = Class.forName("book.javareflectioninaction.test.CustomerDatabase");
        CustomerDatabase c = (CustomerDatabase) cls.newInstance();
        c.getConnection();


    }

}
