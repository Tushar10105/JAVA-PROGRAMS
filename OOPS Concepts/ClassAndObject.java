																	// CLASS and OBJECTS
class Student{
	String name;
	int age;
	void Show(){
		System.out.print("NAME: "+name);
		System.out.print("\nAGE: "+age+"\n");
		}
}
	public class ClassAndObject{
		public static void main(String args[]){
			Student obj=new Student();
			obj.name="TUSHAR";
			obj.age=21;
			obj.Show();
			}
	}