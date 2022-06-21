package d0621_05_Test;

import java.nio.file.DirectoryStream.Filter;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Test2 {

	public static void main(String[] args) {
		List<String> ls = List.of("서울", "워싱턴", "베이징", "파리", "마드리드", "런던");
		
		System.out.println(ls.stream().sorted().findFirst().get());
	}
}
