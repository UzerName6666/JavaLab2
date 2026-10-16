
import java.util.Vector;

public class Department {
    String departmentName;
    private int leader = -1;
    private Vector<Worker> workers = new Vector<Worker>();

    public Department(String name) {
        this.departmentName = name;
    }

    public void addWorker(Worker worker){
        
        worker.setDepartment(this);
        if(!workers.contains(worker)){
            workers.add(worker);
        }
        
    }

    public void removeWorker(Worker worker){
        this.workers.remove(worker);
    }

    public void setLeader(Worker newLeader){
        if (newLeader == null){
            this.leader = -1;
            return;
        }
        addWorker(newLeader);
        this.leader = workers.indexOf(newLeader);
    }

    public Worker getLeader(){
        if(leader == -1){
            return null;
        }
        return workers.elementAt(leader);
    }

    public String toString(){
        String sout = this.departmentName + ", Начальник: ";
        if (leader == -1) {
            sout += "отсутствует";
        }
        else{
            sout += workers.elementAt(leader).FullName;
        }
        sout += "\nУчастники:";
        for(int i = 0; i < workers.size(); i++){
            if(i != leader){
                sout += "\n" + workers.elementAt(i).FullName;
            }
        }
        return sout;
    }

    
}
