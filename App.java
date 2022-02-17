import java.time.LocalDate;
import javax.swing.JOptionPane;

public class App {
    @SuppressWarnings("unused")
    public static void main(String[] args) throws Exception {
        LocalDate current_date = LocalDate.now();
        int current_year = current_date.getYear();
        int age = Integer.parseInt(JOptionPane.showInputDialog("enter your age"));
        int bornyear = age - current_year;
        System.out.println(bornyear);
        JOptionPane.showMessageDialog(null, "you were born on "+bornyear);
        
    }
}
