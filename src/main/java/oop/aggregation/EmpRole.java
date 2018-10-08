package oop.aggregation;

import java.util.List;

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