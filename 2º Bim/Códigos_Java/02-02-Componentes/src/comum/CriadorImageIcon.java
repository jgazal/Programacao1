package comum;

import javax.swing.ImageIcon;

public class CriadorImageIcon {
	public ImageIcon criarImageIcon(String path, String description) {
        java.net.URL imgURL = getClass().getClassLoader().getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL, description);
        } else {
            System.err.println("Não encontrei o arquivo: " + path);
            return null;
        }
    }
}
