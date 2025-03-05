class Address{
	String city;

	Address(String city){
		this.city=city;
		}
	}

	class Employee implements Cloneable{
		String name;
		int salary;
		Address address;

		Employee(String name,int salary,Address address){
			this.name=name;
			this.salary=salary;
			this.address=address;
			}

			public Object clone() throws CloneNotSupportedException {
				Employee cloned=(Employee)super.clone();
				cloned.address=new Address(this.address.city);
				return cloned;
				}
			void Display(){
				System.out.println(name+" earns "+salary+" and lives in "+address.city);
				}
		}

		public class DeepObjClone{
			public static void main(String args[]) throws CloneNotSupportedException{
				Employee obj1=new Employee("TUSHAR",50000,new Address("BHUBANESWAR"));
				Employee obj2=(Employee)obj1.clone();

				obj1.Display();
				obj2.Display();

				obj2.address.city="Angul";
				System.out.println("\n\\/___AFTER THE MODIFICATION CLONED OBJECT'S ADDRESS___\\/\n");
				obj1.Display();
				obj2.Display();
				}
			}