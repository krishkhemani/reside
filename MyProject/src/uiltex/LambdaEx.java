package uiltex;

interface inter1
{
	void disp(int a,int b);
//	void disp1();
}
public class LambdaEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=10;
		
//		inter1 in=new inter1() {
//			public void disp()
//			{
//				System.out.println("I am inside the object implemented with it");
//			}
//	
//	};// VERY UNIQUE AND IMP to note as we created method inside object for interface
//	in.disp();
	
		//Lambda Expression used only to make code simple we can use the above method to write the code it is possible only with functional interface 
	inter1 in=(a,b)->
	{
		System.out.println("hello world  "+(a+b));
		
	};
	in.disp(3, 4);
}

}