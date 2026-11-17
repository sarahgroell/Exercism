class Bob {

    String hey(String input) {
        // 1. On gère d'abord le silence (chaîne vide ou espaces)
        if (input.isBlank()) {
            return "Fine. Be that way!";
        }

        // On nettoie les espaces à la fin pour être sûr de bien cibler le dernier caractère
        String trimmed = input.stripTrailing();
        
        boolean isQuestion = trimmed.endsWith("?");
        // On vérifie si c'est en majuscules ET qu'il y a au moins une lettre
        boolean isUppercase = input.equals(input.toUpperCase()) && input.chars().anyMatch(Character::isLetter);

        // 2. On applique les règles de Bob
        if (isUppercase && isQuestion) {
            return "Calm down, I know what I'm doing!";
        } else if (isUppercase) {
            return "Whoa, chill out!";
        } else if (isQuestion) {
            return "Sure.";
        } else {
            return "Whatever.";
        }
    }
}