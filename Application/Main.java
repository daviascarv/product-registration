package Products.Application;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.List;

import Products.Classes.ImportedProduct;
import Products.Classes.Products;
import Products.Classes.UsedProduct;

public class Main{
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(new Locale("pt-br"));
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        List<Products> list = new ArrayList<>();

        System.out.print("Enter the products quantity: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            System.out.println("Prduct #"+i+" data");
            System.out.print("Common, used or import(c/u/i)?");
            char x = sc.next().charAt(0);

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Price: ");
            Double price = sc.nextDouble();
            if(x == 'u'){
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                Date date = sdf.parse(sc.next());
                list.add(new UsedProduct(name, price, date));
                
            }else if(x == 'i'){
                System.out.print("Customs fee: ");
                double customsFee = sc.nextDouble();
                list.add(new ImportedProduct(name, price, customsFee));
            }else if(x == 'c'){
                list.add(new Products(name, price));
        }
    }
        sc.close();
        System.out.println("");
        System.out.print("PRICE TAGS !!");
        for()
    }
}