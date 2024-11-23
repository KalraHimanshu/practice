package kalra.himanshu.demo.interview.guardian;

import java.util.Date;
import java.util.List;
import java.util.Objects;

public final class Employee {
    private final int empid;
    private final String empName;
    private final Date dateOfJoining;
    private final List<String> depts;

    public int getEmpid() {
        return empid;
    }

    public String getEmpName() {
        return empName;
    }

    public Date getDateOfJoining() {
        return dateOfJoining;
    }

    public List<String> getDepts() {
        return List.copyOf(this.depts);
    }

    public Employee(int empid, String empName, Date dateOfJoining, List<String> depts) {
        this.empid = empid;
        this.empName = empName;
        this.dateOfJoining = dateOfJoining;
        this.depts = depts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return empid == employee.empid;
    }

    @Override
    public int hashCode() {
        return Objects.hash(empid);
    }
}
