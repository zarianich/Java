package Articles;

public class Articles {

    private String title;

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getAuthor() {
        return author;
    }

    private String content;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    private String author;

    public Articles(String title, String content, String author){
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public void Edit(String newContent){
        this.setContent(newContent);
    }

    public void ChangeAuthor(String newAuthor){
        this.setAuthor(newAuthor);
    }

    public void Rename(String newTitle){
        this.setTitle(newTitle);
    }

    @Override
    public String toString(){
        return String.format("%s - %s: %s", this.getTitle(), this.getContent(), this.getAuthor());
    }
}
