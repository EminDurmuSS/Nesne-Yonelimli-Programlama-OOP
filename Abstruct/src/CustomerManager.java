public class CustomerManager {
   public BaseDataManager databaseManager;

    public void getCustomers(){
        //OracleDatabaseManager oracleDatabaseManager = new OracleDatabaseManager();
        //oracleDatabaseManager.getData();
        databaseManager.getData();
    }
}
