package Part1Demonstratetheuse;
// Part1.1 Declaration of class
class Worker {

    public String name;
    public String surname;
    //Part1.5 Public properties of various data type
    public int number;
    public char code;
    public double value;


    //Part1.6 Demonstrate private properties of various types
    private int salary;                                             //Private property with getter and setter
    //1.7 Demonstrate getter and setter for the private value
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    private char grade;                    //Private property with getter and setter
    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }
    private boolean reliable;               //Private property with getter and setter
    public boolean isReliable() {
        return reliable;
    }

    public void setReliable(boolean reliable) {
        this.reliable = reliable;
    }

    private String codename;                    //Private property with getter and setter
    public String getCodename() {
        return codename;
    }

    public void setCodename(String codename) {
        this.codename = codename;
    }

    private double rates;                         //Private property with getter and setter
    public double getRates() {
        return rates;
    }

    public void setRates(double rates) {
        this.rates = rates;
    }
    //Part1.2 Public method in a class
    public void printFullName(){
        System.out.println(name + " " + surname);
    }
    //Part1.3 Private method in class
    private void printSalary(){
        System.out.println(salary);
    }
    //Part1.4 and part 1.8 Constructor
    public Worker(String name, String surname){
        this.name = name;
        this.surname = surname;
        System.out.println(name + " " + surname);

    }
    public void printCodeNumValue(){
        System.out.println(" " + code + number + " efficiency: " + value);
    }
}



public class Main {
    public static void main(String[] args) {
            //Part1.1 Declaration objects of class Worker
            Worker wrk1 = new Worker("John","Smith");

            //Part1.2 Calling public method
            wrk1.printFullName();

            //Part1.3 Calling private method
            //wrk1.printSalary();
            //Part1.5 Access through object
            wrk1.code = 'A';
            wrk1.number = 13;
            wrk1.value = 89.9;
            wrk1.printCodeNumValue();
            //Part1.6 Accessing private property
            //wrk1.salary = 1300;
            //Part1.7 Use of getters and setters
            wrk1.setSalary(1300);
            wrk1.setCodename("Hammer");
            wrk1.setReliable(true);
            wrk1.setGrade('S');
            wrk1.setRates(3.57);
            System.out.println("Salary: " + wrk1.getSalary());
            System.out.println("Codename: " + wrk1.getCodename());
            System.out.println("Reliability: " + wrk1.isReliable());
            System.out.println("Grade: " + wrk1.getGrade());
            System.out.println("Rates: " + wrk1.getRates());
    }
}