public class DebitAccount extends Account{

    DebitAccount(int uniqueId, float balance, User owner) {
        super(uniqueId, balance, owner);
    }

    @Override
    Boolean isCreditAccount() {
        return false;
    }
}
