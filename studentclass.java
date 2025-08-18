public class studentclass {
    // Public access modifier - accessible from anywhere
    public String name;
    
    // Private access modifier - accessible only within this class
    private int rollNo;
    
    // Protected access modifier - accessible within same package and subclasses
    protected Double percentage;
    
    // Default (package-private) access modifier - accessible only within same package
    String email;
    
    // Private field for demonstrating encapsulation
    private double gpa;
    
    // Public constructor
    public studentclass(String name, int rollNo, Double percentage, String email, double gpa) {
        this.name = name;
        this.rollNo = rollNo;
        this.percentage = percentage;
        this.email = email;
        this.gpa = gpa;
    }
    
    // Public getter method for private rollNo (encapsulation)
    public int getRollNo() {
        return rollNo;
    }
    
    // Public setter method for private rollNo (encapsulation)
    public void setRollNo(int rollNo) {
        if (rollNo > 0) {
            this.rollNo = rollNo;
        }
    }
    
    // Protected method - accessible to subclasses
    protected void updatePercentage(Double newPercentage) {
        if (newPercentage >= 0 && newPercentage <= 100) {
            this.percentage = newPercentage;
        }
    }
    
    // Private method - only accessible within this class
    private String generateStudentId() {
        return "STU" + rollNo + name.substring(0, 2).toUpperCase();
    }
    
    // Public method to access private generateStudentId
    public String getStudentId() {
        return generateStudentId();
    }
    
    // Default access method - package access
    void displayBasicInfo() {
        System.out.println("Name: " + name + ", Roll No: " + rollNo);
    }
    
    // Public method to display all student information
    public void displayCompleteInfo() {
        System.out.println("=== Student Information ===");
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Email: " + email);
        System.out.println("GPA: " + gpa);
        System.out.println("Student ID: " + getStudentId());
    }
    
    // Protected method for grade calculation
    protected String calculateGrade() {
        if (percentage >= 90) return "A+";
        else if (percentage >= 80) return "A";
        else if (percentage >= 70) return "B";
        else if (percentage >= 60) return "C";
        else if (percentage >= 50) return "D";
        else return "F";
    }
}
