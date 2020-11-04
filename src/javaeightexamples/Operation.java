package javaeightexamples;

public interface Operation {

	public int operation(int x);
	
	public default int sum(int x, int y) {
		return x+y;
	}
}
