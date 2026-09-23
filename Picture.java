/**
 * This picture shows a peaceful night with a dark starlit sky,a couple trees,
 * a bright moon, and a person enjoying the beautiful night sky :))
 * 
 * 
 *
 * @author Fatimah Salih 
 * @version 09.21.2026
 */
public class Picture
{
    private Square sky;
    private Square ground;
    private Square trunk1;
    private Square trunk2;
    private Square trunk3;
    
    private Triangle tree1;
    private Triangle tree2;
    private Triangle tree3;
    
    private Circle moon;
    private Circle star1;
    private Circle star2;
    private Circle star3;
    private Circle star4;
    private Circle star5;
    private Circle star6;
    private Circle star7;
    private Circle star8;
    
    private Person person;
    
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        sky = new Square();
        ground = new Square();
        tree1 = new Triangle();
        tree2 = new Triangle();
        tree3 = new Triangle();
        trunk1 = new Square();
        trunk2 = new Square();
        trunk3 = new Square ();
        moon = new Circle();
        star1 = new Circle();
        star2 = new Circle();
        star3 = new Circle();
        star4 = new Circle();
        star5 = new Circle();
        star6 = new Circle();
        star7 = new Circle();
        star8 = new Circle();
        
        person = new Person();
        
        drawn = false;
    }

    /**
     * Now draw the picture 
     */
    public void draw()
    {
        if(!drawn) {
            //This will be the night sky
            sky.changeColor("blue");
            sky.moveHorizontal(-310);
            sky.moveVertical(-120);
            sky.changeSize(1000);
            sky.makeVisible();
            
            //This will be the ground
            ground.changeColor("green");
            ground.moveHorizontal(-310);
            ground.moveVertical(100);
            ground.changeSize(500);
            ground.makeVisible();
            
            //The moon
            moon.changeColor("yellow");
            moon.moveHorizontal(-40);
            moon.moveVertical(-70);
            moon.changeSize(60);
            moon.makeVisible();
            
            //These will be the stars
            star1.changeColor("yellow");
            star1.moveHorizontal(-160);
            star1.moveVertical(-20);
            star1.changeSize(8);
            star1.makeVisible();
            
            star2.changeColor("yellow");
            star2.moveHorizontal(-100);
            star2.moveVertical(20);
            star2.changeSize(10);
            star2.makeVisible();
            
            star3.changeColor("yellow");
            star3.moveHorizontal(20);
            star3.moveVertical(-10);
            star3.changeSize(7);
            star3.makeVisible();
            
            star4.changeColor("yellow");
            star4.moveHorizontal(130);
            star4.moveVertical(10);
            star4.changeSize(9);
            star4.makeVisible();
            
            star5.changeColor("yellow");
            star5.moveHorizontal(-120);
            star5.moveVertical(-30);
            star5.changeSize(6);
            star5.makeVisible();
            
            star6.changeColor("yellow");
            star6.moveHorizontal(70);
            star6.moveVertical(20);
            star6.changeSize(8);
            star6.makeVisible();
            
            star7.changeColor("yellow");
            star7.moveHorizontal(180);
            star7.moveVertical(-30);
            star7.changeSize(6);
            star7.makeVisible();
            
            star8.changeColor("yellow");
            star8.moveHorizontal(220);
            star8.moveVertical(30);
            star8.changeSize(7);
            star8.makeVisible();
            
            //The trunks
            trunk1.changeColor("brown");
            trunk1.moveHorizontal(-245);
            trunk1.moveVertical(115);
            trunk1.changeSize(30);
            trunk1.makeVisible();
            
            trunk2.changeColor("brown");
            trunk2.moveHorizontal(-105);
            trunk2.moveVertical(150);
            trunk2.changeSize(30);
            trunk2.makeVisible();
            
            trunk3.changeColor("brown");
            trunk3.moveHorizontal(35);
            trunk3.moveVertical(120);
            trunk3.changeSize(30);
            trunk3.makeVisible();
            
            //The trees
            tree1.changeColor("black");
            tree1.moveHorizontal(-130);
            tree1.moveVertical(-5);
            tree1.changeSize(110,85);
            tree1.makeVisible();
            
            tree2.changeColor("black");
            tree2.moveHorizontal(10);
            tree2.moveVertical(10);
            tree2.changeSize(130,100);
            tree2.makeVisible();
            
            tree3.changeColor("black");
            tree3.moveHorizontal(150);
            tree3.moveVertical(5);
            tree3.changeSize(105,80);
            tree3.makeVisible();
            
            //This will be the person
            person.moveHorizontal(-135);
            person.moveVertical(-21);
            person.changeSize(80,35);
            person.makeVisible();
            
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        sky.changeColor("grey");
        ground.changeColor("white");
        tree1.changeColor("black");
        tree2.changeColor("black");
        tree3.changeColor("black");
        trunk1.changeColor("grey");
        trunk2.changeColor("grey");
        trunk3.changeColor("grey");
        moon.changeColor("white");
        star1.changeColor("white");
        star2.changeColor("white");
        star3.changeColor("white");
        star4.changeColor("white");
        star5.changeColor("white");
        star6.changeColor("white");
        star7.changeColor("white");
        star8.changeColor("white");
        person.changeColor("white");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        sky.changeColor("blue");
        ground.changeColor("green");
        tree1.changeColor("black");
        tree2.changeColor("black");
        tree3.changeColor("black");
        trunk1.changeColor("brown");
        trunk2.changeColor("brown");
        trunk3.changeColor("brown");
        moon.changeColor("yellow");
        star1.changeColor("yellow");
        star2.changeColor("yellow");
        star3.changeColor("yellow");
        star4.changeColor("white");
        star5.changeColor("white");
        star6.changeColor("white");
        star7.changeColor("white");
        star8.changeColor("white");
        person.changeColor("black");
    }
}
