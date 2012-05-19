
interface InputDevice {
	void read();
}

interface OutputDevice {
	void write();
}

class HardDisk implements InputDevice, OutputDevice {
	public void read() {
		System.out.println("read implements in class HardDisk");
	}
	public void write() {
		System.out.println("write implements in class HardDisk");
	}
}

public class Zuoye3 {
	public static void main(String[] argv) {
		InputDevice inputDevice = new HardDisk();
		inputDevice.read();
		OutputDevice outputDevice = new HardDisk();
		outputDevice.write();
	}
}
