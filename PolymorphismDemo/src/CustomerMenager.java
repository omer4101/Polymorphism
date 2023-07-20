import java.util.logging.Logger;

public class CustomerMenager {
    private BaseLogger baseLogger;
    public CustomerMenager(BaseLogger logger){
        this.baseLogger=logger;
    }
    public void add(){
        System.out.println("Customer Added.");
        this.baseLogger.logMessage("Log messsage");
    }
}
