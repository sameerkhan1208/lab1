package project1;

public class SimpleInterest 
{
	public static void main(String[] args)
	{
        Scanner sc= new Scanner(System.in);
        int p=sc.nextInt();
        int r= sc.nextInt();
        int t= sc.nextInt();
        System.out.println("The Simple interest is "+((p*r*t)/100));
    sc.close();
    }

}
