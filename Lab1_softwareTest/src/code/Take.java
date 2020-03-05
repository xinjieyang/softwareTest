package code;

public class Take {

	public boolean canTakeOut(int a) {
		
		if(a > 93 || a < 0)
			return false;
		else if(a % 10 == 4 || a % 10 == 9)
			return false;
		else
			return true;
	}
}
