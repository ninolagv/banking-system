import java.util.List;


public class User {
    private String username;
    private String firstName;
    private String lastName;
    private int age;
    private boolean isBankEmployee;
    private List<Account> accounts;
    private List<Role> roles;

    User(String username, String firstname, String lastname, int age, boolean isBankEmployee){

    }

    public String getUsername() {
        return username;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBankEmployee(boolean bankEmployee) {
        isBankEmployee = bankEmployee;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }
}
