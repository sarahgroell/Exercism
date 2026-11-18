import java.math.BigInteger;

class Grains {

    BigInteger grainsOnSquare(final int square) {
        // Validation que le numéro de case est bien entre 1 et 64
        if (square < 1 || square > 64) {
            throw new IllegalArgumentException("square must be between 1 and 64");
        }
        
        // 2^(square - 1) calculé proprement avec BigInteger (shiftLeft)
        return BigInteger.ONE.shiftLeft(square - 1);
    }

    BigInteger grainsOnBoard() {
        BigInteger totalNumber = BigInteger.ZERO;
        
        // On parcourt les 64 cases de l'échiquier de 1 à 64
        for (int i = 1; i <= 64; i++) {
            totalNumber = totalNumber.add(grainsOnSquare(i));
        }
        
        return totalNumber;
    }

}