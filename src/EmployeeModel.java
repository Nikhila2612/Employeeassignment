public class EmployeeModel {
    String ename;
    int empid;
    int age;
    int salary;

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public int getEmpid() {
        return empid;
    }


    public int getSalary(){
        return salary;
    }

    public int setSalary(){
        return salary;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "EmployeeModel{" +
                "ename='" + ename + '\'' +
                ", empid=" + empid +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(int salary) {
    }

}












