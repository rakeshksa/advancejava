package in.interview;

public class  CitizenID {
	
	final int idnum ;
	public CitizenID(int idnum) {
		this.idnum=idnum;
	}
	public final void validateID() {
		System.out.println("ID is valid and verified.");
	}
	
	public static void main(String[] args) {
		CitizenID c=new CitizenID(13);
		c.validateID();
		
	}

}
