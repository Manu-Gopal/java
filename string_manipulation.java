import java.util.Scanner;
public class string_manipulation
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a string : ");
		String str= s.nextLine();

		//UpperCase and LowerCase
		String u=str.toUpperCase();
		String l=str.toLowerCase();
		System.out.println("Upper Case : "+u);
		System.out.println("LowerCase : "+l);
        System.out.println("");

		//Replace
        System.out.println("String Replacement");
		System.out.println("Enter a string : ");
		String str1=s.nextLine();
		System.out.println("Enter the string to be replaced : ");
		String x=s.nextLine();
		System.out.println("Enter the string ");
		String y=s.nextLine();
		String s1=str1.replace(x,y);
		System.out.println("Replace : "+s1);
        System.out.println("");


		//Equal or not
        System.out.println("To check whether strings are equal or not");
		System.out.println("Enter 1st string : ");
		String st1=s.nextLine();
		System.out.println("Enter 2nd string : ");
		String st2=s.nextLine();
		if(st2.equals(st1))
			System.out.println("Two strings are equal.");
		else
			System.out.println("Two strings are not equal.");
        System.out.println("");


		//Equals Ignore
        System.out.println("To check whether strings are equal or not ignoring cases");
		System.out.println("Enter 1st string : ");
		String str_1=s.nextLine();
		System.out.println("Enter 2nd string : ");
		String str_2=s.nextLine();
		if(str_2.equalsIgnoreCase(str_1))
			System.out.println("Two strings are equal while ignoring the case.");
		else
			System.out.println("Two strings are not equal even after ignoring the case.");
        System.out.println("");
        

		//Length of the string
        System.out.println("To find length of the string");
		System.out.println("Enter the string : ");
		String string=s.nextLine();
		int len=string.length();
		System.out.println("Length of the string : "+len);
        System.out.println("");


		//Concatenation
        System.out.println("To concatenate 2 strings");
		System.out.println("Enter 1st string : ");
		String strr1=s.nextLine();
		System.out.println("Enter 2nd string : ");
		String strr2=s.nextLine();
		strr1=strr1.concat(strr2);
		System.out.println("String after concatenation : "+strr1);
        System.out.println("");
	

		//substring - to get the sub string starting from the mentioned index
        System.out.println("To get the sub string starting from the mentioned index");
		System.out.println("Enter a string : ");
		String s_1=s.nextLine();
		System.out.println("Enter the index : ");
		int n=s.nextInt();		
		s_1=s_1.substring(n);
		System.out.println("Sub-string from "+n+" to the end : "+s_1);
        System.out.println("");


		//substring - to get the sub string starting from the mentioned index
        System.out.println("To get the sub string starting from the mentioned index");
		System.out.println("Enter a string : ");
		String st=s.next();
		System.out.println("Enter the starting index number : ");
		int p=s.nextInt();
		System.out.println("Enter the ending index number : ");
		int m=s.nextInt();
		st=st.substring(p,m);
		System.out.println("Sub-string from "+p+" to "+m+" : "+st);
        System.out.println("");


		//to get the position of first occurence of a character 
        System.out.println("To get the position of first occurence of a character");
		System.out.println("Enter a string : ");
		String st_1=s.next();
		System.out.println("Enter the character : ");
		String c=s.next();
		int i=st_1.indexOf(c);
		System.out.println("Position of first occurence of the character "+c+" is at : "+(i+1));
        System.out.println("");


		//to get the position of the character that occurs after N-th position in the string
        System.out.println("To get the position of the character that occurs after N-th position in the string");
		System.out.println("Enter a string : ");
		String strr_1=s.next();
		System.out.println("Enter the character : ");
		String a=s.next();
		System.out.println("Enter the position : ");
		int pos=s.nextInt();		
		int ind=strr_1.indexOf(c,n);
		System.out.println("Position of the character "+a+" that occurs after "+pos+"-th position in the string is : "+(ind));
        System.out.println("");


		//charAt - gives the n-th character 
        System.out.println("To give the n-th character");
		System.out.println("Enter a string : ");
		String stri=s.next();
		System.out.println("Enter the n : ");
		int num=s.nextInt();
		char c1=stri.charAt(n);
		System.out.println("The character at "+num+" is : "+c1);
        System.out.println("");

	}
}