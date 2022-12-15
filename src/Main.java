import java.util.Comparator;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
         Integer[] num={1,4,6,9,11,8,7,6,5,12,2,3};
        Stream<Integer>number=Stream.of(num);
        Stream<Integer>stream=number.filter(x -> x % 2==0).map(x -> x*x);
        stream.max(Comparator.comparing(x->x)).stream().toList().forEach(System.out::println);
    }
}