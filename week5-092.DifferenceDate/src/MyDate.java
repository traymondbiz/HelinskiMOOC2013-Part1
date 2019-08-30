public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }
    
    public int differenceInYears(MyDate comparedDate){
        int yearDaysDiff = (this.year - comparedDate.year) * 365;
        int monthDaysDiff = (this.month - comparedDate.month) * 30;
        int daysDiff = (this.day - comparedDate.day);
        
        int yearDiff = Math.abs((yearDaysDiff + monthDaysDiff + daysDiff) / 365);
        return yearDiff;
    }

}
