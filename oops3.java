// Comprehensive examples of access modifiers: public, private, protected, and default
public class oops3 {
  
    public static void main(String[] args) {
        // Creating student objects using different constructors and methods
        System.out.println("=== Access Modifiers Demonstration ===\n");
        
        // Example 1: Using public fields and methods
        System.out.println("1. Public Access Modifier Examples:");
        studentclass s1 = new studentclass("Alice", 101, 85.5, "alice@school.com", 3.8);
        s1.name = "Alice Johnson"; // Public field - directly accessible
        System.out.println("Public name: " + s1.name);
        s1.displayCompleteInfo(); // Public method
        
        // Example 2: Using private fields via public getters/setters
        System.out.println("\n2. Private Access Modifier Examples:");
        studentclass s2 = new studentclass("Bob", 102, 92.0, "bob@school.com", 4.0);
        // s2.rollNo = 105; // This would cause compilation error - rollNo is private
        s2.setRollNo(105); // Using public setter method
        System.out.println("Private rollNo accessed via getter: " + s2.getRollNo());
        
        // Example 3: Protected access (within same package)
        System.out.println("\n3. Protected Access Modifier Examples:");
        studentclass s3 = new studentclass("Charlie", 103, 78.5, "charlie@school.com", 3.2);
        // Direct access to protected field is possible within same package
        System.out.println("Protected percentage: " + s3.percentage + "%");
        
        // Example 4: Default (package-private) access
        System.out.println("\n4. Default Access Modifier Examples:");
        studentclass s4 = new studentclass("David", 104, 88.0, "david@school.com", 3.7);
        // Default access - accessible within same package
        s4.email = "david.updated@school.com";
        System.out.println("Default email: " + s4.email);
        
        // Example 5: Using different methods with various access levels
        System.out.println("\n5. Method Access Examples:");
        studentclass s5 = new studentclass("Eve", 105, 95.0, "eve@school.com", 3.9);
        
        // Public method - accessible from anywhere
        System.out.println("Public method - Student ID: " + s5.getStudentId());
        
        // Protected method - accessible within same package
        System.out.println("Protected method - Grade: " + s5.calculateGrade());
        
        // Default method - accessible within same package
        System.out.print("Default method - ");
        s5.displayBasicInfo();
        
        // Example 6: Demonstrating encapsulation with validation
        System.out.println("\n6. Encapsulation with Validation:");
        studentclass s6 = new studentclass("Frank", 106, 75.0, "frank@school.com", 3.5);
        System.out.println("Before: Roll No = " + s6.getRollNo());
        s6.setRollNo(-5); // Invalid roll number - won't be set
        System.out.println("After invalid attempt: Roll No = " + s6.getRollNo());
        s6.setRollNo(999); // Valid roll number
        System.out.println("After valid update: Roll No = " + s6.getRollNo());
        
        // Example 7: Complete student information display
        System.out.println("\n7. Complete Student Information:");
        studentclass[] students = {
            new studentclass("Grace", 107, 89.5, "grace@school.com", 3.8),
            new studentclass("Henry", 108, 91.0, "henry@school.com", 3.9),
            new studentclass("Ivy", 109, 87.5, "ivy@school.com", 3.7)
        };
        
        for (studentclass student : students) {
            student.displayCompleteInfo();
            System.out.println("---------------------");
        }
        
        // Example 8: Demonstrating method chaining with access modifiers
        System.out.println("\n8. Access Modifier Summary:");
        System.out.println("Public: Accessible from anywhere");
        System.out.println("Private: Accessible only within the class");
        System.out.println("Protected: Accessible within package and subclasses");
        System.out.println("Default: Accessible only within the same package");
    }
}
