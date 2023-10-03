package Part2CreateHobby;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book();
        Book book3 = new Book();
        book1.title = "Winter Witch";
        book2.title = "Prince of Wolves";
        book3.title = "Princess and Dragon";
        book1.author = "Eugene Smart";
        book2.author = "John Plug";
        book3.author = "Kurt Wong";
        book1.setEligibility(true);
        book2.setEligibility(false);
        book3.setEligibility(true);
        book1.setAge(16);
        book2.setAge(12);
        book3.setAge(18);
        book1.setPrice(12.99);
        book2.setPrice(9.99);
        book3.setPrice(21.49);
        book1.printMainData();
        book2.printMainData();
        book3.printMainData();
        book1.printFullData();
        book2.printFullData();
        book3.printFullData();
        System.out.println("Price of the first book: " + book1.getPrice() );
        System.out.println("Price of the second book: " + book2.getPrice());
        System.out.println("Price of the third book: " + book3.getPrice());


    }
}
