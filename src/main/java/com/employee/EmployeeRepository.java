package com.employee;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepository {
    private final Map<Integer, Employee> employees = new ConcurrentHashMap<>();

    public Collection<Employee> findAll() {
        return employees.values();
    }

    public Employee findById(int id) {
        return employees.get(id);
    }

    public Employee save(Employee employee) {
        employees.put(employee.getId(), employee);
        return employee;
    }

    public void deleteById(int id) {
        employees.remove(id);
    }
}
