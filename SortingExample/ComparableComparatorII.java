import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee implements Comparable<Employee>  {
    private String lastName;
    private String firstName;
    private String empId;
    private int age;
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getEmpId() {
        return empId;
    }
    public void setEmpId(String empId) {
        this.empId = empId;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    
    @Override
    public String toString() {
        
        return getFirstName() + " " + getLastName() + " " + getAge() + " " + getEmpId();
    }
    @Override
    public int compareTo(Employee o) {
        int firstCmp = this.getFirstName().compareTo(o.getFirstName());
        return firstCmp != 0 ? firstCmp :  this.getLastName().compareTo(o.getLastName());
    }
}
class MyComparator implements Comparator<Employee>{
    @Override
    public int compare(Employee o1, Employee o2) {
        int firstCmp = o1.getFirstName().compareTo(o2.getFirstName());
        if(firstCmp == 0){
            int lastCmp = o1.getLastName().compareTo(o2.getLastName());
            if(lastCmp == 0){
                return (o2.getAge() < o1.getAge() ? -1 :
                       (o2.getAge() == o1.getAge() ? 0 : 1));
            }else{
                return lastCmp;
            }
            
        }else{
            return firstCmp;
        }        
    }    
}
class ComparableComparatorII {
    public static void main(String[] args) {
        List<Employee> empList = new ArrayList<Employee>();
        // Storing elements in the arraylist
        empList.add(getData("E001", "Mishra", "Pyaremohan", 35));
        empList.add(getData("E002", "Smith", "John", 45));
        empList.add(getData("E003", "Sharma", "Ram", 23));
        empList.add(getData("E004", "Mishra", "Pyaremohan", 60));
        empList.add(getData("E005", "Caroll", "Eva", 32));
        empList.add(getData("E003", "Tiwari", "Ram", 23));
        
        System.out.println("Original List");
        for(Employee emp : empList){
            System.out.println("" + emp);
        }
        // Sorting the list
        Collections.sort(empList);
        
        System.out.println("Sorted List");
        for(Employee emp : empList){
            System.out.println("" + emp);
        }    
    }
                
    // Stub method 
    private static Employee getData(String empId, String lastName, String firstName, int age){
        Employee employee = new Employee();
        employee.setEmpId(empId);
        employee.setLastName(lastName);
        employee.setFirstName(firstName);
        employee.setAge(age);
        return employee;
    }    
}