
public class CashRegister {

    private double cashInRegister;
    private int economicalSold;
    private int gourmetSold;

    public CashRegister() {
        this.cashInRegister = 1000.00;
    }

    public double payEconomical(double cashGiven) {
        if (cashGiven >= 2.50){
            this.cashInRegister += 2.50;
            this.economicalSold++;
            return cashGiven - 2.50;
        }
        else {
            return cashGiven;
        }
    }

    public double payGourmet(double cashGiven) {
        if (cashGiven >= 4.00){
            this.cashInRegister += 4.00;
            this.gourmetSold++;
            return cashGiven - 4.00;
        }
        else {
            return cashGiven;
        }
    }
    
    public boolean payEconomical(LyyraCard card){
        if (card.balance() >= 2.50){
            card.pay(2.50);
            this.economicalSold++;
            return true;
        }
        else {
            return false;
        }
    }
    
    public boolean payGourmet(LyyraCard card){
        if (card.balance() >= 4.00){
            card.pay(4.00);
            this.gourmetSold++;
            return true;
        }
        else {
            return false;
        }
    }

    public void loadMoneyToCard(LyyraCard card, double sum){
        if (sum >= 0.00) {
            this.cashInRegister += sum;
            card.loadMoney(sum);
        }
    }

    public String toString() {
        return "money in register " + this.cashInRegister + " economical lunches sold: " + this.economicalSold + " gourmet lunches sold: " + this.gourmetSold;
    }
}
