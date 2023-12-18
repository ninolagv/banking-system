public  abstract class Account {
    int uniqueId;
    float balance;
    User owner;

    abstract Boolean isCreditAccount();

    Account(int uniqueId,float balance, User owner){
        uniqueId = this.uniqueId;
        balance = this.balance;
        owner = this.owner;
    }

    public int getAccountId() {
        return uniqueId;
    }

    public double getBalance() {
        return balance;
    }

    public User getOwner() {
        return owner;
    }

    public void setUniqueId(int uniqueId) {
        this.uniqueId = uniqueId;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }
}
