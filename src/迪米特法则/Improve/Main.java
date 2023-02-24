package 迪米特法则.Improve;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.print("使用迪米特法则的改进：");
        SchoolManager schoolManager = new SchoolManager();
        schoolManager.printAllEmployee(new CollegeManager());
    }
}


class Employee {
    private String id;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return this.id;
    }
}

// 学院员工类
class CollegeEmployee {
    private String id;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return this.id;
    }
}

// 管理学院员工的管理类
class CollegeManager {
    public List<CollegeEmployee> getAllEmployee() {
        List<CollegeEmployee> list = new ArrayList<CollegeEmployee>();
        for (int i = 0; i < 10; i++) {
            CollegeEmployee emp = new CollegeEmployee();
            emp.setId("学院员工id= " + i);
            list.add(emp);
        }
        return list;
    }

    public void printAllEmployee(){
        List<CollegeEmployee> list1 = this.getAllEmployee();
        System.out.println("-----分公司员工-----");
        for (CollegeEmployee e :
                list1) {
            System.out.println(e.getId());
        }
    }
}

// 学校的管理类
// 分析SchoolManager类的直接朋友类有哪些? Employee, CollegeManager
// CollegeEmployee 不是直接朋友（陌生类以局部变量的形式出现在类的内部）， 这样违背了迪米特法则
class SchoolManager {
    public List<Employee> getAllEmployee() {
        List<Employee> list = new ArrayList<Employee>();
        for (int i = 0; i < 5; i++) {
            Employee emp = new Employee();
            emp.setId("学院总部员工id= " + i);
            list.add(emp);
        }
        return list;
    }

    void printAllEmployee(CollegeManager sub) {

        // 分析问题
        // 1. 将输出学院的员工的方法封装到CollegeManager中
        sub.printAllEmployee();


        List<Employee> list2 = this.getAllEmployee();
        System.out.println("-----总公司员工-----");
        for (Employee e :
                list2) {
            System.out.println(e.getId());
        }
    }
}

