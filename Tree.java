import java.io.File;

public class Tree{
    
    public static void main(String[] args) {
        // Spécifiez le chemin du répertoire à explorer
        String directoryPath = "C:\\Users\\LENOVO\\OneDrive\\Bureau";
        
        // Affiche la structure arborescente du répertoire
        displayDirectoryTree(new File(directoryPath), "");
    }
    
    public static void displayDirectoryTree(File dir, String indentation) {
        System.out.println(indentation + dir.getName() + "/");
        
        File[] files = dir.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    // Appel récursif pour les sous-dossiers
                    displayDirectoryTree(file, indentation + "  ");
                } else {
                    // Affiche le nom du fichier avec le décalage
                    System.out.println(indentation + "  " + file.getName());
                }
            }
        }
    }
}
