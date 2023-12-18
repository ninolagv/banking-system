
    class UserNotFoundException extends RuntimeException {
        public UserNotFoundException(String username) {
            super("User not found with username: " + username);
        }
    }

    class AccountNotFoundException extends RuntimeException {
        public AccountNotFoundException(int accountId) {
            super("Account not found with ID: " + accountId);
        }
    }

    class RoleNotFoundException extends RuntimeException {
        public RoleNotFoundException(String roleName) {
            super("Role not found with name: " + roleName);
        }
    }

    class PermissionNotFoundException extends RuntimeException {
        public PermissionNotFoundException(String permissionName) {
            super("Permission not found with name: " + permissionName);
        }
    }

    class OperationNotAllowedException extends RuntimeException {
        public OperationNotAllowedException(String message) {
            super(message);
        }
    }

      class DuplicateUsernameException extends RuntimeException {

        public DuplicateUsernameException(String username) {
            super("Username '" + username + "' is not unique. Please choose a different username.");
        }
    }
