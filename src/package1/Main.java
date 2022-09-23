package package1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
       List<Integer> list= new ArrayList<>();
        for (int i = 0; i <10 ; i++) {
            list.add((int) (Math.random()*10));

        }
        list.stream().map((x) -> x*x).forEach(System.out::println);
        int sum = list.stream().map(x -> x*x).reduce((x,y) -> x + y).get();
        System.out.println(sum);
//        List<Integer> list= new ArrayList<>();
//        for (int i = 0; i <10 ; i++) {
//            list.add((int) (Math.random()*10));
//
//        }
//        System.out.println(list);
//        int sum=list.stream().map(x->x*x).reduce((x,y)->x+y).get();
//        System.out.println(sum);

    }


}
//Создать список и заполнить рандомными числами 10 ячеек, нужно вывести сумму квадратов всех элемента списка.
// Мы используем метод map() для возведения в квадрат каждого элемента,
// а потом применяем метод reduce() для свертки всех элементов в одно число.