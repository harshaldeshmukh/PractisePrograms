import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class ExceDemo {
    static class Employee{
        int id;
        String name;

        public Employee(int id, String name) {

            this.id = id;
            this.name = name;
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
    }

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("B");
        list.add("A");
        list.add("D");

        System.out.println("Before Sorting: "  + list.stream().toList());
        System.out.println("After Sorting : "+list.stream().sorted().collect(Collectors.toList()));

        Employee em1=new Employee(1,"Hd");
        Employee em2=new Employee(2,"Hd1");
        Employee em3=new Employee(3,"Hd2");


        ArrayList<Employee> empList= new ArrayList<>();
        empList.add(em1);
        empList.add(em2);
        empList.add(em3);



        List<String> name= empList.stream().map(Employee::getName).collect(Collectors.toList());
        System.out.println(name);

    }
}
