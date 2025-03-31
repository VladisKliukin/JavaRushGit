package Core;

public class Poem {

    private static Poem instance;
    private String[] lines;
    private int totalLines = 89;

    private Poem() {

        lines = new String[totalLines];

        for (int i = 0; i < totalLines; i++) {
            lines[i] = (i + 1 + ": " + " " + "\n");
        }
    }


    public static Poem getInstance() {
        if (instance == null) {
            instance = new Poem();
        }
        return instance;
    }


    public void addLineAtIndex(int lineIndex, String text) {
        if (lineIndex >= 0 && lineIndex < lines.length) {
            lines[lineIndex - 1] = (lineIndex + ": " + text + "\n");
        }
    }

    public String[] getPoemLines() {
        return lines;
    }

    public int getTotalLines() {
        return totalLines;
    }
}
