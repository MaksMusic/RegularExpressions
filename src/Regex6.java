public class Regex6 {
    public static void main(String[] args) {
        Employee employee1 =
                new Employee(1,"Tom","Jenitu",2000,77.7);
        Employee employee2 =
                new Employee(122,"Tomwef","Jenwefitu",20200,77.7);
        Employee employee3 =
                new Employee(117,"Tomwe","Jenitu",2000,77.7);
        Employee employee4 =
                new Employee(177,"Tom","Jenitu",2000,77.7);
        Employee employee5 =
                new Employee(17,"Tom","Jenitu",2000,77.7);

        employeeInfo(employee1);
        employeeInfo(employee2);
        employeeInfo(employee3);
        employeeInfo(employee4);
        employeeInfo(employee5);


    }

    //03 если число 1 вывод будет 001
    //- варавнивание по левой стороне и 12 символов
    //,.1f округление до 1 числа после точки

    static void employeeInfo(Employee employee){
        //String text = String.format("");//
        System.out.printf("id: %03d name:%12s surname:%12s salary: %,.1f\n" ,
                employee.id,
                employee.name,
                employee.surname,
                employee.salary*employee.bonus);
    }
}

class Employee{
    int id;
    String name;
    String surname;
    int salary;
    double bonus;

    public Employee(int id, String name, String surname, int salary, double bonus) {

        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.bonus = bonus;

    }
}
