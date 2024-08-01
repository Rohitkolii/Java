import java.applet.*;
import java.awt.*;

class ReverseSring extends Applet implements ActionListner{
    String s;
    TextField t1;
    Button b1;
    public void init(){
        t1 = new TextField();
        b1 = new Button("Click");
        add(t1);
        add(b1);
        b1.addAcctionListner(this);
    }

    public void ActionPerformed(){
        StringBuilder p = new StringBuilder(s.getText());
        s = p.reverse();
        rapaint();
    }

    public void paint(Graphic g){
        g.drawString(s,100,100);     
    }
}

<applet code="ReverseString" width='100' height='100'></applet>