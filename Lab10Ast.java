// Lab10Ast.java
// This is the student, starting file of Lab 10A which draws a title page and 3 flags.
// Students need to create 16 more flags.  They will not know which flags these are ahead of time.
// Students start with a grade of 30.  Each flag will be worth 5 points for a maximum grade of 110.

import javax.swing.*;
import java.awt.*;
import java.applet.*;

public class Lab10Ast extends Applet
{
    private static int numDots, speed;
    private static Font countryName;

    public void init()
    {
        speed = enterIntGUI("Enter Execution Type: \n 1 = Giant Dots \n 2 = Big Dots \n 3 = Small Dots \n 4 = Tiny Dots\n\nNOTE: Enter 1 when getting lab graded.");
        switch (speed)
        {
            case 1  : numDots =   10000; break;
            case 2  : numDots =  100000; break;
            case 3  : numDots = 1000000; break;
            case 4  : numDots = 5000000; break;
            default : numDots =   10000;
        }
        countryName = new Font("Algerian",Font.BOLD,48);
    }

    public void paint(Graphics g)
    {
        titlePage(g,"Shane Staley",7);
        flagOfLibya(g);
        flagOfMonaco(g);
        flagOfItaly(g);
        flagOfIreland(g);
        flagOfFrance(g);
        flagOfRomania(g);
        flagOfBelgium(g);
        flagOfMali(g);
        flagOfGuinea(g);
        flagOfNewfoundland(g);
        flagOfPeru(g);
        flagOfNigeria(g);
        flagOfHolland(g);
        flagOfHungary(g);
        flagOfGermany(g);
        flagOfRussia(g);
        flagOfSerbia(g);
        flagOfEstonia(g);
        flagOfLithuana(g);
        flagOfAustria(g);
        flagOfArgentina(g);
        flagOfBariya(g);
    }

    public static int enterIntGUI(String prompt)  // Allows GUI keyboard input of an integer in a graphics program.
    {
        String tempString = JOptionPane.showInputDialog(prompt);
        int temp = Integer.parseInt(tempString);
        return temp;
    }

    public static void drawDot(Graphics g, int x, int y)
    {
        switch (speed)
        {
            case 1  : Expo.fillRectangle(g,x-5,y-5,x+5,y+5); break;
            case 2  : Expo.fillRectangle(g,x-2,y-2,x+2,y+2); break;
            case 3  : Expo.fillRectangle(g,x,y,x+1,y+1); break;
            case 4  : Expo.drawPixel(g,x,y); break;
            default : Expo.fillRectangle(g,x-5,y-5,x+5,y+5);
        }
    }

    public static void titlePage(Graphics g, String name, int period)
    {
        Expo.setBackground(g,Expo.gold);
        Expo.setColor(g,Expo.white);
        Expo.fillRectangle(g,100,100,900,550);
        Expo.setColor(g,Expo.red);
        Font title = new Font("Algerian",Font.BOLD,48);
        g.setFont(title);
        g.drawString("Flags of the World",225,240);
        Expo.setColor(g,Expo.blue);
        g.drawString("by: "+name,225,340);
        Expo.setColor(g,Expo.green);
        g.drawString("Period: "+period,225,440);
        Expo.delay(3000);                         // Wait 3 second before showing first flag.
    }

    public static void showName(Graphics g, String name)
    {
        FontMetrics metrics = g.getFontMetrics(countryName);
        int nameWidth = metrics.stringWidth(name);
        int boxWidth  = nameWidth + 20;
        int xName = 950 - nameWidth;
        int xBox  = xName - 10;
        Expo.setColor(g,Expo.white);
        Expo.fillRectangle(g,xBox,50,xBox+boxWidth,120);
        Expo.setColor(g,Expo.black);
        Expo.drawRectangle(g,xBox,50,xBox+boxWidth,120);
        for (int j = 1; j <= 5; j++)
        {
            Expo.drawLine(g,xBox+j,120+j,xBox+boxWidth+j,120+j);
            Expo.drawLine(g,xBox+boxWidth+j,50+j,xBox+boxWidth+j,120+j);
        }
        Expo.drawRectangle(g,xBox+1,51,xBox+boxWidth+1,121);
        g.setFont(countryName);
        g.drawString(name,xName,100);
        Expo.delay(2000);                         // Wait 2 second before showing next flag.
    }

