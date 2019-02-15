// auteur kouider fatna 13/02/2019
package dz.univbechar.mvc.model;

import java.util.ArrayList;


public interface Model {
    public ArrayList<Employee> getEnrolledEmployeeDetailsFRomModel();
    public void addEmployeetoModel(Employee em);
     public void removeEmployeeFromModel(String x);
}
