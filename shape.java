abstract class shape
{
    int a;
    shape()
    {
    }
    abstract void printArea();
}

class rectangle extends shape
{	int b;
    rectangle()
    {
    }
    void getdata(int x,int y)
    {
        a=x;
        b=y;
    }
    void printArea()
    {
        System.out.println("*Area of rectangle*\n"+(a*b));
    }
}

 class triangle extends shape
{	int b;
    triangle()
    {
    }
    void getdata(int x,int y)
    {
        a=x;
        b=y;
    }
    void printArea()
    {
        double area=0.5*a*b;
         System.out.println("*Area of triangle*\n"+area);
    }
} 

 class circle extends shape
{
    circle()
    {
    }
    void getdata(int x)
    {
        a=x;
    }
    void printArea()
    {
        double area=3.14*a*a;
         System.out.println("*Area of circle*\n"+area);
    }
}
