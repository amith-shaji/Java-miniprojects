import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
class trafficlight extends JFrame implements ActionListener
{
   JRadioButton x,y,z;
   public void paint(Graphics g)
   {
     g.setColor(Color.black);
     g.drawRect(250,100,100,210);
     g.fillRect(250,100,100,210);
     g.drawOval(280,115,40,40);
     g.drawOval(280,185,40,40);
     g.drawOval(280,255,40,40);
     if(x.isSelected())
     {
       g.setColor(Color.white);
       g.fillOval(280,185,40,40);
       g.fillOval(280,255,40,40);
       g.setColor(Color.red);
       g.fillOval(280,115,40,40);
     }
     else if(y.isSelected())
     {
       g.setColor(Color.white);
       g.fillOval(280,115,40,40);
       g.fillOval(280,255,40,40);
       g.setColor(Color.yellow);
       g.fillOval(280,185,40,40);
     }
     else
     {
       g.setColor(Color.white);
       g.fillOval(280,115,40,40);
       g.fillOval(280,185,40,40);
       g.setColor(Color.green);
       g.fillOval(280,255,40,40);
     }
       
   }
   trafficlight()
   {
       JFrame j=new JFrame();
       x=new JRadioButton("Red");
       y=new JRadioButton("Yellow");
       z=new JRadioButton("Green");
       ButtonGroup bg=new ButtonGroup();
       x.setBounds(70,125,100,20);
       y.setBounds(70,200,100,20);
       z.setBounds(70,275,100,20);
       bg.add(x);
       bg.add(y);
       bg.add(z);
       add(x);
       add(y);
       add(z);
       setSize(400,400);
       setLayout(null);
       setVisible(true);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       x.addActionListener(this);
       y.addActionListener(this);
       z.addActionListener(this);
  }
  public void actionPerformed(ActionEvent e)
  {
     repaint();
  }
  public static void main(String args[])
  {
     SwingUtilities.invokeLater(new Runnable()
     {
        public void run()
        {
          new trafficlight();
        }
     });
  }
}