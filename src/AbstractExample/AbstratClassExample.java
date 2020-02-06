package AbstractExample;

abstract class Bank {
	abstract int getRateOfInterest();
}

class SBI extends Bank {
	int getRateOfInterest() {
		return 8;
	}
}

class PNB extends Bank {
	int getRateOfInterest() {
		return 9;
	}
}

public class AbstratClassExample {
	public static void main(String[] args) {
		Bank b;
		b = new SBI();
		System.out.println("SBI Rate of Interest is: "+b.getRateOfInterest()+" %");
		b = new PNB();
		System.out.println("PNB Rate of Interest is: "+b.getRateOfInterest()+" %");
	}
}
