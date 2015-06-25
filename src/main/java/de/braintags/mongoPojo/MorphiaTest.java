package de.braintags.mongoPojo;

import java.util.List;

import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;
import org.mongodb.morphia.query.Query;

import com.mongodb.MongoClient;

import de.braintags.mongoPojo.mapper.Employee;

/**
 * <br>
 * <br>
 * Copyright: Copyright (c) 25.06.2015 <br>
 * Company: Braintags GmbH <br>
 * 
 * @author mremme
 * 
 */

public class MorphiaTest {

  /**
   * 
   */
  public MorphiaTest() {
  }

  /**
   * @param args
   */
  public static void main(String[] args) {
    final Morphia morphia = new Morphia();

    // tell Morphia where to find your classes
    // can be called multiple times with different packages or classes
    morphia.mapPackage("de.braintags.mongoPojo.mapper");

    // create the Datastore connecting to the default port on the local host
    final Datastore datastore = morphia.createDatastore(new MongoClient(), "morphia_example");
    datastore.ensureIndexes();

    final Employee elmer = new Employee("Elmer Fudd", 50000.0);
    datastore.save(elmer);

    final Employee daffy = new Employee("Daffy Duck", 40000.0);
    datastore.save(daffy);

    final Employee pepe = new Employee("Pepé Le Pew", 25000.0);
    datastore.save(pepe);

    elmer.getDirectReports().add(daffy);
    elmer.getDirectReports().add(pepe);

    datastore.save(elmer);

    final Query<Employee> query = datastore.createQuery(Employee.class);
    final List<Employee> employees = query.asList();

    System.out.println("found " + employees.size());

  }

}
