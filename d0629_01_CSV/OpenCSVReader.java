package d0629_01_CSV;

import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.bean.CsvToBeanBuilder;

public class OpenCSVReader {
   public static void main(String[] args) {
      String path1 = "C:\\Users\\KOSTA\\git\\KOSTA-JAVA\\KOSTA-JAVA\\d0629_01_CSV\\score.csv";

      CSVReader reader;
      List<String[]> scores = new ArrayList<String[]>();
      try {
         reader = new CSVReader(new FileReader(path1, Charset.forName("EUC-KR")));
         scores = reader.readAll();
         reader.close();

      } catch (IOException e) {
         e.printStackTrace();
      }
      scores.stream().forEach(x -> System.out.println(x[0] + " : " + x[1]));

//      List<Score> scores2 = new ArrayList<Score>();
//      try {
//         scores2 = new CsvToBeanBuilder<Score>(
//                 new FileReader(path1, Charset.forName("EUC-KR"))).withType(Score.class)
//                                                                  .build()
//                                                                  .parse();
//      } catch (IllegalStateException e) {
//         // TODO Auto-generated catch block
//         e.printStackTrace();
//      } catch (IOException e) {
//         // TODO Auto-generated catch block
//         e.printStackTrace();
//      }
//      System.out.println(scores2);

   }

}