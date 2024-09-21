import java.util.* ;
import java.io.*; 

// Create the classes here
class GrandFather{
	String Gname;
	public GrandFather(String Gname){
		this.Gname = Gname;
	}
}

class Father extends GrandFather{
	String Fname;
	public Father(String Fname, String Gname){
		super(Gname);
		this.Fname = Fname;
	}
}

class Son extends Father{
	String son;
	public Son(String name,String fname, String Gname){
		super(fname,Gname);
		this.son = name;
	}

	void printName(){
		System.out.println("sonname: "+this.son);
		System.out.println("fathername: "+this.Fname);
		System.out.println("grandfather: "+this.Gname);
	}
}


class SonFather {
	
	public static void main(String args[]) {
		
		// Write your code here
		Son mySon = new Son("Saurabh","Ramesh","Suresh");
		mySon.printName();
	}
}