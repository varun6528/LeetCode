package main.java.fr;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.TimeZone;

public class DataPreparation {
    public static void main(String args[]) throws IOException {

        String abc = "%s,%s,590,17,17,0,0,0,0,0,0,17,0,\"2020-08-12 20:52:35,827\",\"2020-08-13 09:05:06,602\",2020-08-26 19:01:29.062+00,,2020-05-26 10:20:00+00,,202008241006094af113b6";
        Path path = Paths.get("/Users/varunv/store4.txt");
        FileOutputStream fos = new FileOutputStream(path.toFile());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
        Files.lines(new File("/Users/varunv/data2.txt").toPath()).forEach( storeCode -> {
            System.out.println(storeCode);
            try {
                Files.lines(new File("/Users/varunv/data1.txt").toPath()).forEach( plu -> {
                    String withPlu = String.format(abc, storeCode, plu);
                    try {
                        bw.write(withPlu + System.lineSeparator());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                });
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        bw.close();
        System.out.println("Completed");
    }
}
