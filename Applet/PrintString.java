import java.applet.*;
import java.awt.*;

class PrintString extends Applet{
    String s;

    public void init(){
        s = "Hello Duniya";
    }

    public void paint(Graphic g){
        Font f = new Font();
        g.setColor(color.green);
        g.drawString(s,100,100);
    }
}
/*
<applet code="PrintString.class" width="100" height="100">
<\applet>
*/