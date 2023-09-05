import java.util.Scanner;
public class LogicalCgpa
{
    public static void main(String[] args)
    {   Scanner sc= new Scanner(System.in);
        System.out.println("Enter English Marks:  ");
        int a= sc.nextInt();
        if(a>100)
        {
            System.out.println("The Marks entered is invalid! Should not exceed 100.");
        } else{
            if (a<35)
            {
                System.out.println("You failed!");
            }
            System.out.println("Enter Hindi Marks:  ");
            int b= sc.nextInt();
            if(b>100)
            {
                System.out.println("The Marks entered is invalid! Should not exceed 100.");
            }
            if(b<35)
            {
                System.out.println("You failed!");
            }
            System.out.println("Enter Social Studies Marks:  ");
            int c= sc.nextInt();
            if(c>100)
            {
                System.out.println("The Marks entered is invalid! Should not exceed 100.");
            }
            if(c<35)
            {
                System.out.println("You failed!");
            }
            System.out.println("Enter Science Marks:  ");
            int d= sc.nextInt();
            if(d>100)
            {
                System.out.println("The Marks entered is invalid! Should not exceed 100.");
            }
            if(d<35)
            {
                System.out.println("You failed!");
            }

            System.out.println("Enter Mathematics Marks:  ");
            int e= sc.nextInt();
            if(e>100)
            {
                System.out.println("The Marks entered is invalid! Should not exceed 100.");
            }
            if(e<35)
            {
                System.out.println("You failed!");
            }
            float total= a+b+c+d+e;
            System.out.println("Your Total Marks is: "  +total);
            float percentage= total * 100/500;
            float cgpa=percentage/9.5f;
            System.out.println("Your CGPA is: " +cgpa);
            System.out.println("The total percentage of Marks obtained are: " +percentage);
        }

    }
}