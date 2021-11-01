import java.util.ArrayList;
import java.util.List;

public class SubChapter {
    private String name;
    private final List<String> paragraphs = new ArrayList<>();
    private final List<String> images = new ArrayList<>();
    private final List<String> tables = new ArrayList<>();

    public SubChapter(String subchapterText) {
        name = subchapterText;
    }

    public void createNewParagraph(String paragraphText) {
        paragraphs.add(paragraphText);
    }

    public void createNewImage(String imageText) {
        images.add(imageText);
    }

    public void createNewTable(String tableText) {
        tables.add(tableText);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println("Subchapter: " + name);
        for (String paragraph : paragraphs) {
            System.out.println("Paragraph: " + paragraph);
        }
        for (String image : images) {
            System.out.println("Image with name: " + image);
        }
        for (String table : tables) {
            System.out.println("Table with title: " + table);
        }
    }
}
