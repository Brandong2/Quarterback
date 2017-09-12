package Football;

public class Quarterback
{
	private int touchdowns; //TD
	private int yards; //YRDS
	private int interceptions; //INT
	private int passes_attempted; //ATT
	private int completions; //comp
	
	private double rating;
	
	private void calc_rating(){
		double a = 5*(((1.0*completions)/passes_attempted) - 0.3);
		
		double b = (0.25)*(((1.0*yards)/passes_attempted) - 0.3);
		
		double c = (20.0*touchdowns)/passes_attempted;
		
		double d = (2.375) - ((25.0*interceptions)/passes_attempted);
		
		rating = (100.0/6)*(fix(a) + fix(b) + fix(c) + fix(d));
	}
	
	private double fix(double value){
		if (value < 0){
			return 0;
		}
		else if (value > 2.375){
			return 2.375;
		}
		else {
			return value;
		}
	}
	
	public double getRating() {
		return rating;
	}
	
	public Quarterback(int TD, int YD, int INT, int ATT, int COM) {
		touchdowns = TD;
		yards = YD;
		interceptions = INT;
		passes_attempted = ATT;
		completions = COM;
		
		calc_rating();
	}
}