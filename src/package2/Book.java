package package2;

public class Book {
    public static void main(String[] args) {
  String avtor ="Shevchenko";
  String nane = "Kobzar";
  int pages= 100;
     Display printavtor=()-> System.out.println(avtor);
     Display printnane=()-> System.out.println(nane);
     Display printpages=()-> System.out.println(pages);
     printavtor.print();
     printnane.print();
     printpages.print();

    }
}
//Создать класс Book, сделать 3 поля и соответствующие методы.
// Необходимо реализовать замыкание анонимного класса и лямбда-выражения