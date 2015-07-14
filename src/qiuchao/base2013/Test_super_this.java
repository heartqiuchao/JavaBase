package qiuchao.base2013;

public class Test_super_this extends SuperClass{
	public Test_super_this(){
		System.out.println("S");
		super.d();	
	}
	 public void d(){
    	System.out.println("SD");
    }
	 public void f(){
		 System.out.println("SF");
	 }
    public static void main(String[] args)  {
        SuperClass s=new Test_super_this();
        Test_and_operator t=null;
        if(s instanceof SuperClass){
    	   System.out.println("Yes");
//    	   t=(Test_and_operator)s;
        }
        if(s!=null)
        	System.out.println("Yes");
    }
}
 
class SuperClass{
    public SuperClass(){
    	System.out.println("P");
    	this.d();
    }
    public void d(){
    	System.out.println("PD");
    }
}