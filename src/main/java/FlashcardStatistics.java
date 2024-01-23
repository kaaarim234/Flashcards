public class FlashcardStatistics {
    private int totalQuestions;
    private int correctAnswers;
    private int incorrectAnswers;
    private int mcCorrectAnswers; // Anzahl der korrekten Antworten auf Multiple-Choice-Fragen
    private int mcIncorrectAnswers; // Anzahl der inkorrekten Antworten auf Multiple-Choice-Fragen


    public FlashcardStatistics() {
        this.totalQuestions = 0;
        this.correctAnswers = 0;
        this.incorrectAnswers = 0;
        this.mcCorrectAnswers = 0;
        this.mcIncorrectAnswers = 0;
    }

    public void incrementTotalQuestions() {
        totalQuestions++;
    }

    public void incrementCorrectAnswers() {
        correctAnswers++;
    }

    public void incrementIncorrectAnswers() {
        incorrectAnswers++;
    }

    public int getTotalQuestions() {
        return totalQuestions;
    }

    public int getCorrectAnswers() {
        return correctAnswers;
    }

    public int getIncorrectAnswers() {
        return incorrectAnswers;
    }

    public void incrementMCCorrectAnswers() {
        mcCorrectAnswers++;
    }

    public void incrementMCIncorrectAnswers() {
        mcIncorrectAnswers++;
    }



}
