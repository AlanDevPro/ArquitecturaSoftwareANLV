import java.util.HashMap;
import java.util.Map;

public class DocumentRegistry {
        private static final Map<String, DocumentPrototype> prototypes = new HashMap<>();

        static {
                prototypes.put("pdf-basico", new PDFDocument(
                                "Contenido por defecto", "Sistema", "17/03/2025",
                                false, 0));

                prototypes.put("pdf-seguro", new PDFDocument(
                                "Contenido por defecto", "Sistema", "17/03/2025",
                                true, 3));

                prototypes.put("word-simple", new WordDocument(
                                "Contenido por defecto", "Sistema", "17/03/2025",
                                "Normal", false));

                prototypes.put("word-colaborativo", new WordDocument(
                                "Contenido por defecto", "Sistema", "17/03/2025",
                                "Colaborativo", true));
        }

        public static DocumentPrototype getPrototype(String type) {
                return prototypes.get(type).clone();
        }
}
