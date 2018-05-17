import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class courseSummary extends course {


    private JFrame mainFrame;
    private JPanel controlPanel;

    public courseSummary () {
        mainFrame = new JFrame("Java SWING example");
        mainFrame.setSize(1000,1000);
        mainFrame.setLayout(new GridLayout(3, 1));

        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing (WindowEvent windowEvent){
                System.exit(0);
            }
        });

        controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout());
        mainFrame.add(controlPanel);
    }


    public static void main(String[] args) {

        course cour = new course ("CS", 245, 1185);
        int secnum = 0;
        System.out.println(cour.cour[secnum].classNum);
        System.out.println(cour.cour[secnum].lecNum);
        System.out.println(cour.cour[secnum].campLoc);
        System.out.println(cour.cour[secnum].enrol[0]);
        System.out.println(cour.cour[secnum].enrol[1]);
        System.out.println(cour.cour[secnum].times[0]);
        System.out.println(cour.cour[secnum].times[1]);
        System.out.println(cour.cour[secnum].times[2]);
        System.out.println(cour.cour[secnum].times[3]);
        System.out.println(cour.cour[secnum].times[4]);
        System.out.println(cour.cour[secnum].times[5]);
        System.out.println(cour.cour[secnum].times[6]);
        System.out.println(cour.cour[secnum].room);
        System.out.println(cour.cour[secnum].room2);
        System.out.println(cour.cour[secnum].inst);

        /*


        courseSummary course = new courseSummary();
        course.showCourses();
        */
    }

    private void showCourses() {

        mainFrame.setVisible(true);

    }
}
