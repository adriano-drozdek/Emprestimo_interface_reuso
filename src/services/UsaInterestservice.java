package services;

public class UsaInterestservice implements InterestService {

	private double interestRate;

	public UsaInterestservice(double interestRate) {
		this.interestRate = interestRate;
	}

	@Override
	public double getInterestRate() {
		return interestRate;
	}
}
