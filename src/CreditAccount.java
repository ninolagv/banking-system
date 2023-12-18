public class CreditAccount extends Account {
    CreditAccount(int uniqueId, float balance, User owner) {
        super(uniqueId, balance, owner);
    }



    @Override
    Boolean isCreditAccount() {
        return true;
    }
}
