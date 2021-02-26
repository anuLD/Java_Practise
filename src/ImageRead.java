import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageRead {

    public static void main(String[] args)
    {
        File file=new File("C:\\Users\\adhanakodi\\Practise\\F10837.jpg");
        BufferedImage image=null;
        try {
            image=ImageIO.read(file);
            ImageIO.write(image,"jpg", new File("C:\\Users\\adhanakodi\\Practise\\F10838.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
