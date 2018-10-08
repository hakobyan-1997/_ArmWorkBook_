package oop.aggregation;

import java.util.*;

class Employee{
  String firstName;
  String lastName;
  int empId;
  String role;
  public Employee(String fName, String lName, int empId, String role){
    this.firstName = fName;
    this.lastName = lName;
    this.empId = empId;
    this.role = role;
  }
}

class EmpRole{
  String name;
  private List<Employee> empList;
  EmpRole(String name,List<Employee> empList){
    this.name = name;
    this.empList = empList;
  }
  public List<Employee> getEmpList(){
    return empList;
  }
}

class Company{
  String name;
  private List<EmpRole> roleList;
  public Company(String name,List<EmpRole> roleList){
    this.name = name;
    this.roleList = roleList;
  }
  public int getTotalEmployeeCount(){
    int count = 0;
    List<Employee> empList;
    for(EmpRole empRole : roleList){
      empList = empRole.getEmpList();
      for(Employee e : empList){
        count++;
      }
    }
    return count;
  }
}

class Aggregation{
  public static void main(String[] args){
    Employee e1 = new Employee("Shamlikhan","CP",1214,"Trainee");
    Employee e2 = new Employee("Amal","Karayi",1215,"Trainee");
    Employee e3 = new Employee("Lixo","George",214,"PM");
    Employee e4 = new Employee("Rony","Cherian",714,"Developer");
    Employee e5 = new Employee("Nithin","Govind",1218,"QA");

    List<Employee> empTR = new ArrayList<Employee>();
    empTR.add(e1);
    empTR.add(e2);

    List<Employee> empPM = new ArrayList<Employee>();
    empPM.add(e3);

    List<Employee> empDV = new ArrayList<Employee>();
    empDV.add(e4);

    List<Employee> empQA = new ArrayList<Employee>();
    empQA.add(e5);

    EmpRole TR = new EmpRole("Trainee",empTR);
    EmpRole PM = new EmpRole("ProjectManager",empPM);
    EmpRole QA = new EmpRole("QualityAssurance",empQA);
    EmpRole DV = new EmpRole("Developer",empDV);

    List<EmpRole> koratty = new ArrayList<EmpRole>();
    koratty.add(TR);
    koratty.add(PM);
    koratty.add(QA);
    koratty.add(DV);

    Company qb = new Company("QBurst",koratty);

    System.out.print("Total number of employees in "+qb.name+" is: ");
    System.out.print(qb.getTotalEmployeeCount()+"\n");
  }
}
