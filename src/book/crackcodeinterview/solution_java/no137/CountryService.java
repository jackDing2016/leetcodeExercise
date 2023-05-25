package book.crackcodeinterview.solution_java.no137;

import java.util.List;
import java.util.stream.Stream;

public class CountryService {

    int getPopulation(List<Country> countries, String continent) {
//        int sum = 0;
//        for (Country c : countries) {
//            if (c.getContinent().equals(continent)) {
//                sum += c.getPopulation();
//            }
//        }
//        return sum;

        Stream<Country> subList = countries.stream().filter(
                country -> {
                    return country.getContinent().equals(continent);
                }
        );

        Stream<Integer> populations = subList.map(Country::getPopulation);

        int population = populations.reduce(0, Integer::sum);

        return population;
    }

}
