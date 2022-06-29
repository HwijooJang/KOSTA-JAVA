package d0629_01_CSV;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVWriter;

public class OpenCSVWriter {
	public static void main(String[] args) {

		String[] header = { "id", "name", "address", "phone" };
		String[] record1 = { "1", "박", "구로구", "123-123" };
		String[] record2 = { "2", "김", "영등포구", "234-234" };
		String[] record3 = { "3", "이", "강서구", "345-345" };

		List<String[]> list = new ArrayList<String[]>();
		list.add(header);
		list.add(record1);
		list.add(record2);
		list.add(record3);
		System.out.println(String.join(", ", record3));

		String result = list.stream().skip(1).map(s -> String.join(", ", s)).reduce(String.join(",", header),
				(a, b) -> a + "\n" + b);
		System.out.println(result);

		String path1 = "C:\\Users\\KOSTA\\git\\KOSTA-JAVA\\KOSTA-JAVA\\d0629_01_CSV\\person.csv";
		try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path1, Charset.forName("EUC-KR")));) {
			bufferedWriter.write(result);
			bufferedWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		String path2 = "C:\\Users\\KOSTA\\git\\KOSTA-JAVA\\KOSTA-JAVA\\d0629_01_CSV\\person2.csv";

		try (CSVWriter writer = new CSVWriter(new FileWriter(path2, Charset.forName("EUC-KR")))) {
			writer.writeAll(list);
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}