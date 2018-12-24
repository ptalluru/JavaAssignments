
public class PublicTraining extends Training {

	private int noOfParticipants;
	/**
	 * 
	 * @param subject
	 * @param fee
	 * 
	 */
	public PublicTraining(String subject, int fee,int noOfParticipants) {
		super(subject, fee);
		this.noOfParticipants = noOfParticipants;
	}

	@Override
	public int getOrderValue() {
		int trainingCharges = noOfParticipants * getFee();
		return trainingCharges;
		
		
	}

}
