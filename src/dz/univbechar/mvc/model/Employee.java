
package dz.univbechar.mvc.model;

// auteur kouider fatna 13/02/2019
public class Employee {
 private String empName;
  private String empId;
   public String getEmpName (){return this.empName;}
   public String getEmpId (){return this.empId;}
   
     public Employee(String empName,String empId){
          this.empName =empName;
          this.empId=empId;
    }
    public String toString (){
    return null;
    }
    public boolean equals(Object o){
    return false;
    }
}
