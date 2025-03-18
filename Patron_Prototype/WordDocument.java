public class WordDocument extends Document {
    private String template;
    private boolean trackChanges;

    public WordDocument(String content, String author, String creationDate,
            String template, boolean trackChanges) {
        super(content, "DOCX", author, creationDate);
        this.template = template;
        this.trackChanges = trackChanges;
    }

    // Constructor para clonación
    public WordDocument(WordDocument source) {
        super(source);
        this.template = source.template;
        this.trackChanges = source.trackChanges;
    }

    @Override
    public DocumentPrototype clone() {
        return new WordDocument(this);
    }

    @Override
    public void print() {
        System.out.println("---- Documento Word ----");
        System.out.println("Contenido: " + content);
        System.out.println("Autor: " + author);
        System.out.println("Fecha: " + creationDate);
        System.out.println("Plantilla: " + template);
        System.out.println("Control de cambios: " + (trackChanges ? "Activado" : "Desactivado"));
        System.out.println("------------------------");
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    public void setTrackChanges(boolean trackChanges) {
        this.trackChanges = trackChanges;
    }
}