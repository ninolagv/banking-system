public class DebitAccount extends Accounts{
    @Override
    Boolean isCreditAccount() {
        return false;
    }
}
