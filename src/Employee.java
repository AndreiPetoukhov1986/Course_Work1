public class Employee {
    private final String fullName;
    private int department;     //отдел 1-5
    private int salary;     //зарплата
    private static int counterId=1;

   private int id;

    public Employee (String fullName, int department, int salary){
        this.fullName=fullName;
        this.department=department;
        this.salary=salary;
        this.id=counterId++;
    }

    public String getFullName(){
        return this.fullName;
    }

    public int getDepartment (){
        return this.department;
    }

    public int getSalary(){
        return this.salary;
    }

    public void setDepartment(int department){
        this.department=department;
    }

    public void setSalary(int salary){
        this.salary=salary;
    }

    @Override
    public String toString(){
        return "Ф.И.О. "+fullName+" отдел - "+department+" зарплата "+salary+" рублей ";

    }

}
