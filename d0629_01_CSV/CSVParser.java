package d0629_01_CSV;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.text.Format;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class score {
	private String name;
	private Integer kor;
	private Integer eng;
	private Integer mat;

	public score(String name, Integer kor, Integer eng, Integer mat) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getKor() {
		return kor;
	}

	public void setKor(Integer kor) {
		this.kor = kor;
	}

	public Integer getEng() {
		return eng;
	}

	public void setEng(Integer eng) {
		this.eng = eng;
	}

	public Integer getMat() {
		return mat;
	}

	public void setMat(Integer mat) {
		this.mat = mat;
	}

	@Override
	public String toString() {
		return name + "( kor = " + kor + ", eng = " + eng + ", math = " + mat + " )";
	}

}

public class CSVParser {

	public static void main(String[] args) throws IOException {
		String path = "C:\\Users\\KOSTA\\git\\KOSTA-JAVA\\KOSTA-JAVA\\d0629_01_CSV\\score.csv";

		BufferedReader br = new BufferedReader(new FileReader(path));
		
		List<score> scores = new ArrayList<score>();
	      scores = br.lines()
	                   .map(line -> line.split(","))
	                   .skip(1)
	                   .map(s -> new score(s[0], Integer.parseInt(s[1]), Integer.parseInt(s[2]),
	                           Integer.parseInt(s[3])))
	                   .collect(Collectors.toList());
	      br.close();

	      System.out.println(scores);
		
		/*
		 * List<score> sc = new ArrayList<>(); br.lines().map(line ->
		 * line.split(",")).skip(1).forEach(s -> { String name = s[0]; Integer kor =
		 * Integer.parseInt(s[1]); Integer eng = Integer.parseInt(s[2]); Integer mat =
		 * Integer.parseInt(s[3]); sc.add(new score(name, kor, eng, mat)); });
		 * br.close();
		 */

		//System.out.println(sc);
	}

}
