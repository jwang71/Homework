import java.util.Random;

/**
 * @author 77
 *
 */
public class MonteCarloSimulation {
	private final static double INFLATION = 0.035;

	public MonteCarloSimulation() {		
	}
	
	//To calculate a total value for one year based on 
	//the initial value at the beginning of the year, return and standard deviation
	private double getNextYear(double base, double mean, double sd) {
		Random random = new Random();
		double myNextGaussian = (random.nextGaussian()*sd+mean)/100;
		double nextYear = (base*(1 + myNextGaussian))/(1+INFLATION);
		return nextYear;
	}

	//To calculate a total portfolio value after given numberOfYear.
	public double runMultiYears(int numberOfYear, double base, double mean, double sd) {
		double curYear = base;
		double nextYear = 1.0;
	
		for (int i = 0; i < numberOfYear; i++) {
			nextYear = getNextYear(curYear, mean, sd);
			curYear = nextYear;
		}
		return curYear;
	}
}
