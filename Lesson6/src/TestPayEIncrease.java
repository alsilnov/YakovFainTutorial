import com.practicaljava.lesson6.Contractor;
import com.practicaljava.lesson6.Employee;
import com.practicaljava.lesson6.Payable;

public class TestPayEIncrease {

    public static void main(String[] args) {
	Payable[] workers = new Payable[3];
	workers[0] = new Employee("John");
	workers[1] = new Contractor("Mary");
	workers[2] = new Employee("Staeve");
	Employee currentEmployee;
	Contractor currentContractor;
	for (Payable p : workers) {
	    p.increasePay(30);
	}
    }
}
