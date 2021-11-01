
import java.util.ArrayList;
        import java.util.List;

public class Chapter {
    private String name;
    private final List<SubChapter> subChapters = new ArrayList<>();

    public Chapter(String chapterText) {
        name = chapterText;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int createSubChapter(String subChapterName) {
        subChapters.add(new SubChapter(subChapterName));
        return subChapters.size() - 1;
    }

    public SubChapter getSubChapter(int subchapterIndex) {
        return subChapters.get(subchapterIndex);
    }
}{
}
