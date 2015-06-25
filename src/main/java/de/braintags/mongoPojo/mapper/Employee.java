package de.braintags.mongoPojo.mapper;

import java.util.List;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Field;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Index;
import org.mongodb.morphia.annotations.Indexes;
import org.mongodb.morphia.annotations.Property;
import org.mongodb.morphia.annotations.Reference;

@Entity("employees")
@Indexes(@Index(value = "salary", fields = @Field("salary")))
public class Employee {

  @Id
  private ObjectId id;
  private String name;
  @Reference
  private Employee manager;
  @Reference
  private List<Employee> directReports;
  @Property("wage")
  private Double salary;

  public Employee(String name, Double salary) {
    this.name = name;
    this.salary = salary;
  }

}
