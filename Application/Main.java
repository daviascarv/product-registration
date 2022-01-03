package Products.Application;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.List;
import Products.Classes.Products;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(new Locale("pt-br"));
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        List<Products> list = new ArrayList<>();

        System.out.print("Enter the products quantity: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            System.out.println("Prduct #"+i+" data");
            System.out.print("Common, used or import(c/u/i)?");
            char x = sc.nextLine().charAt(0);
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Price: ");
            Double price = sc.nextDouble();
            if(x == 'u'){
                System.out.print("Manufacture date: ");
                
            }
        }
        sc.close();
    }
}