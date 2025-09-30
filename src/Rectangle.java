public class Rectangle {
    // Attributs
    private float largeur;
    private float longueur;

    // Constructeur
    public Rectangle(float largeur, float longueur) {
        this.largeur = largeur;
        this.longueur = longueur;
    }

    // Méthode pour calculer le périmètre
    public float perimetre() {
        return 2 * (largeur + longueur);
    }

    // Méthode pour calculer la diagonale
    public double diagonale() {
        return Math.sqrt(longueur * longueur + largeur * largeur);
    }

    // Méthode pour doubler la longueur
    public void doubler() {
        longueur *= 2;
    }

    // Getters pour afficher les valeurs si nécessaire
    public float getLargeur() {
        return largeur;
    }

    public float getLongueur() {
        return longueur;
    }
}
