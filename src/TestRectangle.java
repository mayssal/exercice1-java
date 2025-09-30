public class TestRectangle {
}
public class TestRectangle {
    public static void main(String[] args) {
        // Création d'un rectangle
        Rectangle rect = new Rectangle(4.5f, 6.0f);

        // Affichage du périmètre
        System.out.println("Périmètre du rectangle : " + rect.perimetre());

        // Affichage de la diagonale
        System.out.println("Diagonale du rectangle : " + rect.diagonale());

        // Doubler la longueur
        rect.doubler();
        System.out.println("Après avoir doublé la longueur : ");
        System.out.println("Nouvelle longueur : " + rect.getLongueur());
        System.out.println("Nouveau périmètre : " + rect.perimetre());
        System.out.println("Nouvelle diagonale : " + rect.diagonale());
    }
}
