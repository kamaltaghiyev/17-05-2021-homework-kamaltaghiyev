import java.util.List;
import java.util.stream.Collectors;

public class Hw {

    public void countAdults(List<Person> personList){
        long count = personList.stream()
                    .filter(p -> Integer.parseInt(p.age) >= 18)
                    .count();
        System.out.println(count);

    }
    public void countAverageAge(List<Person> personList){
        long count = personList.stream()
                .count();
        int sum = personList.stream()
                .map(p -> p.age)
                .mapToInt(Integer::parseInt)
                .sum();
        double avg = (sum/count);
        System.out.println(avg);
    }
}
