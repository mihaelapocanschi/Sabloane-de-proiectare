public class Book {
    import java.util.ArrayList;
import java.util.List;

    public class Book {
        private final String title;
        public class Book extends Section {
            private TableOfContents tableOfContents;
            private final List<Author> authors = new ArrayList<>();
            private final List<Chapter> chapters = new ArrayList<>();

            public Book(String title) {
                this.title = title;
                super(title);
            }

            public void addAuthor(Author author) { authors.add(author); }

            public void addContent(Element element) {
                this.elements.add(element);
            }

            public int createChapter(String chapter) {
                chapters.add(new Chapter(chapter));
                return chapters.size() - 1;
                @@ -24,7 +27,11 @@ public Chapter getChapter(int chapterIndex) {

                    public void print() {
                        System.out.println("Book: " + title);
                        System.out.println();
                        authors.forEach(Author::print);
                        System.out.println();
                        chapters.forEach(Chapter::print);
                        System.out.println();
                        elements.forEach(Element::print);
                    }
                }
}
