import java.*;
public class EmployeeCRUDOperations {
	int eid;
	String ename;
	double esal;
	public EmployeeCRUDOperations(int id, String name, double sal) {
		super();
		this.eid = id;
		this.ename = name;
		this.esal = sal;
	}
	@Override
	public String toString() {
		return "EmployeeCRUDOperations [id=" + eid + ", name=" + ename + ", sal=" + esal + "]";
	}

}
