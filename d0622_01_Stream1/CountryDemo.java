package d0622_01_Stream1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CountryDemo {

	public static void main(String[] args) {
		List<Country> countries = new ArrayList<Country>();
		countries.add(new Country("한국", Continent.ASIA, 50, true));
		countries.add(new Country("미국", Continent.AMERICA, 318, true));
		countries.add(new Country("중국", Continent.ASIA, 1355, false));
		countries.add(new Country("프랑스", Continent.EUROPE, 66, true));
		countries.add(new Country("나이지리아", Continent.AFRICA, 177, false));
		countries.add(new Country("독일", Continent.EUROPE, 80, true));
		countries.add(new Country("헝가리", Continent.EUROPE, 9, true));
		countries.add(new Country("칠레", Continent.AMERICA, 17, true));
		countries.add(new Country("캐나다", Continent.AMERICA, 34, true));
				
		System.out.println(countries);
		System.out.println();
		
		// oecd 가입국 검색
		List<Country> oecdCountries = new ArrayList<Country>();
		for(int i = 0 ; i < countries.size() ; i++) {
			if(countries.get(i).isOecd())
				oecdCountries.add(countries.get(i));
			
		}
		System.out.println(oecdCountries);
		System.out.println();
		oecdCountries.clear();
		
		for(Country c : countries) {
			if(c.isOecd())
				oecdCountries.add(c);
			
		}
		System.out.println(oecdCountries);
		System.out.println();
		
		oecdCountries = countries.stream().filter(s -> s.isOecd()).collect(Collectors.toList());
		System.out.println(oecdCountries);
		System.out.println();
		
		                                                
		System.out.print(countries.stream().filter(s -> s.isOecd()).map(Country::getName).collect(Collectors.joining(", ")));
		System.out.println();
		System.out.print(countries.stream().filter(s -> !s.isOecd()).map(Country::getName).collect(Collectors.joining(", ")));
		System.out.println();
		
		System.out.println(countries.stream().filter(s -> s.getContinent().equals(Continent.ASIA))
				.map(Country::getName).collect(Collectors.joining(", ")));
		
		System.out.println();
		
		// 인구가 10억 이상인 나라
		System.out.println(countries.stream().filter(s -> s.getPopulation() > 100).map(Country::getName).collect(Collectors.joining(", ")));
		System.out.println();
		
		// 국가명 정렬
		countries.stream().sorted((s, c) -> s.getName().compareTo(c.getName())).forEach(n -> System.out.println(n));
		System.out.println();
		countries.stream().sorted(Comparator.comparing(Country::getName).reversed()).forEach(n -> System.out.println(n));
		System.out.println();
		
		// 인구수 정렬
		countries.stream().sorted((s, c) -> s.getPopulation() - c.getPopulation()).forEach(n -> System.out.println(n));
		System.out.println();
		
		System.out.println(countries.stream().sorted((s, c) -> c.getPopulation() - s.getPopulation()).map(Country::getName)
		                    .collect(Collectors.joining(", ")));   // sorted에서 s, c를 선언하고 반대로 쓰면 역순이 된다. (reversed 대용)
		System.out.println();
		
		System.out.println(countries.stream().sorted(Comparator.comparing(Country::getPopulation))
		                        .map(Country::getName).collect(Collectors.joining(", ")));
		System.out.println();
		
		System.out.println(countries.stream().sorted((s, c) -> Double.compare(s.getPopulation(), c.getPopulation())).map(Country::getName)
				.collect(Collectors.joining(", "))); 
		
		
		
		
		
		
		
		}
		
			
}
