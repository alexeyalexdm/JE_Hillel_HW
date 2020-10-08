package HW17.com.hillel.hw17.allTasks;


import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextAnalysis {

    private String textForAnalysis;

    public TextAnalysis(String textForAnalysis) {
        this.textForAnalysis = textForAnalysis;
    }

    public LinkedList<String> showCountedWords() {
        Set<Map.Entry<String, Integer>> set = countWords(textForAnalysis).entrySet();
        LinkedList<String> result = new LinkedList<>();
        for (Map.Entry<String, Integer> el : set) {
            result.add(el.getKey() + " " + el.getValue());
        }
        return result;
    }

    public HashMap<String, Integer> countWords(String text) {
        Pattern pattern = Pattern.compile("[A-Za-z]+");
        Matcher matcher = pattern.matcher((text));
        HashMap<String, Integer> result = new HashMap<>();
        while (matcher.find()) {
            String word = matcher.group();
            result.merge(word, 1, Integer::sum);
        }
        return result;
    }

    public String replaceSymbol(int number, char symbol) {
        return textForAnalysis.replaceAll(String.format("(\\b\\w{%d})\\w", number - 1), "$1" + symbol);
    }


}

