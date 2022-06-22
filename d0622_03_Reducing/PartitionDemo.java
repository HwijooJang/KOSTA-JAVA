package d0622_03_Reducing;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import d0621_05_Test.Nation;

public class PartitionDemo {
	
	public static void main(String[] args) {
		
		Map<Boolean, List<Nation>> m1 =
		Nation.nations.stream().collect(Collectors.partitioningBy(n -> n.getType() == Nation.Type.LAND));
	
	    System.out.println(m1.get(true)); // grounping 하고 똑같지만 다만 다른점은 partitioning 은 Boolean 값을 뱉어 낸다는 것이다.
	    System.out.println(m1.get(false
	    		));
	
	}
}
