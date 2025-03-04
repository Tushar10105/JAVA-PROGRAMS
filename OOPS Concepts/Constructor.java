class Employee{
	String name;
	double basicsalary,bonus,total;


	Employee(){
		this.name="UNKNOWN";
		this.basicsalary=0;
		this.bonus=0;
		this.total=0;
		}

	Employee(String name,double basicsalary,double bonus){
		this.name=name;
		this.basicsalary=basicsalary;
		this.bonus=bonus;
		total=basicsalary+bonus;
		}

	Employee(Employee emp){
		this.name=emp.name;
		this.basicsalary=emp.basicsalary;
		this.bonus=emp.bonus;
		total=emp.total;
		}

		void Display(){
			System.out.println("EMPLOYEE: "+name);
			System.out.println("BASIC SALARY: "+basicsalary);
			System.out.println("BONUS: "+bonus);
			System.out.println("TOTAL SALARY: "+total);
			System.out.println("==================================");
			}

	}

	public class Constructor{
		public static void main(String args[]){
			Employee obj1=new Employee();
			Employee obj2=new Employee("TUSHAR",30000,10000);
			Employee obj3=new Employee(obj2);

			System.out.println("\t-----------------");
			System.out.println("-------DEFAULT CONSTRUCTOR-------\n");
			obj1.Display();
			System.out.println("----PARAMETERISED CONSTRUCTOR----\n");
			obj2.Display();
			System.out.println("---------COPY CONSTRUCTOR---------\n");
			obj3.Display();
			}
		}
