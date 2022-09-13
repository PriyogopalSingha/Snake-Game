import javax.swing.JFrame;

public class MainFrame extends JFrame{
    MainFrame(){ // constructor
        this.add(new GamePanel());
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack(); // it will pack the components into the frame
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}
