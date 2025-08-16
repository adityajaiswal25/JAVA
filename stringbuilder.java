public class stringbuilder {
    public static void main(String[] args) {
        // Example of using StringBuilder
    StringBuilder sb = new StringBuilder("Aditya");
    sb.append(" is a good programmer");
    System.out.println(sb);
    sb.insert(7, "very ");
    System.out.println(sb); 
    sb.replace(0, 6, "Rohit");
    System.out.println(sb);
    sb.delete(0, 6);
    System.out.println(sb);
    sb.reverse();
    System.out.println(sb);
    sb.setLength(0); // Clear the StringBuilder
    System.out.println("StringBuilder after clearing: " + sb);  
    
}}
