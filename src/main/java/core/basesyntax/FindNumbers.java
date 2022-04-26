package core.basesyntax;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindNumbers {

    public int[] getAllNumbers(String text) {
        if (text.length() == 0) {
            return new int[0];
        }
        StringBuilder builder = new StringBuilder();
        Pattern pattern = Pattern.compile("-?[\\d]+");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
        builder.append(text, matcher.start(), matcher.end()).append(" ");
        }
        String[] builderAddSplited = builder.toString().trim().split(" ");
        int[] builderAdd = new int[builderAddSplited.length];
        for (int i =0; i < builderAdd.length; i++) {
            builderAdd[i] = Integer.parseInt(builderAddSplited[i]) * 2;
        }
        return builderAdd;
    }
}
