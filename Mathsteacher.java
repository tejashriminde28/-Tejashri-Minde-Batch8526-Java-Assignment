 class Teacher{
	String desg="teacher",clg="samarth collage";
	void does()
	{
	System.out.println("Teacher is teaching");
	}
}
public class Mathsteacher extends Teacher{
	String subject="math";
	public static void main(String[] args){
	Mathsteacher m=new Mathsteacher();
		       System.out.println("Designation:"+m.desg); 
		       System.out.println("collage:"+m.clg); 
		       System.out.println("subject:"+m.subject); 
          m.does();
	}
}