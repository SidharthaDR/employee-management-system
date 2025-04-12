public class TestConnection {
    public static void main(String[] args){
        if(DBConnection.getConnection()!=null){
            System.out.println("Connected to Database Successfully");
        }
        else{
            System.out.println("Failed to Connect.");
        }
    }
}
