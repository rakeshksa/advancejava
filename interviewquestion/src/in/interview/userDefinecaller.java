package in.interview;

class CallHandler{
		void handleCall(){
			
			}
		static void logCall() {
			System.out.println("Call log saved.");
		}
}

class TechSupport extends CallHandler{
	@Override
	void handleCall() {
		System.out.println("call handel by tech support");
	}
	void  solveTechIssue() {
		System.out.println("solving technical issue");
	}
	
}
class BillingSupport extends CallHandler{
	@Override
	void handleCall() {
		System.out.println("Call handled by Billing Support");
	}
	void  solveBillingIssue() {
		System.out.println("Solving billing issue...");
	}
	
}


public class userDefinecaller {

	public static void main(String[] args) {
		CallHandler c1=new TechSupport();
		c1.handleCall();
		if(c1 instanceof TechSupport) {
			((TechSupport) c1).solveTechIssue();
		}
		CallHandler c2=new BillingSupport();
		c2.handleCall();
		if(c2 instanceof BillingSupport) {
			((BillingSupport)c2).solveBillingIssue();
		}
		CallHandler.logCall();

	}

}
