package app;

import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class DataHandler {
    public String handleData(List<Person> list) {

        AtomicInteger count = new AtomicInteger(1);
        StringBuilder sb = new StringBuilder();

        Stream<Person> allData = list.stream();
        Stream<Person> filteredData = allData.filter(person -> person.getAge() > 25);


//        Stream<Person> allData1 = list.stream();
//        Stream<Person> filteredData1 = allData1.map(person -> person.getName().toUpperCase()
//                .sorted(Comparator.reverseOrder())
//                .collect(Collectors.toList()));



        filteredData.forEach(person ->
                sb.append(count.getAndIncrement())
                        .append(") ").append(person)
                        .append("\n"));

//        filteredData1.forEach(person ->
//                sb.append(count.getAndIncrement())
//                        .append(") ").append(person)
//                        .append("\n"));




        return sb.toString();
    }

}