    public static void fiftyStars(Graphics g)     // provided for the USA Flag
    {
        // 30 Stars  (5 rows of 6)
        for (int x = 35; x < 420; x += 70)
            for (int y = 35; y < 350; y += 70)
                Expo.fillStar(g,x,y,20,5);

        // 20 Stars  (4 rows of 5)
        for (int x = 70; x <= 350; x += 70)
            for (int y = 70; y <= 280; y += 70)
                Expo.fillStar(g,x,y,20,5);
    }

    public static void flagOfLibya (Graphics g)
    {
        Expo.setBackground(g,Expo.black);
        for (int d = 1; d <= numDots; d++)
        {
            int x = Expo.random(0,1000);       // random x value of each dot
            int y = Expo.random(0,650);        // random y value of each dot

            Expo.setColor(g,Expo.green);       // The Libyan flag is the simplest in the world.
                                               // It is a solid green rectangle.
            drawDot(g,x,y);
        }
        showName(g,"Libya");
    }

    public static void flagOfMonaco (Graphics g)
    {
        Expo.setBackground(g,Expo.black);
        for (int d = 1; d <= numDots; d++)
        {
            int x = Expo.random(0,1000);       // random x value of each dot
            int y = Expo.random(0,650);        // random y value of each dot

            if (y < 325)                       // top stripe
                Expo.setColor(g,Expo.red);
            else                          // bottom stripe
                Expo.setColor(g,Expo.white);

            drawDot(g,x,y);
        }
        showName(g,"Monaco");
    }

    public static void flagOfItaly (Graphics g)
    {
        Expo.setBackground(g,Expo.black);
        for (int d = 1; d <= numDots; d++)
        {
            int x = Expo.random(0,1000);       // random x value of each dot
            int y = Expo.random(0,650);        // random y value of each dot

            if (x < 333)                       // left stripe
                Expo.setColor(g,Expo.green);

            if (x >= 333 && x < 667)           // middle stripe requires compound condition
                Expo.setColor(g,Expo.white);

            if (x >= 667)                      // right stripe
                Expo.setColor(g,Expo.red);

            drawDot(g,x,y);
        }
        showName(g,"Italy");
    }

    public static void flagOfIreland (Graphics g)
    {
        Expo.setBackground(g,Expo.black);
        for (int d = 1; d <= numDots; d++)
        {
            int x = Expo.random(0,1000);       // random x value of each dot
            int y = Expo.random(0,650);        // random y value of each dot

            if (x < 333)                       // left stripe
                Expo.setColor(g,Expo.green);

            if (x >= 333 && x < 667)           // middle stripe requires compound condition
                Expo.setColor(g,Expo.white);

            if (x >= 667)                      // right stripe
                Expo.setColor(g,Expo.orange);

            drawDot(g,x,y);
        }
        showName(g,"Ireland");
    }
    
    public static void flagOfFrance (Graphics g)
    {
        Expo.setBackground(g,Expo.black);
        for (int d = 1; d <= numDots; d++)
        {
            int x = Expo.random(0,1000);       // random x value of each dot
            int y = Expo.random(0,650);        // random y value of each dot

            if (x < 333)                       // left stripe
                Expo.setColor(g,Expo.blue);

            if (x >= 333 && x < 667)           // middle stripe requires compound condition
                Expo.setColor(g,Expo.white);

            if (x >= 667)                      // right stripe
                Expo.setColor(g,Expo.red);

            drawDot(g,x,y);
        }
        showName(g,"France");
    }
    
