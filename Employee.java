import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Employee 
{
	int eid;
	String ename;
	double esal;
	public Employee(int id, String name, double sal) {
		super();
		this.eid = id;
		this.ename = name;
		this.esal = sal;
	}
	@Override
	public String toString() {
		return "EmployeeCRUDOperations [id=" + eid + ", name=" + ename + ", sal=" + esal + "]";
	}
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		List<EmployeeCRUDOperations> emps=new ArrayList<EmployeeCRUDOperations>();
		
		do
		{
			System.out.println("******************");
			System.out.println("******************");
			System.out.println("1.Add employee");
			System.out.println("2.Delete employee");
			System.out.println("3.Update employee");
			System.out.println("4.Search employee");
			System.out.println("5.Display employee");
			System.out.println("6.Exit");
			System.out.println("******************");
			System.out.println();
				
				System.out.println("Enter your choice?");
				int key=sc.nextInt();
				
				switch (key) 
				{
							case 1: System.out.println("Enter id name and salary?");
									int id=sc.nextInt();
									String name=sc.next();
									double sal=sc.nextDouble();
									EmployeeCRUDOperations e=new EmployeeCRUDOperations(id,name,sal);
									emps.add(e);
									System.out.println("Added successfully");
									System.out.println();
									break;
									
							case 2:System.out.println("Enter emp id to delete?");
									id=sc.nextInt();
									for(EmployeeCRUDOperations emp: emps) 
									{
										if(emp.eid==id)
										{
											emps.remove(emp);
											System.out.println("Successfully removed");
											System.out.println();
											id=0;
											break;
										}
									}
									if(id!=0)
										System.out.println("Employee not exist!!!");
									    System.out.println();
									break;
							
							case 3:System.out.println("Enter emp id to update?");
									id=sc.nextInt();
									for(EmployeeCRUDOperations emp: emps) 
									{
										if(emp.eid==id)
										{
											System.out.println("Enter new salary?");
											emp.esal=sc.nextDouble();
											System.out.println("Successfully updated");
											System.out.println();
											id=0;
											break;
										}
									}
									if(id!=0)
										System.out.println("Employee does not exist");
									    System.out.println();
									break;
									
							case 4:System.out.println("Enter emp id to search?");
									id=sc.nextInt();
									for(EmployeeCRUDOperations emp: emps) 
									{
										if(emp.eid==id)
										{
											System.out.println(emp);
											System.out.println("Successfully searched");
											System.out.println();

											id=0;
											break;
										}
									}
									if(id!=0)
										System.out.println("Employee does not exist");
									    System.out.println();

									break;
							
							case 5:System.out.println("Employee all details: ");
									for(EmployeeCRUDOperations emp:emps) 
									{
										System.out.println(emp);
										System.out.println();

									}
											break;
							case 6:System.exit(1);
							
							default:System.out.println("Invalid choice");
							        System.out.println();

									break;
					}
				}while(true);
	}
}