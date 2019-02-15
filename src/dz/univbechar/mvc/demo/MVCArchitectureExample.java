/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dz.univbechar.mvc.demo;

import dz.univbechar.mvc.model.Employee;
import dz.univbechar.mvc.model.EmployeeModel;
import java.util.Scanner;

/**
 *
 * @author kouider fatna 
 */
public  class MVCArchitectureExample{

    connexion cnx=new connexion();
    MVCArchitectureExample(){}
    
    public static void main(String []args){
      
      Scanner sc=new Scanner(System.in);
       String rep;
       String nomemp;
       String idemp;
//     ArrayList<Employee> Employees = null
//      Employees =new ArrayList<Employee>();

      
      EmployeeModel z = new EmployeeModel("","");
    do{
        System.out.println("entrer nom employee"); 
        nomemp=sc.nextLine();
        System.out.println("entrer id employee"); 
        idemp=sc.nextLine();

       z.addEmployeetoModel(new Employee(nomemp,idemp));
        System.out.println("voulez vous ajouter autre employee oui/non");
         rep = sc.nextLine();
    }while(rep.equals("oui"));
    z.removeEmployeeFromModel("med");
    }
  
}

