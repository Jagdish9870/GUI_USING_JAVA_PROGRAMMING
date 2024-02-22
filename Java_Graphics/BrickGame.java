
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
class BricksHere{
    public int BArr[][];
    public int BrickWidth;
    public int BrickHeight;

    public BricksHere(int row , int col){
        BArr=new int[row][col];
        for (int i=0; i<row; i++){
            for(int j=0;j<col; j++){
                BArr[i][j]=1;

        }
    }
    BrickWidth=600/col;
    BrickHeight=250/row;

}
    public void setBrick(int value,int r, int c){
        BArr[r][c]=value;

    }
    public void draw(Graphics2D g){


        for(int i=0;i<BArr.length;i++){
            for(int j=0;j<BArr[0].length;j++){
                if(BArr[i][j]>0){
                    g.setColor(Color.white);
                    g.fillRect(j*BrickWidth+50, i*BrickHeight+50, BrickWidth, BrickHeight);


                    g.setColor(Color.black);
                    g.setStroke(new BasicStroke(3));
                    g.drawRect(j*BrickWidth+50, i*BrickHeight+50, BrickWidth, BrickHeight);

                }
            }
        }
    }
}


class BrickBreaker extends JPanel implements ActionListener,KeyListener {
    
    
    private boolean play = false;
    private int totalBricks = 28;
    private int score = 0;
    private Timer timer;
    private int delay=8;
    private int ballposX= 50;
    private int ballposY=350;
    private int ballXdir=-1;
    private int ballYdir=-2;
    private int playerX=350;
    private BricksHere bh;


    public BrickBreaker(){
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(true);
        timer= new Timer(delay, this);
        timer.start();
        bh= new BricksHere(4,7);


    }
    public void paint (Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(1,1,700,500);


        // border
        g.setColor(Color.YELLOW);
        g.fillRect(0, 0, 700, 5);
        g.fillRect(0,5, 5, 500);
        g.fillRect(695, 5, 5, 500);


        //paddle

        g.setColor(Color.DARK_GRAY);
        g.fillRect(playerX, 430, 150, 20);

        //ball
        g.setColor(Color.WHITE);
        g.fillOval(ballposX,ballposY, 30, 30);


        //bricks 
        bh.draw((Graphics2D) g);

        //score
        g.setColor(Color.green);
        g.setFont(new Font("serif", Font.BOLD, 30));
        g.drawString("score :-> "+score, 250, 30);



        //gameover

        if(ballposY>=470){
            play=false;
            ballXdir=0;
            ballYdir=0;
            g.setColor(Color.RED);
            g.setFont(new Font("Times New Roman", Font.BOLD, 50));
            g.drawString("Game Over!"+score, 250, 200);

            g.setFont(new Font("serif",Font.BOLD,25));
			g.drawString("Press Enter to Restart!!", 230, 350);



            

        }
        if(totalBricks<=0) {
			
			play=false;
			ballXdir=0;
			ballYdir=0;
			
			g.setColor(Color.green);
			g.setFont(new Font("serif",Font.BOLD,30));
			g.drawString("You Won!!, Score : "+score, 200, 300);
			
			g.setFont(new Font("serif",Font.BOLD,25));
			g.drawString("Press Enter to Restart!!", 230, 350);
			
			
		}
 

    }
  // for moving paddle into left direction  
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode()==KeyEvent.VK_LEFT)
        {  
            if(playerX<=5){
                playerX=5;
            }
            else{

                moveLeft();
            }

        }
// for moving paddle into right direction
        if(e.getKeyCode()==KeyEvent.VK_RIGHT)
        {
           
            if(playerX>=545)
            {
                playerX = 545;

            }
            else{
                    moveRight();
            }
        }
        if(e.getKeyCode()==KeyEvent.VK_ENTER) {
			if(!play) {
				score=0;
				totalBricks=21;
				ballposX=120;
				ballposY=350;
				ballXdir=-1;
				ballYdir=-2;
				playerX=320;
				
				bh=new BricksHere(4,7);
				
			}
		}  
        
        repaint();
    }
    private void moveRight() {
        play=true;
        playerX += 20;

       
    }
    private void moveLeft() {
        play=true;
        playerX -=20;
       
    }
    public void actionPerformed(ActionEvent e) {

        if(play){
            if(ballposX<=0){
                ballXdir=-ballXdir;
            }
            if(ballposY<=0){
                ballYdir=-ballYdir;
            }
            if(ballposX>=670){
                ballXdir=-ballXdir;

            }
            Rectangle ballrect= new Rectangle(ballposX, ballposY, 30,30);
            Rectangle padRec=new Rectangle(playerX, 430,150,20);
            
            if (ballrect.intersects(padRec)) {
                ballYdir=-ballYdir;


            }
            A:for(int i=0;i<bh.BArr.length;i++) {
				for(int j=0;j<bh.BArr[i].length;j++)
				{
					if(bh.BArr[i][j]>0) {
						
						int width=bh.BrickWidth;
						int height=bh.BrickHeight;
						int brickXpos=50+j*width;
						int brickYpos=50+i*height;
						
						Rectangle brickRect=new Rectangle(brickXpos,brickYpos,width,height);
						
						if(ballrect.intersects(brickRect)) {
							
							bh.setBrick(0, i, j);
							totalBricks--;
							score+=5;
						
							if(ballposX+19<=brickXpos || ballposX+1>=brickXpos+width) {
								ballXdir=-ballXdir;
							}
							else {
								ballYdir=-ballYdir;
							}
							
							
							
							break A;
							
						}
						
					}
				}
			}
          

            ballposX+=ballXdir;
            ballposY+=ballYdir;
        }
        repaint();
       
    }
   
    public void keyTyped(KeyEvent e) {}
    public void keyReleased(KeyEvent e) {}
}

public class BrickGame {
    public static void main(String[] args) {

        JFrame jf= new JFrame("BrickBreaker");
        jf.setSize(715,500);
        jf.setLocationRelativeTo(null);
       // jf.setResizable(false);
       
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        BrickBreaker brickbreaker = new BrickBreaker(); 
        jf.add(brickbreaker);
        jf.setVisible(true);

        
    }
}

