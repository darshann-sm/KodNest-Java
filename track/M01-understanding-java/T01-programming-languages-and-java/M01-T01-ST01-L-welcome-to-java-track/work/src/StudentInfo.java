import java.util.*;

public class StudentInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String studentName = sc.nextLine();

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        System.out.print("Enter college code: ");
        int collegeCode = sc.nextInt();

        System.out.print("Enter mobile number: ");
        long mobNumber = sc.nextLong();

        System.out.print("Enter percentage: ");
        double percentage = sc.nextDouble();

        System.out.print("Enter annual fee: ");
        double annualFee = sc.nextDouble();

        System.out.print("Enter grade: ");
        char grade = sc.next().charAt(0);

        System.out.print("Enter placement status (true/false): ");
        boolean placementStatus = sc.nextBoolean();

        System.out.println("\nStudent informatin");
        System.out.println("-----------");
        System.out.println("student name : " + studentName);
        System.out.println("age : " + age);
        System.out.println("colage code: " + collegeCode);
        System.out.println("mob number:" + mobNumber);
        System.out.println("percentage :" + percentage);
        System.out.println("annual fee : " + annualFee);
        System.out.println("grade :" + grade);
        System.out.println("placement status : " + placementStatus);

    }
}