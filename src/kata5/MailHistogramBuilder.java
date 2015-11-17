package kata.pkg4v5;

import java.util.ArrayList;

public class MailHistogramBuilder {
    
    public static Histogram<String> build(ArrayList<String> mails){
        Histogram<String> histogram = new Histogram<>();
        for(String mail : mails){
            histogram.increment(new Mail(mail).getDomain());
        }
        
        return histogram;
    }
}