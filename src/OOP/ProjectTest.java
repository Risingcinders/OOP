package OOP;

public class ProjectTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Project Peanut = new Project();
		System.out.println(Peanut.getName());
		
		Project Butter = new Project("Butter");
		System.out.println(Butter.getName());
		
		Project Jelly = new Project("Jelly", "This is the most important part of the sandwich" );
		System.out.println(Jelly.getName());
				
	}

}
