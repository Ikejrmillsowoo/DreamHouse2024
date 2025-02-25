package rocks.zipcode.dreamhouse;

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
    private Square wall;
    private Square biggerWall;
    private Square window;
    private Square window2;
    private Square bigWindow;
    private Square bigWindow2;
    private Square bigDoor;
    private Square door;
    private Square lawn;
    private Square canvas;
    private Square biggerWall2;
    private Square driveWay;
    private Triangle roof;
    private Triangle innerRoof;
    private Triangle topRoof;
    private Circle sun;


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
        canvas = new Square();
        canvas.moveVertical(-100);
        canvas.moveHorizontal(-150);
        canvas.changeSize(1200);
        canvas.makeVisible();
        canvas.changeColor("cyan");

        lawn = new Square();
        lawn.moveVertical(280);
        lawn.moveHorizontal(-80);
        lawn.changeSize(900);
        lawn.makeVisible();
        lawn.changeColor("green");

        biggerWall2 = new Square();
        biggerWall2.moveVertical(140);
        biggerWall2.changeSize(140);
        biggerWall2.makeVisible();
        biggerWall2.moveHorizontal(220);
        biggerWall2.changeColor("blue");

        //third roof - biggest roof
        innerRoof = new Triangle();
        innerRoof.changeSize(90, 155);
        innerRoof.moveHorizontal(300);
        innerRoof.moveVertical(90);
        innerRoof.makeVisible();
        innerRoof.changeColor("magenta");

        wall = new Square();
        wall.changeColor("white");
        wall.makeVisible();
        wall.moveHorizontal(250);



        wall = new Square();
        wall.moveVertical(180);
        wall.changeSize(100);
        wall.makeVisible();
        wall.changeColor("blue");

        biggerWall = new Square();
        biggerWall.moveVertical(160);
        biggerWall.changeSize(120);
        biggerWall.makeVisible();
        biggerWall.moveHorizontal(100);
        biggerWall.changeColor("blue");


        window = new Square();
        window.changeColor("white");
        window.moveHorizontal(10);
        window.moveVertical(200);
        window.makeVisible();
        window.changeSize(35);

        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(10);
        window.moveVertical(200);
        window.makeVisible();

        window2 = new Square();
        window2.changeColor("white");
        window2.moveHorizontal(60);
        window2.moveVertical(200);
        window2.makeVisible();
        window2.changeSize(35);

        window2 = new Square();
        window2.changeColor("black");
        window2.moveHorizontal(60);
        window2.moveVertical(200);
        window2.makeVisible();

        bigWindow = new Square();
        bigWindow.changeColor("white");
        bigWindow.moveHorizontal(105);
        bigWindow.moveVertical(175);
        bigWindow.changeSize(50);
        bigWindow.makeVisible();

        bigWindow = new Square();
        bigWindow.changeColor("black");
        bigWindow.moveHorizontal(105);
        bigWindow.moveVertical(175);
        bigWindow.changeSize(45);
        bigWindow.makeVisible();

        bigWindow2 = new Square();
        bigWindow2.changeColor("white");
        bigWindow2.moveHorizontal(165);
        bigWindow2.moveVertical(175);
        bigWindow2.changeSize(50);
        bigWindow2.makeVisible();

        bigWindow2 = new Square();
        bigWindow2.changeColor("black");
        bigWindow2.moveHorizontal(165);
        bigWindow2.moveVertical(175);
        bigWindow2.changeSize(45);
        bigWindow2.makeVisible();

        //windows to main house
        bigWindow2 = new Square();
        bigWindow2.changeColor("white");
        bigWindow2.moveHorizontal(265);
        bigWindow2.moveVertical(175);
        bigWindow2.changeSize(60);
        bigWindow2.makeVisible();

        bigWindow2 = new Square();
        bigWindow2.changeColor("black");
        bigWindow2.moveHorizontal(265);
        bigWindow2.moveVertical(175);
        bigWindow2.changeSize(55);
        bigWindow2.makeVisible();

        door = new Square();
        door.changeColor("black");
        door.moveHorizontal(40);
        door.moveVertical(255);
        door.changeSize(25);
        door.makeVisible();

        bigDoor = new Square();
        bigDoor.changeColor("black");
        bigDoor.moveHorizontal(140);
        bigDoor.moveVertical(240);
        bigDoor.changeSize(40);
        bigDoor.makeVisible();

        roof = new Triangle();
        roof.changeSize(50, 115);
        roof.moveHorizontal(60);
        roof.moveVertical(165);
        roof.makeVisible();
        roof.changeColor("magenta");

        topRoof = new Triangle();
        topRoof.changeSize(60, 140);
        topRoof.moveHorizontal(170);
        topRoof.moveVertical(135);
        topRoof.makeVisible();
        topRoof.changeColor("magenta");

        sun = new Circle();
        sun.changeColor("red");
        sun.moveHorizontal(10);
        sun.moveVertical(-30);
        sun.changeSize(50);
        sun.makeVisible();
        sun.changeColor("yellow");

        sun = new Circle();
        sun.changeColor("black");
        sun.moveHorizontal(65);
        sun.moveVertical(270);
        sun.changeSize(200);
        sun.makeVisible();

        sun = new Circle();
        sun.changeColor("darkGray");
        sun.moveHorizontal(130);
        sun.moveVertical(310);
        sun.changeSize(70);
        sun.makeVisible();

        driveWay = new Square();
        driveWay.changeColor("black");
        driveWay.moveHorizontal(150);
        driveWay.moveVertical(280);
        driveWay.changeSize(30);
        driveWay.makeVisible();

        driveWay = new Square();
        driveWay.changeColor("black");
        driveWay.moveHorizontal(180);
        driveWay.moveVertical(280);
        driveWay.changeSize(30);
        driveWay.makeVisible();

        driveWay = new Square();
        driveWay.changeColor("black");
        driveWay.moveHorizontal(210);
        driveWay.moveVertical(280);
        driveWay.changeSize(30);
        driveWay.makeVisible();

        driveWay = new Square();
        driveWay.changeColor("black");
        driveWay.moveHorizontal(240);
        driveWay.moveVertical(280);
        driveWay.changeSize(30);
        driveWay.makeVisible();

        driveWay = new Square();
        driveWay.changeColor("black");
        driveWay.moveHorizontal(270);
        driveWay.moveVertical(280);
        driveWay.changeSize(30);
        driveWay.makeVisible();

        driveWay = new Square();
        driveWay.changeColor("black");
        driveWay.moveHorizontal(300);
        driveWay.moveVertical(280);
        driveWay.changeSize(30);
        driveWay.makeVisible();

        driveWay = new Square();
        driveWay.changeColor("black");
        driveWay.moveHorizontal(330);
        driveWay.moveVertical(280);
        driveWay.changeSize(30);
        driveWay.makeVisible();

        driveWay = new Square();
        driveWay.changeColor("black");
        driveWay.moveHorizontal(120);
        driveWay.moveVertical(280);
        driveWay.changeSize(30);
        driveWay.makeVisible();

        sun = new Circle();
        sun.changeColor("green");
        sun.moveHorizontal(90);
        sun.moveVertical(300);
        sun.changeSize(20);
        sun.makeVisible();

        sun = new Circle();
        sun.changeColor("green");
        sun.moveHorizontal(70);
        sun.moveVertical(370);
        sun.changeSize(20);
        sun.makeVisible();

        sun = new Circle();
        sun.changeColor("green");
        sun.moveHorizontal(240);
        sun.moveVertical(370);
        sun.changeSize(20);
        sun.makeVisible();

        sun = new Circle();
        sun.changeColor("green");
        sun.moveHorizontal(220);
        sun.moveVertical(300);
        sun.changeSize(20);
        sun.makeVisible();

        sun = new Circle();
        sun.changeColor("red");
        sun.moveHorizontal(230);
        sun.moveVertical(420);
        sun.changeSize(20);
        sun.makeVisible();

        sun = new Circle();
        sun.changeColor("red");
        sun.moveHorizontal(90);
        sun.moveVertical(420);
        sun.changeSize(20);
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
            biggerWall.changeColor("black");
            window.changeColor("white");
            window2.changeColor("white");
            bigWindow.changeColor("white");
            bigWindow2.changeColor("white");
            driveWay.changeColor("white");
            bigDoor.changeColor("white");
            biggerWall2.changeColor("white");
            door.changeColor("white");
            roof.changeColor("black");
            innerRoof.changeColor("black");
            topRoof.changeColor("black");
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
            biggerWall.changeColor("blue");
            window.changeColor("black");
            window2.changeColor("black");
            bigWindow.changeColor("white");
            bigWindow2.changeColor("white");
            biggerWall2.changeColor("white");
            bigDoor.changeColor("white");
            driveWay.changeColor("white");
            door.changeColor("white");
            canvas.changeColor("white");
            lawn.changeColor("green");
            roof.changeColor("green");
            innerRoof.changeColor("blue");
            topRoof.changeColor("blue");
            sun.changeColor("yellow");
        }
    }

}
