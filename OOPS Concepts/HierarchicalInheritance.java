class Employee{
	double basicsalary;
	Employee(double salary){
		this.basicsalary=salary;
		}
	void Display(){
		System.out.println("BASIC SALARY:"+basicsalary);
		}
	}

	class Manager extends Employee{
		Manager(double salary){
			super(salary);
			}

		double Bonus(){
			return basicsalary*0.15;
			}
		}

		class Developer extends Employee{
			Developer(double salary){
				super(salary);
				}
				double Bonus(){
					return basicsalary*0.10;
					}
		}
		class TechSuports extends Employee{
					TechSuports(double salary){
						super(salary);
						}
						double Bonus(){
							return basicsalary*0.05;
					}
		}

				public class HierarchicalInheritance{
					public static void main(String args[]){
						Manager obj1=new Manager(60000);
						Developer obj2=new Developer(50000);
						TechSuports obj3=new TechSuports(25000);

						System.out.print("\nMANAGER\n");
						System.out.println("--------------------");

						System.out.print("MANAGER: ");
						obj1.Display();
						System.out.println("BONUS: "+obj1.Bonus());
						System.out.println("TOTAL SALARY: "+(obj1.basicsalary+obj1.Bonus()));

						System.out.print("\nDEVELOPER\n");
						System.out.println("--------------------");

						System.out.print("DEVELOPER: ");
						obj2.Display();
						System.out.println("BONUS: "+obj2.Bonus());
						System.out.println("TOTAL SALARY: "+(obj2.basicsalary+obj2.Bonus()));

						System.out.print("\nTECH SUPORTS\n");
						System.out.println("--------------------");

						System.out.print("DEVELOPER: ");
						obj3.Display();
						System.out.println("BONUS: "+obj3.Bonus());
						System.out.println("TOTAL SALARY: "+(obj3.basicsalary+obj3.Bonus()));

						}
					}