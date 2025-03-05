class Employee implements Cloneable{
	String name;
	int salary;

	Employee(String name,int salary){
		this.name=name;
		this.salary=salary;
		}

		public Object clone() throws CloneNotSupportedException{
			return super.clone();
			}

		void Display(){
			System.out.println(name+" getting "+salary);
			}

	}

	public class ShallowObjCloning{
		public static void main(String args[]) throws CloneNotSupportedException{
			Employee obj1=new Employee("TUSHAR",50000);
			Employee obj2=(Employee) obj1.clone();

			obj1.Display();
			obj2.Display();
			}
		}