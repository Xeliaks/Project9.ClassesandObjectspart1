package Part2CreateHobby;

public class Book {
    public String title;
    public String author;
    //Part 2.1 This class should have private properties and corresponding getters and setters.
    private boolean eligibility;
    public boolean isEligibility() {
        return eligibility;
    }

    public void setEligibility(boolean eligibility) {
        this.eligibility = eligibility;
    }
    private int age;
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    private double price;
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    //Part2.2 This class should have constructor with initial values for the main properties.
    public Book(){
        title = "NoTitle";
        author = "Unknown";
    }
    //Part2.3 The class should have methods which perform a logic on the base of its properties.
    public void printMainData(){
        System.out.println("Name: " + title + " Author: " + author);
    }

    public void printFullData(){
        System.out.println("Name: " + title + " Author: " + author);
        System.out.println("Eligibility: " + eligibility + " Minimal age: " + age + " Price: " + price);
    }




}
