public class Main {
    public static void main(String[] args) {
EmailLogger emailLogger=new EmailLogger();
emailLogger.logMessage("Log message");
BaseLogger baseLogger=new BaseLogger();
baseLogger.logMessage("Log message");
System.out.println("------------------------");
BaseLogger[] Loggers =new BaseLogger[]{new EmailLogger(),new DatabaseLogger(),new FileLogger(),new ConsoleLogger()};
    for (BaseLogger Logger:Loggers){
        Logger.logMessage("Log messageg");
    }
    System.out.println("------------------------");
    CustomerMenager customerMenager=new CustomerMenager(new EmailLogger());
    customerMenager.add();
    }
}