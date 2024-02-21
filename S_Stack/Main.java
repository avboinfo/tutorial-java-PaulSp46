/*
** Esempio di uso di uno Stack (Pila)
** Sandro Gallo - 08/02/2024
*/

package S_Stack;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main( String[] args ) {
        Stack<String> s = new Stack<>();
        File f = new File("D_Data/input.txt");
        
        try {
            Scanner fileInput = new Scanner(f);
            String temp = "";

            while (fileInput.hasNextLine()) {
                temp = fileInput.nextLine();
                s.push(temp);
            }

            fileInput.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        String tempPop = "";
        int size = s.size();
        for (int i = 0; i < size; i++) {
            String buffer = "";
            tempPop = s.pop();
            for (int j = tempPop.length(); j > 0; j--) {
                buffer += tempPop.charAt(j-1);
            }
            System.out.println(buffer);
        }
    }
}
