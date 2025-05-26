package in.interview;

class vehicle{
	void start() {
		System.out.println("vehicle started");
	}
	
}

class car extends vehicle{
	
	void playmusic() {
		System.out.println("Music system is playing ");
	}
}
class bike extends vehicle{
	
	void kickstart() {
		System.out.println("in bike you have to kick and start");
	}
}



public class Userdemo {

	public static void main(String[] args) {
		vehicle v=new bike();
		v.start();
		if(v instanceof bike) {
			bike b=(bike)v;
			b.kickstart();
		}
		vehicle v1=new car();
		v1.start();
		if(v1 instanceof car) {
			((car) v1).playmusic();
		}

	}

}
