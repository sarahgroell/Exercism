public class LogLevels {
    
    public static String message(String logLine) {
        // 1. On cherche la position exacte du marqueur de fin de niveau "]:"
        int colonIndex = logLine.indexOf("]:");        
        if (colonIndex != -1) {
            // 2. On extrait la sous-chaîne qui commence juste après "]:" (donc à                 l'index + 2)
            // 3. On applique .trim() pour supprimer les espaces et les retours à la                ligne (\r\n)
            return logLine.substring(colonIndex + 2).trim();
        }        
        return "";
    }

    public static String logLevel(String logLine) {
        // 1. On cherche la position du crochet ouvrant '[' et du crochet fermant ']'
        int startIndex = logLine.indexOf("[");
        int endIndex = logLine.indexOf("]");
        
        // 2. Si on trouve bien les deux crochets
        if (startIndex != -1 && endIndex != -1 && startIndex < endIndex) {
            // 3. On extrait ce qu'il y a entre les deux (en ignorant les crochets                 eux-mêmes)
            // et on convertit le tout en minuscules avec .toLowerCase()
            return logLine.substring(startIndex + 1, endIndex).toLowerCase();
        }        
        return "";
    }

    public static String reformat(String logLine) {
        // On récupère le message nettoyé et le niveau en minuscules
        String msg = message(logLine);
        String level = logLevel(logLine);
        
        // On assemble le tout au format demandé : "Message (niveau)"
        return msg + " (" + level + ")";
    }
}
