import java.util.Scanner;

class Student {
    private String name;
    private String dept;
    private int rollno;

    void getdata() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter name");
        name = in.next();
        System.out.println("Enter rollno");
        rollno = in.nextInt();
        in.nextLine();
        System.out.println("Enter dept");
        dept = in.nextLine();
    }

    int getroll() {
        return rollno;
    }

    void printdata() {
        System.out.println("Details are: \nName: " + name + "\nRoll no is: " + rollno + "\nDepartment is:" + dept);
    }
}

public class Main {
    public static void main(String args[]) {
        int i;
        System.out.println("Enter number of students(>=4)");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Student[] s = new Student[n];
        for (i = 0; i < n; i++) {
            s[i] = new Student();
            s[i].getdata();
        }
        for (i = 0; i < n; i++) {
            s[i].printdata();
        }
        System.out.println("Enter roll number to be searched");
        int roll = in.nextInt();
        for (i = 0; i < n; i++) {
            int res = s[i].getroll();
            if (res == roll)
                s[i].printdata();
        }
        in.close();
    }
}
