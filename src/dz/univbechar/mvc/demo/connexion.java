package dz.univbechar.mvc.demo;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kouider fatna
 */
public class connexion {
    String urlpilote="com.mysql.cj.jdbc.Driver";
  String urlbase="jdbc:mysql://localhost:3306/employee?useTimezone=true&serverTimezone=UTC";
  Connection cnx;
 public connexion(){
     try {
         Class.forName(urlpilote);
     } catch (ClassNotFoundException ex) {
         Logger.getLogger(connexion.class.getName()).log(Level.SEVERE, null, ex);
     }
     try {
      cnx=DriverManager.getConnection(urlbase,"root","");

     } catch (SQLException ex) {
         Logger.getLogger(connexion.class.getName()).log(Level.SEVERE, null, ex);
     }
 }
 public Connection getconnexion(){return cnx;
}
}
