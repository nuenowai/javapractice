package abc;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           String str1="Hi, Java";
           String str2=new String("Hi,Java");
           String str3="Hi, Java";
           
           System.out.println(str1.equals(str2));
           System.out.println(str1.equals(str3));
           System.out.println(str1.equalsIgnoreCase(str3));
           
           int len;
           len=str1.length();
           System.out.println("문자열길이(str1):"+len);
           System.out.println("문자열길이(str2):"+str2.length());
           
           String str4=null;
           System.out.println("문자열길이(str4):"+str4.length());
           str3=str4;
           System.out.println("문자열길이(str3):"+str3.length());
	}

}
