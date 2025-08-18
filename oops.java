public class oops{
    public static class  Student{
    String name;
    int rollNo;
    Double percentage;
    }
    public static  class car{
        String name;
        String type;
        Double price;
    }
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        car c1 = new car();
        car c2 = new car();
        c1.name = "alto";
        c1.type = "hachback";
        c1.price = 500000.0;
        c2.name = "fortuner";  
        c2.type = "suv";
        c2.price = 3500000.0;
        System.out.println("Car Name: " + c1.name);
        System.out.println("Car Type: " + c1.type);
        System.out.println("Car Price: " + c1.price);
        System.out.println("Car Name: " + c2.name);
        System.out.println("Car Type: " + c2.type);
        System.out.println("Car Price: " + c2.price);
        s2.name = "Rohan";
        s2.rollNo = 21;
        s2.percentage = 90.5;
        s1.name = "Aditya";
        s1.rollNo = 22;
        s1.percentage = 85.5;

        System.out.println("Student Name: " + s1.name);
        System.out.println("Roll No: " + s1.rollNo);
        System.out.println("Percentage: " + s1.percentage);
        System.out.println("Student Name: " + s2.name);
        System.out.println("Roll No: " + s2.rollNo);
        System.out.println("Percentage: " + s2.percentage);

    }



}