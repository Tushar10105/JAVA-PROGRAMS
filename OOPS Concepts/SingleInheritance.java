class Employee{
	String name;
	double basesalary;
	double bonus;

	Employee(String name,double basesalary,double bonus){
		this.name=name;
		this.basesalary=basesalary;
		this.bonus=bonus;
		}

		double Salary(){
			return basesalary+(basesalary*bonus/100);
			}

		void Display(){
			System.out.println("Employee:"+name);
			System.out.println("Base Salary:"+basesalary);
			System.out.println("Bonous Percentage:"+bonus+"%");
			//System.out.println("Total Salary:"+Salary());
			}
	}

	class Devloper extends Employee{
		double additionalbns;
		Devloper(String name,double basesalary,double bonus,double additionalbns){
			super(name,basesalary,bonus);
			this.additionalbns=additionalbns;
			}

			double Salary(){
				return super.Salary() + additionalbns;
				}

				void Display(){
					super.Display();
					System.out.println("Additional Bonous: "+additionalbns);
					System.out.println("Total Salary: "+Salary()+"\n\n");
					}
		}

		public class SingleInheritance{
			public static void main (String arga[]){
				Devloper obj=new Devloper("Tushar",60000,10,5000);
				obj.Display();
				}
			}