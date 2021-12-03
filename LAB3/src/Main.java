public class Main {
    public class Main {
        public static void main(String[] args) {
            Book discoTitanic = new Book("Disco Titanic");
            Book noapteBuna = new Book("Noapte buna, copii!");
            Author rpGheo = new Author("Radu Pavel Gheo");
            noapteBuna.addAuthor(rpGheo);

            discoTitanic.addAuthor(rpGheo);
            int indexChapterOne = discoTitanic.createChapter("Chapter 1");
            Chapter chp1 = discoTitanic.getChapter(indexChapterOne);
            int indexSubChapterOneOne = chp1.createSubChapter("Subchapter 1.1");
            SubChapter scOneOne = chp1.getSubChapter(indexSubChapterOneOne);
            scOneOne.createNewParagraph("Paragraph 1");
            scOneOne.createNewParagraph("Paragraph 2");
            scOneOne.createNewParagraph("Paragraph 3");
            scOneOne.createNewImage("Image 1");
            scOneOne.createNewParagraph("Paragraph 4");
            scOneOne.createNewTable("Table 1");
            scOneOne.createNewParagraph("Paragraph 5");
            scOneOne.print();
            Section cap1 = new Section("Capitolul 1");
            Section cap11 = new Section("Capitolul 1.1");
            Section cap111 = new Section("Capitolul 1.1.1");
            Section cap1111 = new Section("Subchapter 1.1.1.1");
            noapteBuna.addContent(new Paragraph("Multumesc celor care ..."));
            noapteBuna.addContent(cap1);
            cap1.add(new Paragraph("Moto capitol"));
            cap1.add(cap11);
            cap11.add(new Paragraph("Text from subchapter 1.1"));
            cap11.add(cap111);
            cap111.add(new Paragraph("Text from subchapter 1.1.1"));
            cap111.add(cap1111);
            cap1111.add(new Image("Image subchapter 1.1.1.1"));

            noapteBuna.print();
        }
    }
}
