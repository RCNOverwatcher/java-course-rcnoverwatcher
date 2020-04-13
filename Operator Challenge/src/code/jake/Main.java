package code.jake;

public class Main {

    public static void main(String[] args) {
	double myValue = 20.00;
	double mySecondValue = 80.00;
	double myFirstTotal = (myValue + mySecondValue) * 100.00d;
	double myRemainder = (myValue % 40.00d);
	boolean isNoRemainder = (myRemainder == 0) ? true : false;
	if (!isNoRemainder) {
		System.out.println("Got some remainder");
	}








    }
}
