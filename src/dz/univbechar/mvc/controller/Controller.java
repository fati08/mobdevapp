
package dz.univbechar.mvc.controller;

import dz.univbechar.mvc.model.Employee;
// auteur kouider fatna 13/02/2019

public interface Controller {
    public void displayEnrolledEmployees();
    public void addEmployee(Employee em);
     public void removeEmployee(String x);
    
}
