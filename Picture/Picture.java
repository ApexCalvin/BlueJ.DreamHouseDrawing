
/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 1.1  (24 May 2001)
 */
public class Picture
{
    public rectangleTest wall;
    public Square window;
    public Triangle roof;
    public Triangle roof2;
    public Triangle roofWindow;
    public Circle sun;
    public Circle sun2;
    public rectangleTest sky;
    public rectangleTest ground;
    public rectangleTest fireplace;
    public rectangleTest door;
    public Triangle flame1;
    public Triangle flame2;
    public Triangle flame3;
    public Triangle flame4;
    public Circle head;
    public Triangle legs;
    public rectangleTest torso;
    public rectangleTest arms;
    public Circle eye1;
    public Circle eye2;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        sky = new rectangleTest();
        sky.changeColor("black");
        sky.changeWidth(300);
        sky.changeHeight(300);
        sky.xPosition = 0;
        sky.yPosition = 0;
        sky.makeVisible();
        
        ground = new rectangleTest();
        ground.makeVisible();
        ground.changeColor("green");
        ground.xPosition = 0;
        ground.yPosition = 200;
        ground.changeHeight(150);
        ground.changeWidth(300);
        
        legs = new Triangle();
        legs.changeColor("black");
        legs.changeSize(15, 32);
        legs.xPosition = 194;
        legs.yPosition = 256;
        legs.makeVisible();
        
        torso = new rectangleTest();
        torso.makeVisible();
        torso.changeColor("black");
        torso.xPosition = 190;
        torso.yPosition = 230;
        torso.changeHeight(40);
        torso.changeWidth(10);
        
        arms = new rectangleTest();
        arms.makeVisible();
        arms.changeColor("black");
        arms.xPosition = 180;
        arms.yPosition = 237;
        arms.changeHeight(8);
        arms.changeWidth(32);
        
        head = new Circle();
        head.changeColor("black");
        head.xPosition = 184;
        head.yPosition = 215;
        head.changeSize(22);
        head.makeVisible();
        
        eye1 = new Circle();
        eye1.changeColor("green");
        eye1.xPosition = 196;
        eye1.yPosition = 222;
        eye1.changeSize(4);
        eye1.makeVisible();
        
        eye2 = new Circle();
        eye2.changeColor("green");
        eye2.xPosition = 201;
        eye2.yPosition = 222;
        eye2.changeSize(4);
        eye2.makeVisible();
    
        fireplace = new rectangleTest();
        fireplace.makeVisible();
        fireplace.changeColor("black");
        fireplace.xPosition = 220;
        fireplace.yPosition = 250;
        fireplace.changeHeight(15);
        fireplace.changeWidth(45);
        
        flame1 = new Triangle();
        flame1.changeColor("red");
        flame1.changeSize(50, 30);
        flame1.xPosition = 230;
        flame1.yPosition = 200;
        flame1.makeVisible();
        
        flame2 = new Triangle();
        flame2.changeColor("red");
        flame2.changeSize(50, 30);
        flame2.xPosition = 250;
        flame2.yPosition = 200;
        flame2.makeVisible();
        
        flame3 = new Triangle();
        flame3.changeColor("red");
        flame3.changeSize(70, 20);
        flame3.xPosition = 240;
        flame3.yPosition = 180;
        flame3.makeVisible();
        
        flame4 = new Triangle();
        flame4.changeColor("yellow");
        flame4.changeSize(60, 24);
        flame4.xPosition = 240;
        flame4.yPosition = 195;
        flame4.makeVisible();
        
        wall = new rectangleTest();
        wall.makeVisible();
        wall.changeColor("blue");
        wall.xPosition = 44;
        wall.yPosition = 205;
        wall.changeHeight(50);
        wall.changeWidth(120);

        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(20);
        window.moveVertical(100);
        window.makeVisible();

        roof = new Triangle();
        roof.changeColor("magenta");
        roof.changeSize(200, 120);
        roof.xPosition = 104;
        roof.yPosition = 10;
        roof.makeVisible();
        
        roof2 = new Triangle();
        roof2.changeColor("blue");
        roof2.changeSize(150, 120);
        roof2.xPosition = 104;
        roof2.yPosition = 60;
        roof2.makeVisible();
        
        roofWindow = new Triangle();
        roofWindow.changeColor("black");
        roofWindow.changeSize(40, 25);
        roofWindow.xPosition = 104;
        roofWindow.yPosition = 150;
        roofWindow.makeVisible();
        
        door = new rectangleTest();
        door.makeVisible();
        door.changeColor("magenta");
        door.xPosition = 58;
        door.yPosition = 221;
        door.changeHeight(35);
        door.changeWidth(25);
        
        sun2 = new Circle();
        sun2.changeColor("magenta");
        sun2.moveHorizontal(185);
        sun2.moveVertical(-15);
        sun2.changeSize(60);
        sun2.makeVisible();

        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(180);
        sun.moveVertical(-10);
        sun.changeSize(60);
        sun.makeVisible();
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }

}
