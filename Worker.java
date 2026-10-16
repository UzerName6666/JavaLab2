public class Worker {
    String FullName;
    Department department;

    public String toString(){
        String sout = this.FullName;
        if(department == null) {
            return sout + ", сотрудник без отдела";    
        }
        if(department.getLeader() == this){
            return sout + " начальник отдела " + department.departmentName;
        }
        if(department.getLeader() == null){
            return sout + ", сотрудник отдела без начальника";
        }
        return sout + ", сотрудник отдела " + department.departmentName + ", начальник которого " + department.getLeader().FullName;
    }

    public Worker(String Name) {
        this.FullName = Name;
    }

    public void setDepartment(Department dep){
        if(dep == this.department){
            return;
        }
        if(this.department != null){
            if(this.department != null){
                this.department.workers.remove(this);
            }
            if(this.department.getLeader() == this){
                this.department.setLeader(null);
            }
        }
        this.department = dep;
    }
    
}
