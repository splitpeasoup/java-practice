import java.awt.image.BufferedImage;


public class Bitmap extends App{

   public BufferedImage input;
   public String outputpath;
   public String transformname;

//creating constructor to instantiate and instance of Bitmap
   public Bitmap(BufferedImage input, String outputpath, String transformname){
        this.input = input;
        this.outputpath = outputpath;
        this.transformname = transformname;

   }



}
