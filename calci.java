class calci
{
    public float add(int a, int b)
    {
        return a + b;
    }
    public float sub(int a, int b)
    {
        return a - b;
    }
    public float mul(int a, int b)
    {
        return a * b;
    }
    public float div(int a, int b)
    {
        return a / b;
    }
    public static void main(String args[])
    {
        calci c = new calci();
        System.out.println("Addition of two numbers"+c.add(10,20));
        System.out.println("Difference of two numbers"+c.sub(10,20));
        System.out.println("Product of two numbers"+c.mul(10,20));
        System.out.println("Division of two numbers"+c.div(10,20));  
    }
}