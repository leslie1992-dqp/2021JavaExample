public class ParamTest {
    public static void main(String[] args){
        System.out.println("Testing tripleValue:");
        double percent=10;
        System.out.println("Before:percent:"+percent);
        triValuepercent(percent);
        System.out.println("After:percent:"+percent);

        System.out.println("\nTesting tripleSalary:");
        var harry=new Employee("Harry",50000,2020,10,15);
        System.out.println("Berore:Salary:"+harry.getSalary());
        tripleSalary(harry);
        System.out.println("After:Salary"+harry.getSalary());

        System.out.println("\nTesting swap:");
        var a=new Employee("Alice",30000,2020,10,15);
        var b=new Employee("Bob",70000,2020,10,15);
        swap(a,b);
        System.out.println("After:a="+a.getName());
        System.out.println("After:b="+b.getName());
    }
    public static void triValuepercent(double x){
        x=x*3;
        System.out.println("End of method:x="+x);
    }
    public static void tripleSalary(Employee x){
        x.raiseSalary(200);
        System.out.println("End of method:salary"+x.getSalary());
    }
    public void swap(Employee x,Employee y){
        Employee temp=x;
        x=y;
        y=temp;
        System.out.println("End of method:x="+x.getName());
        System.out.println("End of method:y="+y.getName());
    }
}
