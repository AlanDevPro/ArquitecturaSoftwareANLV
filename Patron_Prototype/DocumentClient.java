public class DocumentClient {
    public static void main(String[] args) {
        // Método 1: Crear y clonar directamente
        System.out.println("MÉTODO 1: CLONAR DIRECTAMENTE");
        PDFDocument pdfOriginal = new PDFDocument(
                "Informe confidencial", "Juan Pérez", "15/03/2025",
                true, 2);

        PDFDocument pdfCopia = (PDFDocument) pdfOriginal.clone();
        pdfCopia.setContent("Copia del informe confidencial");
        pdfCopia.setAuthor("María López");

        System.out.println("PDF Original:");
        pdfOriginal.print();
        System.out.println("\nPDF Copia:");
        pdfCopia.print();

        // Método 2: Usar el registro de prototipos
        System.out.println("\nMÉTODO 2: USAR REGISTRO DE PROTOTIPOS");

        // Obtenemos un documento del registro de prototipos
        PDFDocument pdfSeguro = (PDFDocument) DocumentRegistry.getPrototype("pdf-seguro");
        pdfSeguro.setContent("Nueva política de seguridad");
        pdfSeguro.setAuthor("Departamento de TI");

        WordDocument wordColaborativo = (WordDocument) DocumentRegistry.getPrototype("word-colaborativo");
        wordColaborativo.setContent("Proyecto colaborativo Q1 2025");
        wordColaborativo.setAuthor("Equipo de Marketing");

        System.out.println("PDF Seguro:");
        pdfSeguro.print();
        System.out.println("\nWord Colaborativo:");
        wordColaborativo.print();
    }
}
