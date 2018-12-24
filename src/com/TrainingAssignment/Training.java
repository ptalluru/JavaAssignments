/**
 * 
 * @author PrasanthKumarTalluru
 *
 */
public abstract class Training {
	protected int studentId;
	private String Subject;
	private int fee;
	static int increment=0;
	
	{
		studentId=100;
		increment++;
		studentId=studentId+increment;
	}
	/**
	 * 
	 * @param subject
	 * @param fee
	 * 
	 * 
	 */
	public Training(String subject, int fee) {
		Subject = subject;
		this.fee = fee;
	}

	public String getSubject() {
		return Subject;
	}


	public void setSubject(String subject) {
		Subject = subject;
	}


	public int getFee() {
		return fee;
	}


	public void setFee(int fee) {
		this.fee = fee;
	}

	public abstract int getOrderValue();
	
	

}
