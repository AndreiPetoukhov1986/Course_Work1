public class Main {
    static Employee[] employee = new Employee[10];

    public static <employee> void main(String[] args) {

        System.out.println("Курсовая работа");

        employee[0] = new Employee("Петухов Андрей Леонидович", 1, 99_000);
        employee[1] = new Employee("Сухова Кристина Сергеевна", 2, 109_000);
        employee[2] = new Employee("Марьенко Александр Сергеевич", 3, 89_000);
        employee[3] = new Employee("Ожиганова Наталья Юрьевна", 4, 79_000);
        employee[4] = new Employee("Кротова Людмила Григорьевна", 5, 69_000);
        employee[5] = new Employee("Фурсова Наталья Сергеевна", 1, 119_000);
        employee[6] = new Employee("Аверина Галина Васильевна", 2, 129_000);
        employee[7] = new Employee("Николаев Сергей Иванович", 3, 115_000);
        employee[8] = new Employee("Куприянова Елена Анатольевна", 4, 105_000);
        employee[9] = new Employee("Сперанская Ольга Анатольевна", 5, 93_000);

        printInfoEmployee();
        System.out.println("");
        System.out.println("Сумма затрат на зарплаты в месяц - "+totalBillingSalaryMonth());
        System.out.println("");
        findFullNameEmployeeMinSalary();
        System.out.println("");
        findFullNameEmployeeMaxSalary();
        System.out.println("");
        System.out.println("Среднее значение зарплат - "+averageSalary());
        System.out.println("");
        totalFullName();

    }

    public static void printInfoEmployee() {
        for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i]);
        }
    }

    public static int totalBillingSalaryMonth(){
        int sumSalary =0;
        for (int e = 0; e < employee.length; e++) {
            sumSalary=sumSalary+employee[e].getSalary();
        }
        return sumSalary;
    }

    public static void findFullNameEmployeeMinSalary() {
        int minSalary = employee[0].getSalary();
        for (int i = 0; i < employee.length; i++) {
            if (minSalary > employee[i].getSalary()) {
                minSalary = employee[i].getSalary();
            }
        }
        String fullNameEmployeeMinSalary = null;
        for (int i = 0; i < employee.length; i++) {
            if (minSalary == employee[i].getSalary()) {
                fullNameEmployeeMinSalary = employee[i].getFullName();
            }
        }
        System.out.println("ФИО сотрудника с минимальной зарплатой - " + fullNameEmployeeMinSalary);
    }

    public static void findFullNameEmployeeMaxSalary() {
        int maxSalary = employee[0].getSalary();
        for (int a = 0; a < employee.length; a++) {
            if (maxSalary < employee[a].getSalary()) {
                maxSalary = employee[a].getSalary();
            }
        }
        String fullNameEmployeeMaxSalary = null;
        for (int c = 0; c < employee.length; c++) {
            if (maxSalary == employee[c].getSalary()) {
                fullNameEmployeeMaxSalary = employee[c].getFullName();
            }
        }
        System.out.println("ФИО сотрудника с максимальной зарплатой - " + fullNameEmployeeMaxSalary);
    }

    public static double averageSalary(){
        double averageSalary = totalBillingSalaryMonth()/ employee.length;
        return averageSalary;
    }

    public static void totalFullName(){
        for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i].getFullName());
        }
    }







}