    public static void flagOfRomania (Graphics g)
    {
        Expo.setBackground(g,Expo.black);
        for (int d = 1; d <= numDots; d++)
        {
            int x = Expo.random(0,1000);       // random x value of each dot
            int y = Expo.random(0,650);        // random y value of each dot

            if (x < 333)                       // left stripe
                Expo.setColor(g,Expo.blue);

            if (x >= 333 && x < 667)           // middle stripe requires compound condition
                Expo.setColor(g,Expo.yellow);

            if (x >= 667)                      // right stripe
                Expo.setColor(g,Expo.red);

            drawDot(g,x,y);
        }
        showName(g,"Romania");
    }    
    
    public static void flagOfBelgium (Graphics g)
    {
        Expo.setBackground(g,Expo.white);
        for (int d = 1; d <= numDots; d++)
        {
            int x = Expo.random(0,1000);       // random x value of each dot
            int y = Expo.random(0,650);        // random y value of each dot

            if (x < 333)                       // left stripe
                Expo.setColor(g,Expo.black);

            if (x >= 333 && x < 667)           // middle stripe requires compound condition
                Expo.setColor(g,Expo.yellow);

            if (x >= 667)                      // right stripe
                Expo.setColor(g,Expo.red);

            drawDot(g,x,y);
        }
        showName(g,"Belgium");
    }
    
    public static void flagOfMali (Graphics g)
    {
        Expo.setBackground(g,Expo.black);
        for (int d = 1; d <= numDots; d++)
        {
            int x = Expo.random(0,1000);       // random x value of each dot
            int y = Expo.random(0,650);        // random y value of each dot

            if (x < 333)                       // left stripe
                Expo.setColor(g,Expo.darkGreen);

            if (x >= 333 && x < 667)           // middle stripe requires compound condition
                Expo.setColor(g,Expo.gold);

            if (x >= 667)                      // right stripe
                Expo.setColor(g,Expo.red);

            drawDot(g,x,y);
        }
        showName(g,"Mali");
    }
    
    public static void flagOfGuinea (Graphics g)
    {
        Expo.setBackground(g,Expo.black);
        for (int d = 1; d <= numDots; d++)
        {
            int x = Expo.random(0,1000);       // random x value of each dot
            int y = Expo.random(0,650);        // random y value of each dot

            if (x < 333)                       // left stripe
                Expo.setColor(g,Expo.red);

            if (x >= 333 && x < 667)           // middle stripe requires compound condition
                Expo.setColor(g,Expo.gold);

            if (x >= 667)                      // right stripe
                Expo.setColor(g,Expo.darkGreen);

            drawDot(g,x,y);
        }
        showName(g,"Guinea");
    }
    
    public static void flagOfNewfoundland (Graphics g)
    {
        Expo.setBackground(g,Expo.black);
        for (int d = 1; d <= numDots; d++)
        {
            int x = Expo.random(0,1000);       // random x value of each dot
            int y = Expo.random(0,650);        // random y value of each dot

            if (x < 333)                       // left stripe
                Expo.setColor(g,Expo.darkGreen);

            if (x >= 333 && x < 667)           // middle stripe requires compound condition
                Expo.setColor(g,Expo.white);

            if (x >= 667)                      // right stripe
                Expo.setColor(g,Expo.pink);

            drawDot(g,x,y);
        }
        showName(g,"Newfoundland");
    }
    
    public static void flagOfPeru (Graphics g)
    {
        Expo.setBackground(g,Expo.black);
        for (int d = 1; d <= numDots; d++)
        {
            int x = Expo.random(0,1000);       // random x value of each dot
            int y = Expo.random(0,650);        // random y value of each dot

            if (x < 333)                       // left stripe
                Expo.setColor(g,Expo.darkGreen);

            if (x >= 333 && x < 667)           // middle stripe requires compound condition
                Expo.setColor(g,Expo.white);

            if (x >= 667)                      // right stripe
                Expo.setColor(g,Expo.darkGreen);

            drawDot(g,x,y);
        }
        showName(g,"Peru");
    }
    
