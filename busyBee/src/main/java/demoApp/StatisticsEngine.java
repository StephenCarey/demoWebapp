package demoApp;

public class StatisticsEngine {

	private int chanceOfFailure = 50;
	
	
	public int changeOfDemoFailing(int sizeOfAudiance ){
		
		int currentChanceOfFailure = chanceOfFailure * sizeOfAudiance;
		
		return currentChanceOfFailure;
		
	}
	
}
