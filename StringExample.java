package abc;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String strVar1="Java 공부중";
        String strVar2="Java 공부중";
        
        if (strVar1==strVar2) {
        	System.out.println("strvar과 strVar2는 참조가 같음");
        }else {
        	System.out.println("strVar1과 strVar2는 참조가 다름");
        }
        if(strVar1.equals(strVar2)) {
        	System.out.println("strVar1과 strVar2는 문자열이 같음");
        }
        String strVar3=new String("Java 공부중");
        String strVar4=new String("Java 공부중");
        
        if(strVar3==strVar4) {
        	System.out.println("strVar3과 strVar4는 참조가 같음");
        }else {
        	System.out.println("strVar3과 strVar4는 참조가 다름");
        }
        if(strVar3.equals(strVar4)) {
        	System.out.println("strVar3과 strVar4는 문자열 같음");
        }
        }
	}