    public static void flagOfNigeria (Graphics g)
    {
        Expo.setBackground(g,Expo.black);
        for (int d = 1; d <= numDots; d++)
        {
            int x = Expo.random(0,1000);       // random x value of each dot
            int y = Expo.random(0,650);        // random y value of each dot

            if (x < 333)                       // left stripe
                Expo.setColor(g,Expo.darkGreen);

            if (x >= 333 && x < 667)           // middle stripe requires compound condition
                Expo.setColor(g,Expo.gold);

            if (x >= 667)                      // right stripe
                Expo.setColor(g,Expo.red);

            drawDot(g,x,y);
        }
        showName(g,"Nigeria");
    }
    
    public static void flagOfHolland (Graphics g)
    {
        Expo.setBackground(g,Expo.black);
        for (int d = 1; d <= numDots; d++)
        {
            int x = Expo.random(0,1000);       // random x value of each dot
            int y = Expo.random(0,650);        // random y value of each dot

            if (y < 333)                       // left stripe
                Expo.setColor(g,Expo.red);

            if (y >= 333 && y < 667)           // middle stripe requires compound condition
                Expo.setColor(g,Expo.white);

            if (y >= 667)                      // right stripe
                Expo.setColor(g,Expo.blue);

            drawDot(g,x,y);
        }
        showName(g,"Holland");
    }
    public static void flagOfHungary (Graphics g)
    {
        Expo.setBackground(g,Expo.black);
        for (int d = 1; d <= numDots; d++)
        {
            int x = Expo.random(0,1000);       // random x value of each dot
            int y = Expo.random(0,650);        // random y value of each dot

            if (y < 333)                       // left stripe
                Expo.setColor(g,Expo.darkRed);

            if (y >= 333 && y < 667)           // middle stripe requires compound condition
                Expo.setColor(g,Expo.white);

            if (y >= 667)                      // right stripe
                Expo.setColor(g,Expo.darkGreen);

            drawDot(g,x,y);
        }
        showName(g,"Hungary");
    }
    public static void flagOfGermany (Graphics g)
    {
        Expo.setBackground(g,Expo.black);
        for (int d = 1; d <= numDots; d++)
        {
            int x = Expo.random(0,1000);       // random x value of each dot
            int y = Expo.random(0,650);        // random y value of each dot

            if (y < 333)                       // left stripe
                Expo.setColor(g,Expo.black);

            if (y >= 333 && y < 667)           // middle stripe requires compound condition
                Expo.setColor(g,Expo.red);

            if (y >= 667)                      // right stripe
                Expo.setColor(g,Expo.yellow);

            drawDot(g,x,y);
        }
        showName(g,"Germany");
    }
    public static void flagOfRussia (Graphics g)
    {
        Expo.setBackground(g,Expo.black);
        for (int d = 1; d <= numDots; d++)
        {
            int x = Expo.random(0,1000);       // random x value of each dot
            int y = Expo.random(0,650);        // random y value of each dot

            if (y < 333)                       // left stripe
                Expo.setColor(g,Expo.white);

            if (y >= 333 && y < 667)           // middle stripe requires compound condition
                Expo.setColor(g,Expo.purple);

            if (y >= 667)                      // right stripe
                Expo.setColor(g,Expo.red);

            drawDot(g,x,y);
        }
        showName(g,"Russia");
    }
    public static void flagOfSerbia (Graphics g)
    {
        Expo.setBackground(g,Expo.black);
        for (int d = 1; d <= numDots; d++)
        {
            int x = Expo.random(0,1000);       // random x value of each dot
            int y = Expo.random(0,650);        // random y value of each dot

            if (y < 333)                       // left stripe
                Expo.setColor(g,Expo.blue);

            if (y >= 333 && y < 667)           // middle stripe requires compound condition
                Expo.setColor(g,Expo.white);

            if (y >= 667)                      // right stripe
                Expo.setColor(g,Expo.red);

            drawDot(g,x,y);
        }
        showName(g,"Serbia");
    }
    public static void flagOfEstonia (Graphics g)
    {
        Expo.setBackground(g,Expo.purple);
        for (int d = 1; d <= numDots; d++)
        {
            int x = Expo.random(0,1000);       // random x value of each dot
            int y = Expo.random(0,650);        // random y value of each dot

            if (y < 333)                       // left stripe
                Expo.setColor(g,Expo.blue);

            if (y >= 333 && y < 667)           // middle stripe requires compound condition
                Expo.setColor(g,Expo.black);

            if (y >= 667)                      // right stripe
                Expo.setColor(g,Expo.white);

            drawDot(g,x,y);
        }
        showName(g,"Estonia");
    }
    public static void flagOfLithuana (Graphics g)
    {
        Expo.setBackground(g,Expo.black);
        for (int d = 1; d <= numDots; d++)
        {
            int x = Expo.random(0,1000);       // random x value of each dot
            int y = Expo.random(0,650);        // random y value of each dot

            if (y < 333)                       // left stripe
                Expo.setColor(g,Expo.yellow);

            if (y >= 333 && y < 667)           // middle stripe requires compound condition
                Expo.setColor(g,Expo.green);

            if (y >= 667)                      // right stripe
                Expo.setColor(g,Expo.red);

            drawDot(g,x,y);
        }
        showName(g,"Lithuana");
    }
    public static void flagOfAustria (Graphics g)
    {
        Expo.setBackground(g,Expo.black);
        for (int d = 1; d <= numDots; d++)
        {
            int x = Expo.random(0,1000);       // random x value of each dot
            int y = Expo.random(0,650);        // random y value of each dot

            if (y < 333)                       // left stripe
                Expo.setColor(g,Expo.red);

            if (y >= 333 && y < 667)           // middle stripe requires compound condition
                Expo.setColor(g,Expo.white);

            if (y >= 667)                      // right stripe
                Expo.setColor(g,Expo.red);

            drawDot(g,x,y);
        }
        showName(g,"Austria");
    }
    public static void flagOfArgentina (Graphics g)
    {
        Expo.setBackground(g,Expo.black);
        for (int d = 1; d <= numDots; d++)
        {
            int x = Expo.random(0,1000);       // random x value of each dot
            int y = Expo.random(0,650);        // random y value of each dot

            if (y < 333)                       // left stripe
                Expo.setColor(g,Expo.lightBlue);

            if (y >= 333 && y < 667)           // middle stripe requires compound condition
                Expo.setColor(g,Expo.white);

            if (y >= 667)                      // right stripe
                Expo.setColor(g,Expo.lightBlue);

            drawDot(g,x,y);
        }
        showName(g,"Argentina");
    }
    public static void flagOfBariya (Graphics g)
    {
        Expo.setBackground(g,Expo.black);
        for (int d = 1; d <= numDots; d++)
        {
            int x = Expo.random(0,1000);       // random x value of each dot
            int y = Expo.random(0,650);        // random y value of each dot

            if (y < 125)                       // left stripe
                Expo.setColor(g,Expo.red);

            if (y >= 125 && y < 250)           // middle stripe requires compound condition
                Expo.setColor(g,Expo.white);

            if (y >= 250 && y < 375)                      // right stripe
                Expo.setColor(g,Expo.red);
            
            if (y >= 375)
                Expo.setColor(g,Expo.white);
            
            drawDot(g,x,y);
        }
        showName(g,"Bariya");
    }
    public static void flagOfMauritius (Graphics g)
    {
        Expo.setBackground(g,Expo.black);
        for (int d = 1; d <= numDots; d++)
        {
            int x = Expo.random(0,1000);       // random x value of each dot
            int y = Expo.random(0,650);        // random y value of each dot

            if (y < 125)                       // left stripe
                Expo.setColor(g,Expo.darkRed);

            if (y >= 125 && y < 250)           // middle stripe requires compound condition
                Expo.setColor(g,Expo.darkBlue);

            if (y >= 250 && y < 375)                      // right stripe
                Expo.setColor(g,Expo.gold);
            
            if (y >= 375)
                Expo.setColor(g,Expo.darkGreen);
            
            drawDot(g,x,y);
        }
        showName(g,"Mauritius");
    }
}