import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.image.RescaleOp;

public class EffectsClass extends ImportClass{
	
	public void resetEffect(){
			ImportClass obj = new ImportClass();
			BufferedImage img = null;
			img = obj.getImage(0);
			obj.giveImage(img);
		}	
	
	public void negativeEffect(int  numberOfUsedEffects) {
		ImportClass obj = new ImportClass();
		BufferedImage img = null;
		img = obj.getImage(numberOfUsedEffects);
		
		int width = img.getWidth();
	    int height = img.getHeight();
	    int p, a, r, g, b;
	    
	    for(int i = 0; i < width; i++)
	    	for(int j = 0; j < height; j++) {
	    		p = img.getRGB(i, j);
	    		
	    		a = (p>>24) & 0xff;
    		    r = (p>>16) & 0xff;
    		    g = (p>>8) & 0xff;
    		    b = p & 0xff;
    		    
    		    a = 255 - a;
    		    r = 255 - r;
    		    g = 255 - g;
    		    b = 255 - b;
    		    
    		    p = (a << 24) | (r << 16) | (g << 8) | b;    		    
    		    img.setRGB(i, j, p); 
	    	}
	    
	    obj.giveImage(img);
	}
	
	public void blackAndWhiteEffect(int  numberOfUsedEffects) {
		ImportClass obj = new ImportClass();
		BufferedImage img = null;
		img = obj.getImage(numberOfUsedEffects);
		
		int width = img.getWidth();
	    int height = img.getHeight();
		
		BufferedImage blackAndWhiteImg = new BufferedImage(width, height, BufferedImage.TYPE_BYTE_BINARY);
			    
		Graphics2D graphics = blackAndWhiteImg.createGraphics();
		graphics.drawImage(img, 0, 0, null);
		obj.giveImage(blackAndWhiteImg);
	}
	
	public void blurEffect(int blurLevel, int numberOfUsedEffects) {
		ImportClass obj = new ImportClass();
		BufferedImage img = null;
		img = obj.getImage(numberOfUsedEffects);
		
		int width = img.getWidth();
	    int height = img.getHeight();
	   
		int a, r, g, b, p;
	
		for(int i = 0; i < width; i++)
	    	for(int j = 0; j < height - blurLevel + 1; j = j + blurLevel) {
	    		
	    		p = img.getRGB(i, j);
	    		
    			a = (p>>24) & 0xff;
    			r = (p>>16) & 0xff;
    			g = (p>>8) & 0xff;
    			b = p & 0xff;
    			
    			p = (a << 24) | (r << 16) | (g << 8) | b;    		    
    			img.setRGB(i, j, p);  
    			
	    		for(int oY = 1; oY < blurLevel - 1; oY++) {
	    			p = img.getRGB(i, oY + j);	    			
	    			p = (a << 24) | (r << 16) | (g << 8) | b;    		    
	    			img.setRGB(i, j + oY, p); 
	    		}
	    	}
	    obj.giveImage(img);
	}
	
	public void circularBlurEffect(int blurLevel, int numberOfUsedEffects) {
		ImportClass obj = new ImportClass();
		BufferedImage img = null;
		img = obj.getImage(numberOfUsedEffects);
		
		int width = img.getWidth();
	    int height = img.getHeight();
	   
		int a, r, g, b, p;
	
		for(int i = 0; i < width; i++)
	    	for(int j = 0; j < height - blurLevel + 1; j = j + blurLevel) {
	    		
	    		p = img.getRGB(i, j);
	    		
    			a = (p>>24) & 0xff;
    			r = (p>>16) & 0xff;
    			g = (p>>8) & 0xff;
    			b = p & 0xff;
    			
    			p = (a << 24) | (r << 16) | (g << 8) | b;    		    
    			img.setRGB(i, j, p);  
    			
	    		for(int oY = 1; oY < blurLevel - 1; oY++) {
	    			p = img.getRGB(i, oY + j);	    			
	    			p = (a << 24) | (r << 16) | (g << 8) | b;    		    
	    			img.setRGB(i, j + oY, p); 
	    		}
	    	}
	    obj.giveImage(img);
	}
	
