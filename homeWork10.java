import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class homeWork10 {
    public static void main(String[] args){
        IntStream intStream = IntStream.range(0,15);
        System.out.println(
                intStream
                        .filter(x-> x>=5)
                        .map(x->x*x)
                        .skip(3)
                        .reduce((x,y)->x+y)
        );
        System.out.println("distinct+sorted");
        Stream.of(1, 4, 10, 1, 5, 10, 4, 3, 11, 15, 4, 2, 6, 8, 7).distinct().sorted().forEach(System.out::println);

//        System.out.println("x<10");
//        intStream.dropWhile(x-> x<10).forEach(System.out::println);


        System.out.println("toList");
        List<Integer> nums = Stream.of(1, 5, 10, 15, 20, 25, 30).collect(Collectors.toList());
        System.out.println(nums);

        System.out.println("Names");
        Stream.of("Галя","Петя","Аня","Миша","Абба").sorted().forEach(System.out::println);
    }
}
