import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class ImportClass {
	
    public BufferedImage getImage(int numberOfUsedEffects) {
    	BufferedImage img = null;
        File f = null;
        
        try{
        	if(numberOfUsedEffects > 0) {
		      f = new File("C:\\Users\\Stefan\\workspace\\Schimbare Contrast Proiect\\armadilo1.JPG");
		      img = ImageIO.read(f);
        	}
        	else {
        		f = new File("C:\\Users\\Stefan\\workspace\\Schimbare Contrast Proiect\\armadilo.JPG");
  		      	img = ImageIO.read(f);
        	}
		    }catch(IOException e){
		      System.out.println(e);
		    }
        
        return img;
    }
    
    public void giveImage(BufferedImage img) {   
    	File f = null;
    	
        try{
		      f = new File("C:\\Users\\Stefan\\workspace\\Schimbare Contrast Proiect\\armadilo1.JPG");
		      ImageIO.write(img, "JPG", f);
		    }catch(IOException e){
		      System.out.println(e);
		    }
    }
    
	public void Print() {
		System.out.println("Sfarsitul programului!");
	}
				
}
