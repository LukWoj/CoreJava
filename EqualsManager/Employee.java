package equals;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Objects;

public class Employee
{
   private String name;
   private double salary;
   private Date hireDay;

   public Employee(String n, double s, int year, int month, int day)
   {
      name = n;
      salary = s;
      GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);
      hireDay = calendar.getTime();
   }

   public String getName()
   {
      return name;
   }

   public double getSalary()
   {
      return salary;
   }

   public Date getHireDay()
   {
      return hireDay;
   }

   public void raiseSalary(double byPercent)
   {
      double raise = salary * byPercent / 100;
      salary += raise;
   }

   public boolean equals(Object otherObject) {
	   if (this == otherObject) return true;
	   if (otherObject == null) return true;
	   if (getClass() != otherObject.getClass()) return false; // if(!(otherObject instanceof ClassName)) return false;
	   
	   Employee other = (Employee) otherObject;
	   
	   return name.equals(other.name) && salary == other.salary && hireDay.equals(other.hireDay);
	   
   }
   
   }

