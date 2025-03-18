public abstract class Document implements DocumentPrototype {
    protected String content;
    protected String format;
    protected String author;
    protected String creationDate;

    // Constructor normal
    public Document(String content, String format, String author, String creationDate) {
        this.content = content;
        this.format = format;
        this.author = author;
        this.creationDate = creationDate;
    }

    // Constructor para clonación
    public Document(Document source) {
        if (source != null) {
            this.content = source.content;
            this.format = source.format;
            this.author = source.author;
            this.creationDate = source.creationDate;
        }
    }

    // Setters
    public void setContent(String content) {
        this.content = content;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    // Implementación correcta de clone()
    @Override
    public DocumentPrototype clone() {
        try {
            return (Document) super.clone(); // Clona usando Object.clone()
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(); // No debería ocurrir porque implementamos Cloneable
        }
    }
}
