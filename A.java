class A 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test();
		System.out.println("main end");
		System.out.println(test());

	}
	public static int test()
	{
		System.out.println("form test");
	return 100;
	}

}
