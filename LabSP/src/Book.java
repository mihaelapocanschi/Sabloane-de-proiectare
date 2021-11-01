public class Book {
    import java.util.ArrayList;
import java.util.List;

    public class Book {
        private final String name;
        private final List<Author> authors = new ArrayList<>();
        private final List<Chapter> chapters = new ArrayList<>();
        private final List<SubChapter> subChapters = new ArrayList<>();

        public Book(String name) {
            this.name = name;
        }

        public int createChapter(String chapter) {
            chapters.add(new Chapter(chapter));
            return chapters.size() - 1;
        }

        public void addAuthor(Author author) { authors.add(author); }

        public Chapter getChapter(int chapterIndex) {
            return chapters.get(chapterIndex);
        }

        public void print() {
            System.out.println(name);
            System.out.println(chapters);
            System.out.println(subChapters);
        }
    }
}
