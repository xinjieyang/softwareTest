package code;

public class Take {

	public boolean canTakeOut(int a) {
		if(a >= 50)
			a = a - 50;
		if(a >= 20)
			a = a - 20;
		if(a >= 10)
			a = a - 10;
		if(a >= 5)
			a = a - 5;
		if(a >= 5)
			a = a - 5;
		if(a > 3 || a < 0)
			return false;
		else
			return true;
	}
}
