import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository{
    private static List<EmployeeModel> emplist=new ArrayList<EmployeeModel>();

    public boolean saveEmployee(EmployeeModel emp)
    {
        emplist.add(emp);
        return true;
    }
    public List<EmployeeModel> fetchAll()
    {
        return emplist;
    }
}







