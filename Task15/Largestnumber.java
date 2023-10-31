import java.util.Scanner;
class Largestnumber
{ 
    public static void main(String args[]) 
    {
        int num1,num2,num3;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the number :");
        num1=s.nextInt();
        num2=s.nextInt();
        num3=s.nextInt();
        if (num1 > num2 && num1 > num3) {
            System.out.println("The largest number is: " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("The largest number is: " + num2);
        } else {
            System.out.println("The largest number is: " + num3);
        }
    }
}

        


    

