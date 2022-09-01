import java.sql.Connection;
import java.sql.DriverManager;

public class test {
    public static void main(String args[]) {
        Connection c = null;
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager
                    .getConnection("ec2-44-207-126-176.compute-1.amazonaws.com",
                            "atrpxisswgozlh", "2f1feb8787b81bc98c5dbf3cb40044c014734c648ce3e6d455da7290ce9d6072");
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        System.out.println("Opened database successfully");
    }
}