import java.util.*;
public interface BankingSystem {
    User addUser(String username, String firstname, String lastname, int age, boolean isBankEmployee);
    User updateUser(String username, String firstname, String lastname, Integer age, Boolean isBankEmployee);
    void removeUser(String username);
    User getUser(String username);
    int addAccountToUser(String username, double initialBalance, boolean isCreditAccount);
    Account getAccount(String username, int accountId);
    void removeAccountFromUser(String username, int accountId);
    List<Permission> getPermissionsByRole(String roleName);
    void addPermissionToRole(String roleName, String permissionName);
    void updatePermissionInRole(String roleName, String oldPermissionName, String newPermissionName);
    void removePermissionFromRole(String roleName, String permissionName);
    boolean grantUserRole(String username, String roleName);
    boolean revokeUserRole(String username, String roleName);
    boolean deposit(String username, int accountId, double amount, User performer);
    boolean withdrawFunds(String username, int accountId, double amount, User performer);
    boolean transferFunds(String sender, String receiver, int fromAccountId, int toAccountId, double amount);
}

// Implement the BankingSystem interface in BankingSystemImpl
