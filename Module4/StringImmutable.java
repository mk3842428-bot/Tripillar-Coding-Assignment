package Module4;

public class StringImmutable {
    public static void main(String[] args) {
        String s1 = "Java";
        s1.concat(" Programming");
        System.out.println("String after concat attempt: " + s1);
        String s2 = s1.concat(" Full Stack");
        System.out.println("Original String (s1) remains: " + s1);
        System.out.println("New String (s2) created: " + s2);

        String s3 = "Java";
        System.out.println("Do s1 and s3 point to the same memory? " + (s1 == s3));
    }
}