import java.util.*;
public class Main
{
	public static void main(String[] args) {

            List<Integer> list=new ArrayList<>();
            int n=3609;
            int sqrt=(int)Math.sqrt(n);
            System.out.println(sqrt);
            for(int i=2;i<=sqrt&&n!=1;i++)
            {
                while(n%i==0)
                {
                    list.add(i);
                    n/=i;
                }
            }
            if(n!=1)list.add(n);
            System.out.println(list);
	}
}
