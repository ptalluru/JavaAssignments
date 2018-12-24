
public class corporateTraining extends Training {
	private int noOfDays;
	/**
	 * 
	 * @param subject
	 * @param fee
	 */
	public corporateTraining(String subject, int fee,int noOfDays) {
		super(subject, fee);
		this.noOfDays=noOfDays;
	}

	@Override
	public int getOrderValue() {
		int trainingCharges = noOfDays * getFee();
		return trainingCharges;
		
		
	}

}
