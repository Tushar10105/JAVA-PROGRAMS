class Employee{
	String empName;
	int empId;

	Employee(String empName,int empId){
		this.empName=empName;
		this.empId=empId;
		}
		void ShowEmployee(){
			System.out.println("EMPLOYEE ID: "+empId+"\nNAME: "+empName);
			}
	}

	class Department{
		String deptName;
		Employee employee;

		Department(String deptName,Employee employee){
			this.deptName=deptName;
			this.employee=employee;
			}
			void ShowDepartment(){
				System.out.println("DEPARTMENT: "+deptName);
				employee.ShowEmployee();
				}
		}

		public class Aggregation{
			public static void main(String args[]){
				Employee e1=new Employee("TUSHAR KANT",240104);
				Department d1=new Department("Software Development",e1);
				d1.ShowDepartment();
				}
			}