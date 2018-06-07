
public class firstSound extends Thread {
	private int x;
	MakeSound note = new MakeSound();

	public void run() {
		if (x == 1)
			note.playSound("C:\\Users\\s-jeeb\\Music\\c.wav");
		if (x == 2)
			note.playSound("C:\\Users\\s-jeeb\\Music\\d.wav");
		if (x == 3)
			note.playSound("C:\\Users\\s-jeeb\\Music\\e.wav");
		if (x == 4)
			note.playSound("C:\\Users\\s-jeeb\\Music\\f.wav");
		if (x == 5)
			note.playSound("C:\\Users\\s-jeeb\\Music\\g.wav");
		if (x == 6)
			note.playSound("C:\\Users\\s-jeeb\\Music\\a.wav");
		if (x == 7)
			note.playSound("C:\\Users\\s-jeeb\\Music\\b.wav");
		if (x == 8)
			note.playSound("C:\\Users\\s-jeeb\\Music\\c5.wav");
		if (x == 9)
			note.playSound("C:\\Users\\s-jeeb\\Music\\dFlat.wav");
		if (x == 10)
			note.playSound("C:\\Users\\s-jeeb\\Music\\eFlat.wav");
		if (x == 11)
			note.playSound("C:\\Users\\s-jeeb\\Music\\gFlat.wav");
		if (x == 12)
			note.playSound("C:\\Users\\s-jeeb\\Music\\aFlat.wav");
		if (x == 13)
			note.playSound("C:\\Users\\s-jeeb\\Music\\bFlat.wav");

	}

	public firstSound(int x) {
		this.x = x;
	}

}