	public void contrastEffect(int contrastLevel, int numberOfUsedEffects) {
		ImportClass obj = new ImportClass();
		BufferedImage img = null;
		img = obj.getImage(numberOfUsedEffects);
	    
	    RescaleOp rescale = new RescaleOp(contrastLevel, 0.1f, null);
        img = rescale.filter(img, null);
        
	    obj.giveImage(img);
	}
	
	public void lightEffect(int lightLevel, int numberOfUsedEffects) {
		ImportClass obj = new ImportClass();
		BufferedImage img = null;
		img = obj.getImage(numberOfUsedEffects);
		
		int width = img.getWidth();
	    int height = img.getHeight();
	    
	    int a, r, g, b, p;
	    
	    for(int i = 0; i < width; i++)
	    	for(int j = 0; j < height; j++) {
	    		p = img.getRGB(i, j);
	    		
	    		a = (p>>24) & 0xff;
    		    r = (p>>16) & 0xff;
    		    g = (p>>8) & 0xff;
    		    b = p & 0xff;
    		    
    		    a = a + lightLevel;
    		    r = r + lightLevel;
    		    g = g + lightLevel;
    		    b = g + lightLevel;
    		    
    		    p = (a << 24) | (r << 16) | (g << 8) | b;    		    
    		    img.setRGB(i, j, p); 
	    	}
	    	
	    obj.giveImage(img);
	}
	
	public void grayScaleEffect(int numberOfUsedEffects) {
		ImportClass obj = new ImportClass();
		BufferedImage img = null;
		img = obj.getImage(numberOfUsedEffects);
		
		int width = img.getWidth();
	    int height = img.getHeight();
	    
	    int r, g, b, p, avg;
	    
	    for(int i = 0; i < width; i++)
	    	for(int j = 0; j < height; j++) {
	    		p = img.getRGB(i, j);
	    	
    		    r = (p>>16) & 0xff;
    		    g = (p>>8) & 0xff;
    		    b = p & 0xff;
    		    
    		    avg = (r + g + b)/3;
    		    
    		    p = (avg << 24) | (avg << 16) | (avg << 8) | avg;   		    
    		    img.setRGB(i, j, p); 
	    	}
	    
	    obj.giveImage(img);
	}
	
	public void horizontalFlipEffect(int numberOfUsedEffects) {
		ImportClass obj = new ImportClass();
		BufferedImage img = null;
		BufferedImage imgCopy = null;
		img = obj.getImage(numberOfUsedEffects);
		imgCopy = obj.getImage(numberOfUsedEffects);
		
		int width = img.getWidth();
	    int height = img.getHeight();
	    	    
	    for(int i = 0; i < width; i++) 						
	    	for(int j = 0; j < height; j++) 
	    		img.setRGB(i, j, imgCopy.getRGB(width-i-1, j));
	    obj.giveImage(img);
	}
	
	public void verticalFlipEffect(int numberOfUsedEffects) {
		ImportClass obj = new ImportClass();
		BufferedImage img = null;
		BufferedImage imgCopy = null;
		img = obj.getImage(numberOfUsedEffects);
		imgCopy = obj.getImage(numberOfUsedEffects);
		
		int width = img.getWidth();
	    int height = img.getHeight();
	    	    
	    for(int i = 0; i < width; i++) 						
	    	for(int j = 0; j < height; j++) 
	    		img.setRGB(i, j, imgCopy.getRGB(i, height-j-1));
	
	    obj.giveImage(img);
	}
	
	public int changeBorderColorEffect(int numberOfUsedEffects, int numberOfBorderColor) {
		return numberOfBorderColor++;
	}
	
	public void rotateEffect(int numberOfUsedEffects) {   //neterminat
		ImportClass obj = new ImportClass();
		BufferedImage img = null;
		BufferedImage imgCopy = null;
		img = obj.getImage(numberOfUsedEffects);
		imgCopy = obj.getImage(numberOfUsedEffects);
		
		int width = img.getWidth();
	    int height = img.getHeight();
	    
	    
	    
	    
	}
}
