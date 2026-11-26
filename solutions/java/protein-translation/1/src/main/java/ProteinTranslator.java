import java.util.ArrayList;
import java.util.List;

class ProteinTranslator {

    List<String> translate(String rnaSequence) {
        List<String> proteins = new ArrayList<>();
        boolean stopped = false;
    
        for (int i = 0; i + 3 <= rnaSequence.length(); i += 3) {
            String codon = rnaSequence.substring(i, i + 3);
            String protein = translateCodon(codon);
    
            if ("STOP".equals(protein)) {
                stopped = true;
                break;
            }
    
            proteins.add(protein);
        }
    
        if (!stopped && rnaSequence.length() % 3 != 0) {
            throw new IllegalArgumentException("Invalid codon");
        }
    
        return proteins;
    }

    private String translateCodon(String codon) {
        return switch (codon) {
            case "AUG" -> "Methionine";
            case "UUU", "UUC" -> "Phenylalanine";
            case "UUA", "UUG" -> "Leucine";
            case "UCU", "UCC", "UCA", "UCG" -> "Serine";
            case "UAU", "UAC" -> "Tyrosine";
            case "UGU", "UGC" -> "Cysteine";
            case "UGG" -> "Tryptophan";
            case "UAA", "UAG", "UGA" -> "STOP";
            default -> throw new IllegalArgumentException("Invalid codon");
        };
    }
}