package app;

import java.util.Arrays;
import java.util.List;

public class DataRepository{

    public List<Person>  getData(){
        return Arrays.asList(
                new Person("Jane", 22, "Female"),
                new Person("Tom", 30, "Male"),
                new Person("Sophy", 20, "Female"),
                new Person("Jake", 32, "Male"),
                new Person("Lily", 24, "Female")
        );

    }

}
