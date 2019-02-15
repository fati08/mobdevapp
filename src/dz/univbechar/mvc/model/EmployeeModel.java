
package dz.univbechar.mvc.model;
import dz.univbechar.mvc.demo.connexion;
import java.sql.*;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

// auteur kouider fatna 13/02/2019
public class EmployeeModel extends Employee implements Model {
    private ArrayList<Employee> Employees=new ArrayList();
        connexion cnx=new connexion();
        Statement s;
    public EmployeeModel(String empName, String empId) {
        super(empName, empId);
    }

    
    public ArrayList<Employee> getEnrolledEmployeeDetailsFRomModel() {
  
        return Employees;
    }

   
   
    public void addEmployeetoModel(Employee em) {
    Employees.add(em);
        try {
            s=cnx.getconnexion().createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeModel.class.getName()).log(Level.SEVERE, null, ex);
        }
         String requete="insert into employees(employee)values('"+em+"')";   
 
      
    }

  
    public void removeEmployeeFromModel(String x) {
         Employees.remove(x);
         
    }
     
    
}
