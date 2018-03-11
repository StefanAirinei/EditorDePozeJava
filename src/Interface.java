import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;

public class Interface extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	JFrame frame;
	
	JButton effectsButton;
	JButton adjustmentButton;
	JButton toneButton;
	JButton drawButton;
	JButton resetButton;
	JButton optionsButton;
	JButton negativeEffectButton;
	JButton blackAndWhiteButton;
	JButton grayScaleButton;
	JButton horizontalFlipButton;
	JButton verticalFlipButton;
	JButton rotateButton;
	JButton blurButton;
	JButton contrastButton;
	JButton lightButton;
	JButton changeBorderColorButton;
	JButton backToMenuFromEffectsButton;
	JButton backToMenuFromAdjustmentButton;
	JButton backToMenuFromToneButton;
	JButton backToMenuFromDrawButton;
	JButton backToMenuFromOptionsButton;
	
	JTextField blurTextField;
	JTextField contrastTextField;
	JTextField lightTextField;
	
	JPanel biggerPanel;
	JPanel picturePanel;
	JPanel mainPanel;
	JPanel menuPanel;
	JPanel effectsPanel;
	JPanel adjustmentPanel;
	JPanel tonePanel;
	JPanel drawPanel;
	JPanel optionsPanel;
	
	JLabel pictureLabel;
	
	ImageIcon icon;
	
	String url = "C:\\Users\\Stefan\\workspace\\Schimbare Contrast Proiect\\armadilo1.JPG";
	
	int numberOfUsedEffects = 0;
	int numberOfBorderColor = 0;
	
	class GoToEffectsPanel implements ActionListener{
		public void actionPerformed(ActionEvent e){
			CardLayout obj = (CardLayout)(mainPanel.getLayout());
			obj.show(mainPanel, "effectsPanel");
		}
	}
	
	class GoToAdjustmentPanel implements ActionListener{
		public void actionPerformed(ActionEvent e){
			CardLayout obj = (CardLayout)(mainPanel.getLayout());
			obj.show(mainPanel, "adjustmentPanel");
		}
	}
	
	class GoToTonePanel implements ActionListener{
		public void actionPerformed(ActionEvent e){
			CardLayout obj = (CardLayout)(mainPanel.getLayout());
			obj.show(mainPanel, "tonePanel");
		}
	}
	
	class GoToDrawPanel implements ActionListener{
		public void actionPerformed(ActionEvent e){
			CardLayout obj = (CardLayout)(mainPanel.getLayout());
			obj.show(mainPanel, "drawPanel");
		}
	}
	
	class GoToOptionsPanel implements ActionListener{
		public void actionPerformed(ActionEvent e){
			CardLayout obj = (CardLayout)(mainPanel.getLayout());
			obj.show(mainPanel, "optionsPanel");
		}
	}
	
	class  GoToMenuPanel implements ActionListener{
		public void actionPerformed(ActionEvent e){
			CardLayout obj = (CardLayout)(mainPanel.getLayout());
			obj.show(mainPanel, "menuPanel");
		}
	}
	
	class  NegativeEffect implements ActionListener{
		public void actionPerformed(ActionEvent e){
			ResetPicture resetPicture = new ResetPicture();
			EffectsClass effectsObj = new EffectsClass();
			CardLayout obj = (CardLayout)(mainPanel.getLayout());
			effectsObj.negativeEffect(numberOfUsedEffects);
			resetPicture.actionPerformed(null);
			obj.show(mainPanel, "menuPanel");
			numberOfUsedEffects++;
		}
	}
	
	class  BlackAndWhiteEffect implements ActionListener{
		public void actionPerformed(ActionEvent e){
			ResetPicture resetPicture = new ResetPicture();
			EffectsClass effectsObj = new EffectsClass();
			CardLayout obj = (CardLayout)(mainPanel.getLayout());
			effectsObj.blackAndWhiteEffect(numberOfUsedEffects);
			resetPicture.actionPerformed(null);
			obj.show(mainPanel, "menuPanel");
			numberOfUsedEffects++;
		}
	}
	
	class  BlurEffect implements ActionListener{
		public void actionPerformed(ActionEvent e){
			ResetPicture resetPicture = new ResetPicture();
			EffectsClass effectsObj = new EffectsClass();
			CardLayout obj = (CardLayout)(mainPanel.getLayout());
			effectsObj.blurEffect(Integer.parseInt(blurTextField.getText()), numberOfUsedEffects);
			resetPicture.actionPerformed(null);
			obj.show(mainPanel, "menuPanel");
			numberOfUsedEffects++;
		}
	}
	
	class  ContrastEffect implements ActionListener{
		public void actionPerformed(ActionEvent e){
			ResetPicture resetPicture = new ResetPicture();
			EffectsClass effectsObj = new EffectsClass();
			CardLayout obj = (CardLayout)(mainPanel.getLayout());
			effectsObj.contrastEffect(Integer.parseInt(contrastTextField.getText()), numberOfUsedEffects);
			resetPicture.actionPerformed(null);
			obj.show(mainPanel, "menuPanel");
			numberOfUsedEffects++;
		}
	}
	
	class  LightEffect implements ActionListener{
		public void actionPerformed(ActionEvent e){
			ResetPicture resetPicture = new ResetPicture();
			EffectsClass effectsObj = new EffectsClass();
			CardLayout obj = (CardLayout)(mainPanel.getLayout());
			effectsObj.lightEffect(Integer.parseInt(lightTextField.getText()), numberOfUsedEffects);
			resetPicture.actionPerformed(null);
			obj.show(mainPanel, "menuPanel");
			numberOfUsedEffects++;
		}
	}
	
	class  GrayScaleEffect implements ActionListener{
		public void actionPerformed(ActionEvent e){
			ResetPicture resetPicture = new ResetPicture();
			EffectsClass effectsObj = new EffectsClass();
			CardLayout obj = (CardLayout)(mainPanel.getLayout());
			effectsObj.grayScaleEffect(numberOfUsedEffects);
			resetPicture.actionPerformed(null);
			obj.show(mainPanel, "menuPanel");
			numberOfUsedEffects++;
		}
	}
	
	class  HorizontalFlipEffect implements ActionListener{
		public void actionPerformed(ActionEvent e){
			ResetPicture resetPicture = new ResetPicture();
			EffectsClass effectsObj = new EffectsClass();
			CardLayout obj = (CardLayout)(mainPanel.getLayout());
			effectsObj.horizontalFlipEffect(numberOfUsedEffects);
			resetPicture.actionPerformed(null);
			obj.show(mainPanel, "menuPanel");
			numberOfUsedEffects++;
		}
	}
	
	class  VerticalFlipEffect implements ActionListener{
		public void actionPerformed(ActionEvent e){
			ResetPicture resetPicture = new ResetPicture();
			EffectsClass effectsObj = new EffectsClass();
			CardLayout obj = (CardLayout)(mainPanel.getLayout());
			effectsObj.verticalFlipEffect(numberOfUsedEffects);
			resetPicture.actionPerformed(null);
			obj.show(mainPanel, "menuPanel");
			numberOfUsedEffects++;
		}
	}
	
	class  ChangeBorderColorEffect implements ActionListener{
		public void actionPerformed(ActionEvent e){
			ResetPicture resetPicture = new ResetPicture();
			CardLayout obj = (CardLayout)(mainPanel.getLayout());
			
			numberOfBorderColor++;
			int i  = numberOfBorderColor;
			
			if(i == 1)
				picturePanel.setBorder(new LineBorder(Color.GREEN, 12));
			if(i == 2)
				picturePanel.setBorder(new LineBorder(Color.BLUE, 12));
			if(i == 3)
				picturePanel.setBorder(new LineBorder(Color.RED, 12));
			if(i == 4)
				picturePanel.setBorder(new LineBorder(Color.ORANGE, 12));
			if(i == 5) {
				picturePanel.setBorder(new LineBorder(Color.YELLOW, 12));
				numberOfBorderColor = 0;
			}
			resetPicture.actionPerformed(null);
			obj.show(mainPanel, "menuPanel");
		}
	}
	
	class Reset implements ActionListener{
		public void actionPerformed(ActionEvent e){
			EffectsClass resetObj = new EffectsClass();
			ResetPicture resetPicture = new ResetPicture();
			//ImportClass imp = new ImportClass();
			CardLayout obj = (CardLayout)(mainPanel.getLayout());
			numberOfUsedEffects = 0;
			//imp.giveImage(imp.getImage(numberOfUsedEffects));
			resetObj.resetEffect();
			resetPicture.actionPerformed(null);
			pictureLabel.repaint();
			obj.show(mainPanel, "menuPanel");
		}
	}
	
	class ResetPicture implements ActionListener{
		public void actionPerformed(ActionEvent e){
			picturePanel.removeAll();;
			icon = new ImageIcon(((new ImageIcon(url)).getImage()).getScaledInstance(150, 205, java.awt.Image.SCALE_SMOOTH));
			pictureLabel = new JLabel(icon);
			pictureLabel.repaint();
			picturePanel.add(pictureLabel);
		}
	}
	
	public int getValue() {
		return Integer.parseInt(blurTextField.getText());
	}
	
	public void Create() {
		JFrame.setDefaultLookAndFeelDecorated(true);
		//////////////////////////////////////////////////////////////////////////////  alocari
		frame = new JFrame("A JFrame");
		
		mainPanel = new JPanel(); 
		biggerPanel = new JPanel();
			mainPanel.setLayout(new CardLayout());		
		menuPanel = new JPanel(); 
		effectsPanel = new JPanel();
		adjustmentPanel = new JPanel();
		tonePanel = new JPanel();
		drawPanel = new JPanel();
		optionsPanel = new JPanel();
		picturePanel = new JPanel();
		
		Border b1 = new BevelBorder(BevelBorder.LOWERED, Color.LIGHT_GRAY, Color.DARK_GRAY);
	    Border b2 = new LineBorder(Color.GRAY, 10);
	    Border b3 = new BevelBorder(BevelBorder.LOWERED, Color.LIGHT_GRAY, Color.DARK_GRAY);
	    Border bTemp = new CompoundBorder(b1, b2);
	    Border b = new CompoundBorder(bTemp, b3);
	    
		//picturePanel.setBorder(new LineBorder(Color.GREEN, 12));
		
		//inserez poza 
		icon = new ImageIcon(((new ImageIcon(url)).getImage()).getScaledInstance(150, 205, java.awt.Image.SCALE_SMOOTH));
		pictureLabel = new JLabel(icon);	
		picturePanel.setBorder(b);
		
		effectsButton = new JButton("Effects");
	    adjustmentButton = new JButton("Adjustment");
	    toneButton = new JButton("Tone");
	    drawButton = new JButton("Draw");
	    optionsButton = new JButton("Options");
	    resetButton = new JButton("Reset");
	    
	    negativeEffectButton = new JButton("Negative");
	    blackAndWhiteButton = new JButton("BlackAndWhite");	 
	    grayScaleButton = new JButton("GrayScale");
	    
	    horizontalFlipButton = new JButton("HorizontalFlip");
	    verticalFlipButton = new JButton("VerticalFlip");
	    rotateButton = new JButton("Rotate");
	    
	    blurButton = new JButton("Blur");    
		contrastButton = new JButton("Contrast");
	    lightButton = new JButton("Light");
	    
	    changeBorderColorButton = new JButton("ChangeBorderColor");
	    
	    blurTextField = new JTextField(3);
	    contrastTextField = new JTextField(3);
	    lightTextField = new JTextField(3);
	    
	    backToMenuFromEffectsButton = new JButton("BackToMenu");
	    backToMenuFromAdjustmentButton = new JButton("BackToMenu");
	    backToMenuFromToneButton = new JButton("BackToMenu");
	    backToMenuFromDrawButton = new JButton("BackToMenu");
	    backToMenuFromOptionsButton = new JButton("BackToMenu");
	    //////////////////////////////////////////////////////////////////////////////
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setSize(400, 272);
	    frame.setLocation(300,200); 
	    frame.getContentPane().add(biggerPanel);           //adaug mainPanel in frame
	    frame.setVisible(true);
	    frame.setBackground(Color.white);
	    
	    //////////////////////////////////////////////////////////////////////////////
	    
	    //menuPanel.setLayout(new BoxLayout(menuPanel, BoxLayout.X_AXIS));   
	    menuPanel.setLayout(null);
	    effectsPanel.setLayout(null);
	    adjustmentPanel.setLayout(null);
	    tonePanel.setLayout(null);
	    drawPanel.setLayout(null);
	    optionsPanel.setLayout(null);
	    //////////////////////////////////////////////////////////////////////////////
	    
	    effectsButton.setBounds(0, 0, 100, 40);
	    	menuPanel.add(effectsButton);  
	    adjustmentButton.setBounds(0, 40, 100, 40);
	    	menuPanel.add(adjustmentButton);	  
	    toneButton.setBounds(0, 80, 100, 40);
	    	menuPanel.add(toneButton);
	    drawButton.setBounds(0, 120, 100, 40);
	    	menuPanel.add(drawButton);    
	    optionsButton.setBounds(0, 160, 100, 40);	
	    	menuPanel.add(optionsButton);
    	resetButton.setBounds(0, 200, 100, 40);
	    	menuPanel.add(resetButton); 
	    	
	    negativeEffectButton.setBounds(0, 0, 100, 40);	
	    	effectsPanel.add(negativeEffectButton);
	    blackAndWhiteButton.setBounds(0, 40, 100, 40);
	    	effectsPanel.add(blackAndWhiteButton);
    	grayScaleButton.setBounds(0, 80, 100, 40);
    		effectsPanel.add(grayScaleButton);
   		backToMenuFromEffectsButton.setBounds(0, 200, 100, 40);
	    	effectsPanel.add(backToMenuFromEffectsButton);
    	
	    horizontalFlipButton.setBounds(0, 0, 100, 40);
	    	adjustmentPanel.add(horizontalFlipButton);
    	verticalFlipButton.setBounds(0, 40, 100, 40);
	    	adjustmentPanel.add(verticalFlipButton);
	    rotateButton.setBounds(0, 80, 100, 40);
	    	adjustmentPanel.add(rotateButton);
	    backToMenuFromAdjustmentButton.setBounds(0, 200, 100, 40);	
	    	adjustmentPanel.add(backToMenuFromAdjustmentButton);
	    
	    contrastButton.setBounds(0, 0, 100, 40);
	    	tonePanel.add(contrastButton);	    
	   	lightButton.setBounds(0, 40, 100, 40);
	    	tonePanel.add(lightButton);
	    blurButton.setBounds(0, 80, 100, 40);
	    	tonePanel.add(blurButton);	
    	backToMenuFromToneButton.setBounds(0, 200, 100, 40);
	    	tonePanel.add(backToMenuFromToneButton);			
	    
	    backToMenuFromDrawButton.setBounds(0, 200, 100, 40);
	    	drawPanel.add(backToMenuFromDrawButton);
	    	
    	changeBorderColorButton.setBounds(0, 0, 100, 40);
    		optionsPanel.add(changeBorderColorButton);
    	backToMenuFromOptionsButton.setBounds(0, 200, 100, 40);
	    	optionsPanel.add(backToMenuFromOptionsButton);	    	
    	
    	contrastTextField.setBounds(100, 0, 100, 40);	
	    	tonePanel.add(contrastTextField);	
    	lightTextField.setBounds(100, 40, 100, 40);	
	    	tonePanel.add(lightTextField);	
	    blurTextField.setBounds(100, 80, 100, 40);	
	    	tonePanel.add(blurTextField);	
    
	    //////////////////////////////////////////////////////////////////////////////
	    	
	    biggerPanel.setLayout(new BoxLayout(biggerPanel, BoxLayout.X_AXIS));
	    	biggerPanel.add(mainPanel);
	    	biggerPanel.add(picturePanel);	
	    	
	    mainPanel.add(menuPanel, "menuPanel");                      //panel ul pentru meniu
	    mainPanel.add(effectsPanel, "effectsPanel");                //panel ul pentru efecete
	    mainPanel.add(adjustmentPanel, "adjustmentPanel");			//panel ul pentru ajustari
	    mainPanel.add(tonePanel, "tonePanel");  					//panel pentru ton uri de blur, lumina etc
	    mainPanel.add(drawPanel, "drawPanel");
	    mainPanel.add(optionsPanel, "optionsPanel");
	    picturePanel.add(pictureLabel);
	    
	    //////////////////////////////////////////////////////////////////////////////
	    
	    effectsButton.addActionListener(new GoToEffectsPanel());
	    	negativeEffectButton.addActionListener(new NegativeEffect());
	    	blackAndWhiteButton.addActionListener(new BlackAndWhiteEffect());
	    	grayScaleButton.addActionListener(new GrayScaleEffect());
	    	backToMenuFromEffectsButton.addActionListener(new GoToMenuPanel());
	    adjustmentButton.addActionListener(new GoToAdjustmentPanel());	
	    	horizontalFlipButton.addActionListener(new HorizontalFlipEffect());
	    	verticalFlipButton.addActionListener(new VerticalFlipEffect());
	    	backToMenuFromAdjustmentButton.addActionListener(new GoToMenuPanel());
	    toneButton.addActionListener(new GoToTonePanel());
	    	blurButton.addActionListener(new BlurEffect());
	    	lightButton.addActionListener(new LightEffect());
	    	contrastButton.addActionListener(new ContrastEffect());
	    	backToMenuFromToneButton.addActionListener(new GoToMenuPanel());
	    drawButton.addActionListener(new GoToDrawPanel());
	    	backToMenuFromDrawButton.addActionListener(new GoToMenuPanel());
    	optionsButton.addActionListener(new GoToOptionsPanel());
    		changeBorderColorButton.addActionListener(new ChangeBorderColorEffect());
	    	backToMenuFromOptionsButton.addActionListener(new GoToMenuPanel());	
	    resetButton.addActionListener(new Reset());
	    //frame.setLayout(null);    //de ce nu trebuie folosita aici????                    
	}
	
}
