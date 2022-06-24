package d0624_01_ReLambda;

import java.util.function.Predicate;

public class Over30 implements Predicate<Integer> {

	@Override
	public boolean test(Integer t) {
		return t >= 30;
	}
	

}
