class Acronym {
    private String acronym = "";

    Acronym(String phrase) {
        String[] words = phrase.split("[\\s-_]+");
        
        // On initialise une chaîne vide
        String result = "";
        
        for (String word : words) {
            if (!word.isEmpty()) {
                // On ajoute le premier caractère mis en majuscule à notre chaîne
                result += Character.toUpperCase(word.charAt(0));
            }
        }
        
        this.acronym = result;
    }

    String get() {
        return this.acronym;
    }
}