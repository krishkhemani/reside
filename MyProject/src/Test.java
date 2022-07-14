public class Test{
	 int a=0;
	
	Test(){
		System.out.println(++a);
	}
	public static void main(String[] args) {
		Test s;
		
		for(int i=0;i<3;i++)
		{
			s=new Test();
		}
	}
}