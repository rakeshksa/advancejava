package in.interview;


abstract class  Appliance{
	abstract void turnOn();
	abstract  void turnOff();
	void plugin() {
		System.out.println("appliance is pluged in");
	}
}
class Fan extends Appliance{
	@Override
	void turnOn() {
		System.out.println("fan is roatating");
	}

	@Override
	void turnOff() {
		System.out.println("fan is stop");
		
		
	}
}
class WashingMachine extends Appliance{
	@Override
	void turnOn() {
		System.out.println("washing machine started");
	}
	void turnOff() {
		System.out.println("washing machine stopped");
		
	}
}

public class userElectronic {

	public static void main(String[] args) {
		Fan f1 = new Fan();
		f1.plugin();
		f1.turnOn();
		f1.turnOff();
		WashingMachine w1 = new WashingMachine();
		w1.plugin();
		w1.turnOn();
		w1.turnOff();

	}

}
