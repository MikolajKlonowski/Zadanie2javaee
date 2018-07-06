import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Metody {
    public int liczenieZNakowBezSPacji(String tekst) {
        String in = tekst;
        int i = 0;
        Pattern p = Pattern.compile(" ");
        Matcher m = p.matcher(in);
        while (m.find()) {
            i++;
        }
        return tekst.length() - i;
    }

    public int liczenieWszystkichZnakow(String tekst) {
        return tekst.length();
    }

    public int liczenieSlow(String tekst) {
        String sample = tekst;
        char[] arraysample = sample.toCharArray();
        int i = 0;
        String a = " ";
        for (char c : arraysample) {
            switch (c) {
                case ' ':
                    i++;
            }
        }
        return i + 1;
    }

    public boolean czyTekstJestPolidromem(String tekst) {
        char[] arraysample = tekst.toCharArray();
        int i = tekst.length();
        for (int j = 0; j < i; j++) {
            if (arraysample[j] != arraysample[i - j]) {
                return false;
            }
        }
        return true;
    }

}
