package basePackage;

import java.util.ArrayList;
import java.util.Arrays;


public class ArrayClass {

	public static void main(String[] args) {
		ArrayClass obj = new ArrayClass();
		obj.BuildArr();
	}

	
	public void BuildArr() {
		ArrayList<Integer> AL =  new ArrayList<Integer>();{
			AL.add(0, 10);
			AL.add(1, 12);
			AL.add(1, 14);
			System.out.println(AL);
	
		
	ArrayList<String> StringArr1 = new ArrayList<String>(Arrays.asList("Banthi", "Nidhi","SriNidhi"));
	String[] newArr=StringArr1.toArray(new String[StringArr1.size()]);
	
	ArrayList<String> StringArr2 = new ArrayList<String>(Arrays.asList("Banthi", "Nidhi","SriNidhi"));
	
	// ArraysList to Array AL.toArray(Al.Size)	
	String[] newArr2=StringArr1.toArray(new String[StringArr2.size()]);
	
	//Array to ArrayList using Arrays.asList(AL)
	ArrayList<String> arr= new ArrayList<String>(Arrays.asList(newArr2));
	
		ArrayList<String> StringArr3 = new ArrayList<String>(Arrays.asList("Shashi", "Kanth","Chintu"));
		System.out.println("StringArr3 before addAll "+StringArr3);
		StringArr2.addAll(StringArr1);
		System.out.println("StringArr3 after addAll "+StringArr3);
		
		String str =StringArr3.toString();
		System.out.println("str is "+str);
		System.out.println(str.length());
		String[] newStr=str.split(",");
		System.out.println(newStr.length);
		for(String s:newStr )
		System.out.println(s);
		}
	}
	
}
