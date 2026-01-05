package net.konic.corejava.emsproject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class EmployeeService {
	// Q1: Add employees (with duplicate)
    public List<Employee> addEmployees() {

        List<Employee> list = new ArrayList<>();

        list.add(new Employee(101, "Ayaan", "IT"));
        list.add(new Employee(102, "Rahim", "HR"));
        list.add(new Employee(103, "Sara", "Finance"));
        list.add(new Employee(104, "Zoya", "Admin"));
        list.add(new Employee(101, "Ayaan", "IT")); // duplicate

        return list;
    }

    // Q2: Remove duplicates
    public Set<Employee> removeDuplicateEmployees(List<Employee> list) {
        return new HashSet<>(list);
    }

    // Q3: Sort employees
    public List<Employee> sortEmployees(Set<Employee> set) {
        List<Employee> list = new ArrayList<>(set);
        Collections.sort(list);
        return list;
    }

    // Q4: Store in LinkedHashMap (insertion order)
    public Map<Integer, Employee> storeInLinkedHashMap(List<Employee> list) {

        Map<Integer, Employee> map = new LinkedHashMap<>();

        for (Employee e : list) {
            map.put(e.getId(), e);
        }
        return map;
    }

    // Q5: Store in TreeMap (sorted by key)
    public Map<Integer, Employee> storeInTreeMap(List<Employee> list) {

        Map<Integer, Employee> map = new TreeMap<>();

        for (Employee e : list) {
            map.put(e.getId(), e);
        }
        return map;
    }

    // Q6: Get employee by ID
    public Employee getEmployeeById(Map<Integer, Employee> map, int id) {
        return map.get(id);
    }

    // Q7: Safe removal using Iterator
    public void removeEmployeeSafely(List<Employee> list, int id) {

        Iterator<Employee> itr = list.iterator();

        while (itr.hasNext()) {
            Employee e = itr.next();
            if (e.getId() == id) {
                itr.remove(); 
            }
        }
    }
	
    // Q8: FAIL-FAST demo
    // This code throws ConcurrentModificationException
    public void removeEmployeeFailFast(List<Employee> list, int id) {

        for (Employee e : list) {     
            if (e.getId() == id) {
                list.remove(e);       // ❌ FAIL-FAST
            }
        }
    }
}
