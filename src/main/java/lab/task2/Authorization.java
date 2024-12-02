package lab.task2;

public class Authorization {
    public boolean authorize(Database db){
        db.getDataFromUser();
        return true;
    }    
}