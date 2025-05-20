package fr.einfolearning.imc.exceptions;


/**
 * Exception levée si les données saisies ne permettent pas de calculer l'IMC
 */
public class IncorrectDataException extends RuntimeException {
    public IncorrectDataException(String message) {
        super(message);
    }
}
