import java.util.ArrayList;
import java.util.Optional;

class Employee{
   private int id;
    private String name;
    private String gender;
    private int Salary;
    private int age;

    public Employee(){
    }

    public Employee(int id, String name, String gender, int salary, int age) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        Salary = salary;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class IG {

    public static void main(String[] args) {

        Employee emp = new Employee(1,"Harshal","M",1000,26);
        Employee emp1 = new Employee(1,"Test","F",1000,25);
        Employee emp2 = new Employee(1,"Test1","M",1000,24);

        ArrayList<Employee> arrayList = new ArrayList<>();

        arrayList.add(emp);
        arrayList.add(emp1);
        arrayList.add(emp2);


        long maleCount=arrayList.stream().filter(emps->emp.getGender().equalsIgnoreCase("M")).count();
        System.out.println(maleCount);


        System.out.println( arrayList.stream().sorted((e1,e2)->e1.getAge()-e2.getAge()).findFirst().toString());
      Optional<Employee> emps=  arrayList.stream().sorted((e1, e2)->e1.getAge()-e2.getAge()).findFirst();
        emps.get();
        System.out.println(emps.get().getAge());

    }


}
