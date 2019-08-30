
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    public Money plus(Money added){
        return new Money(this.euros + added.euros, this.cents + added.cents);
    }
    
    public boolean less(Money compared){
        if (this.euros > compared.euros){
            return false;
        }
        else if (this.euros == compared.euros && this.cents > compared.cents){
            return false;
        }
        else {
            return true;
        }
    }
    
    public Money minus(Money decremented){
        int newCents = (this.euros * 100) + this.cents;
        int decCents = (decremented.euros * 100) + decremented.cents;
        int resCents = newCents - decCents;
        if (resCents < 0){
            resCents = 0;
        }
        return new Money(0, resCents);
    }
    
    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

}
