package list;

public class EmployeeNode {

    private Employee employee;
    private EmployeeNode next;

    /**
     * For doubly linked list.
     */
    private EmployeeNode previous;

    public EmployeeNode(Employee employee) {
        this.employee = employee;
    }

    public void setPrevious(EmployeeNode previous) {
        this.previous = previous;
    }

    public EmployeeNode getPrevious() {
        return previous;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public EmployeeNode getNext() {
        return next;
    }

    public void setNext(EmployeeNode next) {
        this.next = next;
    }

    @Override
    public String  toString() {
      return employee.toString();
    }
}
