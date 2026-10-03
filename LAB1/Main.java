class Book
{
    int id;
    String title;
    String author;
    int price;

    static int count = 0;

    Book(int i, String t, String a, int p)
    {
        id = i;
        title = t;
        author = a;
        price = p;
        count++;
    }

    void show()
    {
        System.out.println(id + " " + title + " " + author + " " + price);
    }

    void search(int i)
    {
        if (id == i)
            show();
    }

    void search(String t)
    {
        if (title.equals(t))
            show();
    }

    Book costly(Book b)
    {
        if (price > b.price)
            return this;
        return b;
    }
}

public class Main
{
    public static void main(String[] args)
    {
        Book b1 = new Book(1, "Java", "James", 500);
        Book b2 = new Book(2, "Python", "Guido", 400);

        b1.show();
        b2.show();

        System.out.println("Search:");
        b1.search(1);
        b2.search("Python");

        System.out.println("Costlier book:");
        Book b = b1.costly(b2);
        b.show();

        System.out.println("Total books: " + Book.count);
    }
}