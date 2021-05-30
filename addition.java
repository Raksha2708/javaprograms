class Example
{
	int a,b,total;
	void add()
	{
		total=a+b;
	}
}
class Firstprogram
{
	public static void main(String args[])
	{
		Example obj=new Example();
		obj.a=10;
		obj.b=20;
		obj.add();
		System.out.println("additon="+obj.total);
	}
}