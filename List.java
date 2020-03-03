import java.util.ArrayList;
import java.util.Scanner;

class DemoList
{
    ArrayList<Integer> ar=new ArrayList<Integer>();
    void add(int element)
    {
        ar.add(element);
    }
    int get(int position)
    {
        return ar.get(position);
    }
    int position(int element)
    {
        return ar.indexOf(element);
    }
    void remove(int position)
    {
        ar.remove(ar.get(position));
    }
    void removelast()
    {
        ar.remove(ar.get(ar.size()-1));
    }
    void print()
    {
        System.out.print(ar);
        System.out.println();
    }
}
public class List
{
    public static void main(String args[])
    {
        DemoList demoList=new DemoList();
        Scanner s=new Scanner(System.in);
	System.out.println("1:Add\n2:Get\n3:Position\n4:remove\n5:print\n6:exit");
        int ch;
        while (s.hasNext())
        {
            ch=s.nextInt();
            if(ch==1)
            {
                demoList.add(s.nextInt());
            }
            else if(ch==2)
            {
                System.out.println("Element is:"+demoList.get(s.nextInt()));
            }
            else if(ch==3)
            {
                System.out.println("Position is:"+demoList.position(s.nextInt()));
            }
            else if(ch==4)
            {
                demoList.remove(s.nextInt());
            }
            else if(ch==5)
            {
                demoList.print();
            }
            else
            {
               System.exit(0);
            }
        }
    }
}