package snippet;

import java.nio.file.Paths;

import magick.DrawInfo;
import magick.ImageInfo;
import magick.MagickException;
import magick.MagickImage;
import magick.PixelPacket;

/**
 * @author Vinit Solanki Watermark example
 */
public class Watermark {

	private static final String ROOT = "C:\\Temp";
	private static final String inputFile = Paths.get(ROOT, "01.jpg").toString();
	private static final String outputFile = Paths.get(ROOT, "02.jpg").toString();

	public static void main(String args[]) throws MagickException {

		
		ImageInfo info = new ImageInfo(inputFile);
		MagickImage image = new MagickImage(info);
		DrawInfo aInfo = new DrawInfo(info);
		aInfo.setFill(PixelPacket.queryColorDatabase("yellow"));
		aInfo.setUnderColor(PixelPacket.queryColorDatabase("red"));

		aInfo.setOpacity(100);
		aInfo.setPointsize(36);
		aInfo.setFont("Arial");

		aInfo.setGeometry("+50+50");
		aInfo.setText("VINIT SOLANKI");
		image.annotateImage(aInfo);

		image.setFileName(outputFile);

		image.writeImage(info);

	}

}
