import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class BankingSystemImpl implements BankingSystem {
 private List<User> users;
 private static int uniqueAccountId = 1;
 private List<Role> roles;
 private Set<Permission> permissions;
 private Map<User, List<Role>> userRolesMap;

 public BankingSystemImpl() {
  this.users = new ArrayList<>();
  this.roles = new ArrayList<>();
  this.permissions = new HashSet<>();
  this.userRolesMap = new HashMap<>();
 }


 @Override
 public User addUser(String username, String firstname, String lastname, int age, boolean isBankEmployee) {
  if (isUsernameUnique(username)) {
   User newUser = new User(username, firstname, lastname, age, isBankEmployee);
   users.add(newUser);
   return newUser;
  } else {
   throw new DuplicateUsernameException(username);
  }
 }
 private boolean isUsernameUnique(String username) {
  return users.stream().noneMatch(user -> user.getUsername().equals(username));
 }

 @Override
 public User updateUser(String username, String firstname, String lastname, Integer age, Boolean isBankEmployee) {
  return null;
 }

 @Override
 public void removeUser(String username) {

 }

 @Override
 public User getUser(String username) {
  return null;
 }

 @Override
 public int addAccountToUser(String username, double initialBalance, boolean isCreditAccount) {
  return 0;
 }

 @Override
 public Account getAccount(String username, int accountId) {
  return null;
 }

 @Override
 public void removeAccountFromUser(String username, int accountId) {

 }

 @Override
 public List<Permission> getPermissionsByRole(String roleName) {
  return null;
 }

 @Override
 public void addPermissionToRole(String roleName, String permissionName) {

 }

 @Override
 public void updatePermissionInRole(String roleName, String oldPermissionName, String newPermissionName) {

 }

 @Override
 public void removePermissionFromRole(String roleName, String permissionName) {

 }

 @Override
 public boolean grantUserRole(String username, String roleName) {
  return false;
 }

 @Override
 public boolean revokeUserRole(String username, String roleName) {
  return false;
 }

 @Override
 public boolean deposit(String username, int accountId, double amount, User performer) {
  return false;
 }

 @Override
 public boolean withdrawFunds(String username, int accountId, double amount, User performer) {
  return false;
 }

 @Override
 public boolean transferFunds(String sender, String receiver, int fromAccountId, int toAccountId, double amount) {
  return false;
 }
}
