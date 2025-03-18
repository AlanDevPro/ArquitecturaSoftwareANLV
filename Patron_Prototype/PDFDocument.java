public class PDFDocument extends Document {
    private boolean encrypted;
    private int securityLevel;

    public PDFDocument(String content, String author, String creationDate,
            boolean encrypted, int securityLevel) {
        super(content, "PDF", author, creationDate);
        this.encrypted = encrypted;
        this.securityLevel = securityLevel;
    }

    // Constructor para clonación
    public PDFDocument(PDFDocument source) {
        super(source);
        this.encrypted = source.encrypted;
        this.securityLevel = source.securityLevel;
    }

    @Override
    public DocumentPrototype clone() {
        return new PDFDocument(this);
    }

    @Override
    public void print() {
        System.out.println("---- Documento PDF ----");
        System.out.println("Contenido: " + content);
        System.out.println("Autor: " + author);
        System.out.println("Fecha: " + creationDate);
        System.out.println("Cifrado: " + (encrypted ? "Sí" : "No"));
        System.out.println("Nivel de seguridad: " + securityLevel);
        System.out.println("----------------------");
    }

    public void setEncrypted(boolean encrypted) {
        this.encrypted = encrypted;
    }

    public void setSecurityLevel(int securityLevel) {
        this.securityLevel = securityLevel;
    }
}