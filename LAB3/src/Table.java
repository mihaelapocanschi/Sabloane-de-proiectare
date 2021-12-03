public class Table implements Element {
    public class Table extends Element {
        private final String title;

        Table(String title) {
            this.title = title;
        }
        public void print() {
            System.out.println("Table with Title: " + title);
        }
    }