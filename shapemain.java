import java.util.*;
class shapemain
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int ch;
        shape s1;
        rectangle r=new rectangle();
        triangle t=new triangle();
        circle c=new circle();
        
        System.out.println("ENTER YOUR CHOICE\n1.Rectangle\n2.Triangle\n3.circle");
        ch=sc.nextInt();
        switch(ch)
        {
            case 1:
                System.out.println("Enter length and breath");
                int l=sc.nextInt();
                int b=sc.nextInt();
                r.getdata(l,b);
                r.printArea();
                break;
                
            case 2:
              System.out.println("Enter base and heigth");
                int b1=sc.nextInt();
                int h=sc.nextInt();
                t.getdata(b1,h);
                t.printArea();
                break;
            case 3:
              System.out.println("Enter radius of the circle"); 
              int r1=sc.nextInt();
                c.getdata(r1);
                c.printArea();
                break;
                default: System.out.println("WRONG CHIOICE");
            }
	}
}
