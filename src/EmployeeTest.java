import java.time.LocalDate;

public class EmployeeTest {
    public static void main(String[] args){
        Employee[] staff=new Employee[3];

        staff[0] =new Employee("小明",1000,2021,3,21);
        staff[1] =new Employee("小红",1000,2021,3,23);
        staff[2] =new Employee("小钟",1000,2021,3,23);

        for (Employee e:staff)
            e.raiseSalary(5);
        for(Employee e:staff){
            e.setId();
            System.out.println("name="+e.getName()+",salary="+e.getSalary()+",time is"+e.getTime());
        }
        int n=Employee.getNextId();
        System.out.println("Next Id is"+n);
    }
}

class Employee{
   private  static int nextId=1;
    private int id;
    private String name;
    private double salary;
    private LocalDate time;
/*构造器与类名相同
  每个类可以有多个构造器
  构造器没有返回值
  总是和new操作符一起调用
  不能在构造器中申明有实例字段相同的局部变量
 */
    public Employee(String n,double s,int year,int month,int day){
        name=n;
        salary=s;
        time=LocalDate.of(year,month,day);
    }
    //访问器方法
    public String getName(){
        return name;
    }
    public double  getSalary(){
        return salary;
    }
    public LocalDate getTime(){
        return time;
    }
    public int getId(){
        return id;
    }
    public void setId(){
        id=nextId;
        nextId++;

    }
    public static int getNextId(){
        return nextId;
    }

    public void raiseSalary(double raisepercent){
        double raise=this.salary*raisepercent/100;
        this.salary+=raise;
    }
    public static void main(String[] args){
        var e=new Employee("Harry",500000,2020,3,21);
        System.out.println(e.getName()+" "+e.getSalary());
    }
}
