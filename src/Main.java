
public class Main {
    public static void main(String[] args) {
        Author authorJulesVerne = new Author("Жюль", "Верн");
        Author authorAlexandrBeljaev = new Author("Александр", "Беляев");
        Book bookOne = new Book("Таинственный остров", authorJulesVerne, 1975);
        Book bookTwo = new Book("Продавец воздуха", authorAlexandrBeljaev, 1929);
        Book bookThree = new Book("Продавец воздуха", authorAlexandrBeljaev, 1929);
        System.out.println("==========[ Наша библиотека ]==========");
        System.out.println(bookOne);
        System.out.println(bookTwo);
        System.out.println("-----< Ошибка в годе публикации книга Жюля Верна. Исправим это! >-----");
        bookOne.setPublicationYear(1874);
        System.out.println(bookOne);
        System.out.println("Проверим метод equals.");
        if (bookOne.equals(bookTwo)) {
            System.out.println("Книги одинаковые.");
        } else {
            System.out.println("Книги разные.");
            System.out.println("Хэш-код первой книги:" + bookOne.hashCode());
            System.out.println("Хэш-код второй книги:" + bookTwo.hashCode());
        }
        if (bookTwo.equals(bookThree)) {
            System.out.println("Книги одинаковые.");
            System.out.println("Хэш-код первой книги:" + bookTwo.hashCode());
            System.out.println("Хэш-код второй книги:" + bookThree.hashCode());
        } else {
            System.out.println("Книги разные.");
        }
    }
}

