package HW15.com.hillel.hw15.wordsfinder;

import java.util.HashMap;
import java.util.Map;

public class Runner {
    public static void main(String[] args) {
        String str = "\n" +
                "Jessie Yeung, CNN\n" +
                "Archaeologists in Egypt have discovered almost 30 sarcophagi believed to have been buried for around 2,500 years, according to the country's Ministry of Tourism and Antiquities.\n" +
                "The cache of closed coffins was unearthed from a 11-meter-deep (36 feet) burial shaft in Saqqara, a vast necropolis about 32 kilometers (20 miles) south of Cairo.\n" +
                "Having announced the discovery of over a dozen sarcophagi at the site earlier this month, the ministry revealed via Facebook on Sunday that it had unearthed a further 14," +
                " raising the total number found in the shaft to 27.";
        str = str.toLowerCase();
        str = str.replaceAll("\\W", " ");

        Map<String, Integer> map = new HashMap<>();
        for (String s : str.split(" ")) {
            if (map.containsKey(s)) {
                map.put(s, map.get(s) + 1);
            } else {
                map.put(s, 1);
            }
        }
        map.remove("");
        System.out.println("\n" + map);
    }
}
