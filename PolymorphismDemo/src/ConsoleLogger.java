public class ConsoleLogger extends BaseLogger{
    public void logMessage(String message){
        System.out.println("Logged to Console:"+message);
    }
}
