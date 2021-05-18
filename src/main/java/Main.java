import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class Main {
    public static void main(String[] args) {

        List<Person> personList = Arrays.asList(
                new Person(1,"Bob","White","22"),
                new Person(2,"James","Idleson","48"),
                new Person(3,"Ayxan","Naghiyev","8"),
                new Person(4,"Hikmet","Aliyev","12"),
                new Person(5,"Vugar","Mammedov","18"),
                new Person(6,"Vusal","Askerov","68")
        );
        System.out.println(personList);
        Hw hw = new Hw();

        hw.countAdults(personList);
        hw.countAverageAge(personList);
        personList.stream()
                .filter(p -> Integer.parseInt(p.age) >= 18)

                .collect(Collectors.toList());




    }
}
