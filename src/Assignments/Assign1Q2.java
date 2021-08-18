package Assignments;

import java.util.*;

class ISBN {

    public static void main(String[] args) {

		Scanner in=new Scanner(System.in);
		System.out.println("Enter the 9 digit number ");
	    String number=in.nextLine();
	    int checksum=0,c=10;
	    for(int i=0;i<number.length();i++)
	    {
	    	char ch=number.charAt(i);
	    	int z=Integer.parseInt(Character.toString(ch));
	    	checksum+=c*z;
	    	c--;
	    }
	    int mul=(checksum/11)+1;
	    int d1=mul*11-checksum;
	    if(d1>10) {
	    	System.out.println("Invalid ISBN Number");
	    	
	    }
	    else {
	    	String n="";
	    	if(d1==10)
	    		n="X";
	    	else
	    		n=Integer.toString(d1);
	    	
	    	String isbn=number.charAt(0)+"-"+number.substring(1,4)+"-"+number.substring(4)+"-"+n;
	    	System.out.println(isbn);
            in.close();
	    }
	}
}