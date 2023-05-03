public class Book extends Product{
    String author;
    String publisher;

    Book(int productId , String name , double price ,String author ,String publisher)
    {
        super(productId, name, price);
        this.author = author;
        this.publisher = publisher;

    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
}

