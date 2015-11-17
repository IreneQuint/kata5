package kata5;

import java.io.IOException;
import java.util.ArrayList;
import java.io.FileNotFoundException;

public class Kata4v5 {

    public static void main(String[] args) throws FileNotFoundException,IOException {
            
        ArrayList <String> mailList = MailReader.read();
        Histogram<String> histogram = MailHistogramBuilder.build(mailList);
        HistogramDisplay histoDisplay = new HistogramDisplay(histogram);
        histoDisplay.execute();
    }
}