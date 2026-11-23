class IsogramChecker {

    boolean isIsogram(String phrase) {
        String lowerCasePhrase = phrase.toLowerCase();

        for (int i = 0; i < lowerCasePhrase.length(); i++) {
            char currentChar = lowerCasePhrase.charAt(i);
            // On ne vérifie que les lettres (les espaces et tirets peuvent se                     répéter)
            if (Character.isLetter(currentChar)) {
                // Si la première occurrence et la dernière occurrence sont                             différentes, la lettre est présente plus d'une fois
                if (lowerCasePhrase.indexOf(currentChar) != lowerCasePhrase.lastIndexOf(currentChar)) {
                    return false;
                }
            }
        }

        return true;
    }
}