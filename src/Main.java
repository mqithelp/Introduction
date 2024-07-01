public class Main {
    public static void main(String[] args) {
        Author authorJulesVerne = new Author("Жюль", "Верн");
        Author authorAlexandrBeljaev = new Author("Александр", "Беляев");
        Book bookOne = new Book("Таинственный остров", authorJulesVerne, 1975);
        Book bookTwo = new Book("Продавец воздуха", authorAlexandrBeljaev, 1929);
        System.out.println("bookOne = " + bookOne);
        System.out.println("bookTwo = " + bookTwo);
    }

}

