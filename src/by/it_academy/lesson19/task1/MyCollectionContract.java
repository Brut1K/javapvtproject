package by.it_academy.lesson19.task1;

public interface MyCollectionContract<Department,Staff> {
    //для директора
    void setDirector(Staff director);
    Staff getDirector();
    void removeDirector();
    //для отдела
    void addDepartment(Department department);
    void removeDepartment(Department department);
    //для сотрудников
    void addStaff(Staff staff, Department department);
    void removeStaff(Staff staff, Department department);
    void moveStaff(Staff staff, Department department,Department departmentIN);



}
