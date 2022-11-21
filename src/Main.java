import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("A las muy buenas");
        System.out.println("Nuevo nombre");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String nombre = br.readLine();
    }
}