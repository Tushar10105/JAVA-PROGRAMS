class Employee{
int salary=60000;
}

class Engineer extends Employee{
	int benefits=10000;
	}

	public class InheritanceExample{
		public static void main(String args[]){
			Engineer obj=new Engineer();
			System.out.println("Salary: "+obj.salary+"\nBenits: "+obj.benefits);
			}
		}