package by.it_academy.lesson19.task1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyCollectionssss<Department,Staff> implements MyCollectionContract<Department,Staff> {
    private Staff director;
    private Map<Department,List<Staff>> department = new HashMap<>();


    @Override
    public void setDirector(Staff director) {
        this.director = director;
    }

    @Override
    public Staff getDirector() {
        return director;
    }

    @Override
    public void removeDirector() {
        director = null;
    }

    @Override
    public void addDepartment(Department o) {
        department.put(o,new ArrayList<>());
    }

    @Override
    public void removeDepartment(Department department) {
        department = null;
    }

    @Override
    public void addStaff(Staff staff, Department department) {
        this.department.get(department).add(staff);
    }

    @Override
    public void removeStaff(Staff staff, Department department) {
        this.department.get(department).remove(staff);
    }

    @Override
    public void moveStaff(Staff staff, Department department, Department departmentIN) {
        this.department.get(department).remove(staff);
        this.department.get(departmentIN).add(staff);
    }

    @Override
    public String toString() {
        return "MyCollectionssss{" +
                "director=" + director +
                ", department=" + department +
                '}';
    }
}
