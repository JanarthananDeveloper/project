import java.util.Scanner;
public class Multiplication {
	int mul()
	{
		Scanner s = new Scanner(System.in);
        System.out.println("enter the number ");
        int no= s.nextInt();
        System.out.println("how many times u need to multiply");
        int hw= s.nextInt();
        int mul;
        
        for(int i=1;i<=hw;i++)
        {
            mul=no*i;
            System.out.println(""+no+"*"+i+"="+mul);
        }
        return no;
	}
    public static void main(String[] args) {
        Multiplication m = new Multiplication();
        m.mul();
        System.out.println("the no is founded here ");
System.out.println("Praveen modified this project ");
        
    }
    
}