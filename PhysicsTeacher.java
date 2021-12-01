import packageFile.*;
class PhysicsTeacher{
String designation = "Teacher";
String collageName = "Samarth collage";
void does(){
	System.out.println("Teachning");
	}
}
public class Teacher extends PhysicsTeacher{
	String Subject = "physics";
public static void main(String args[])
{
	PhysicsTeacher obj = new physicsTeacher();
	System.out.println("obj.desination");
		System.out.println("obj.collagename");

	System.out.println("obj.subject");
	obj.does();
	}
}