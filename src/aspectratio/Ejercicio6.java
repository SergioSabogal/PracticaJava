package aspectratio;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

/*
 * Crea un programa que se encargue de calcular el aspect ratio de una
 * imagen a partir de una url.
 * - Url de ejemplo:
 *   https://raw.githubusercontent.com/mouredevmouredev/master/mouredev_github_profile.png
 * - Por ratio hacemos referencia por ejemplo a los "16:9" de una
 *   imagen de 1920*1080px.
 */
public class Ejercicio6 {
    public static void main(String[] args) throws MalformedURLException {
        try {
            URL urlImage = new URL("https://byspel.com/wp-content/uploads/2018/05/Java-Logo.jpg");

            BufferedImage image  = ImageIO.read(urlImage);
            int alto = image.getHeight();
            int ancho =  image.getWidth();

            System.out.println("\nAlto :" + alto);
            System.out.println("\nAncho: "+ancho);

        } catch (IOException e){
            e.printStackTrace();
        }
    }

}
