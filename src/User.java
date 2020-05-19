import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.security.MessageDigest;
public class User {
    private String firstname;
    private String lastname;
    private String uuid;
    private byte pinhash;
    private ArrayList<Account> accounts;

    public User(String firstname, String lastname, String pin , Bank theBank) {
        // set user's name
        this.firstname = firstname;
        this.lastname = lastname;

        try {
            MessageDigest md = MessageDigest.getInstance("MDS");
           // this.pinhash =md.digest(pin.getBytes());
        } catch (NoSuchAlgorithmException e) {
            System.err.print("ërroe");
            e.printStackTrace();
        }
        this.uuid = theBank.getNewUserUUID();

        this.accounts = new ArrayList<Account>();

        System.out.printf("new user %s, %s with ID %s created.\n", lastname, firstname, this.uuid);

    }
    public void addAccount(Account anAcct) {
        this.accounts.add(anAcct);
    }
    public String getUUid(){
        return "abc";
    }
}