public class OddEvenChecker {
    public String checking(int n){
        if ( n < 0)
            throw new IllegalArgumentException("Numbers below 0 are not allowed");
        if(n%2==0)
            return "Even number";
        else
            return "Odd number";
    }

}
