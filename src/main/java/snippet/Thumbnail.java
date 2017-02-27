package snippet;

import java.nio.file.Paths;

import magick.ImageInfo;
import magick.MagickException;
import magick.MagickImage;

/**
 * @author Vinit Solanki
 *
 */
public class Thumbnail {

	private static final String ROOT = "C:\\Temp";
	private static final String inputFile = Paths.get(ROOT, "01.jpg").toString();
	private static final String outputFile = Paths.get(ROOT, "022.jpg").toString();

	public static void main(String args[]) throws MagickException {

		ImageInfo origInfo = new ImageInfo(inputFile); //load image info
		MagickImage image = new MagickImage(origInfo); //load image
		image = image.scaleImage(50, 50); //to Scale image
		image.setFileName(outputFile); //give new location
		image.writeImage(origInfo); //save

	}

}
