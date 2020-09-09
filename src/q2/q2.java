package q2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class q2 {

	public static final Integer canjump = 1;
	public static void main(String[] args) {
		List<Integer> x1 = new ArrayList<Integer>();
		x1.add(1);
		x1.add(2);
		x1.add(3);
		x1.add(2);
		x1.add(3);
		
        Integer maxheigh = Collections.max(x1);
        Integer result = maxheigh - canjump;

        System.out.println("final result:" + result );
	}

}
