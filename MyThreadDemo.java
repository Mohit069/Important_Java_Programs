class MyThreadDemo
{
public static void main(String [] args)
{

Thread t = new Thread()
{
	public void run()
	{
	for(int i =0;i<=10;i++)
		System.out.println("Child Class");
	}
};
t.start();

for(int i=0;i<=10;i++){
	System.out.println("This is Main Class");
}


Thread t1 = new Thread()
{
	public void run()
	{
	for(int i =0;i<=10;i++)
		System.out.println("Hello Class");
	}
};
t1.start();


}
}