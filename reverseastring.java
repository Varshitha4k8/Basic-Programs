package helloworld;

public class reverseastring {
	public static void main(String[] args) {
		String string ="varshitha";
		String reversedstring="";
		for (int i=string.length()-1;i>=0;i--) {
			reversedstring =reversedstring+string.charAt(i);
			
		}
		System.out.println(reversedstring);
	
	}


	}


