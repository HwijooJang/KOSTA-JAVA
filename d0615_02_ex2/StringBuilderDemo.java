package d0615_02_ex2;

public class StringBuilderDemo {

	public static void main(String[] args) {
		String s = new String("hi");
		
	    s.replace('h', 'o'); // 해도 String은 바뀌지 않음 (수정 불가능)
		System.out.println(s + " : " + s.hashCode());
        System.out.println(s.concat("!") + " : " + s.concat("!"));
		
		StringBuilder sb = new StringBuilder("hi");
		System.out.println(sb + " : " + sb.hashCode());
		
		sb.append("!");
		System.out.println(sb + " : " + sb.hashCode());
	    
		sb.append("bbb");
		sb.append(234);
		System.out.println(sb);
		sb.replace(3, 6, "ye");
		System.out.println(sb);
		sb.deleteCharAt(2);
		sb.setLength(3);
		System.out.println(sb);
	
	
	
	}

}
