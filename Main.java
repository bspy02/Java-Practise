import java.util.ArrayList;
import java.util.Scanner;  // Import the Scanner class
import java.util.Random;
class Main 
{
    public static void main(String[] args) 
    {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        int n     = Integer.parseInt(input("Length: "));
        int range = Integer.parseInt(input("Range: "));        
        nums = randlist(n,range);
        System.out.println(nums);
        System.out.println(insertsort(nums));
        System.out.println(nums);

    }
    public static ArrayList<Integer> randlist(int n,int range)
    {
        ArrayList al = new ArrayList(); 
        Random rand = new Random();

        for (int j = 0; j<n; j++)
        {
            al.add(rand.nextInt(range));
        }
        return al;
    }
    public static ArrayList<Integer> insertsort(ArrayList<Integer> al)
    {
        ArrayList<Integer> lis = new ArrayList<>(al);
        lis.add(0,-1);
        for (int i = 1; i < lis.size(); i++)
        {
            int num = lis.get(i);
            for (int j = i-1; j>=0; j--)
            {
                if(num>lis.get(j))
                {
                    lis.add(j+1,num);lis.remove(i+1);
                    break;
                }
            }
        }
        lis.remove(0);
        return lis;
    }
    public static void print(String s)
    {
        System.out.println(s);
    }
    public static String input(String question)
    {
        Scanner myObj = new Scanner(System.in); 
        System.out.println(question);
        String in = myObj.nextLine();  // Read user input
        return in;  // Output user input
    }
}