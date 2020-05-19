import com.junu.funproject.Proj;

public class TempClassToBeDeleted {

    public static void main(String args[]) {
        Bank bank = new Bank();
        User user = new User("firstname", "lastname", "pin", bank);
        Account account = new Account("junu", user, bank );
        
    }
}
