package net.konic.corejava.emsproject;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class EmployeeMain {

	public static void main(String[] args) {
		EmployeeService service = new EmployeeService();

        // !)Add employees
        List<Employee> list = service.addEmployees();
        System.out.println("Employee List : " + list);
        
        
     // Remove duplicates
        Set<Employee> uniqueSet = service.removeDuplicateEmployees(list);
        System.out.println("Unique Employees : " + uniqueSet);
        
        
     // Sort employees
        List<Employee> sortedList = service.sortEmployees(uniqueSet);
        System.out.println("Sorted Employees : " + sortedList);

     // LinkedHashMap
        Map<Integer, Employee> linkedMap =
                service.storeInLinkedHashMap(sortedList);
        System.out.println("LinkedHashMap : " + linkedMap);
        
        // TreeMap
        Map<Integer, Employee> treeMap =
                service.storeInTreeMap(sortedList);
        System.out.println("TreeMap : " + treeMap);
        
        // Get employee by ID
        System.out.println("Employee ID 102 : " +
                service.getEmployeeById(treeMap, 102));
        
     // Remove using Iterator
        System.out.println("\nQ8 - Fail-Fast Demo:");
        System.out.println("This will throw ConcurrentModificationException");
	}
}
