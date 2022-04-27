import java.util.*;
public interface Property {
    public int computePrice();
}

class Bunglow implements Property{
    String name;
    int constructionArea;
    int landArea;

    Bunglow(String n, int a, int b){
        name = n;
        constructionArea = a;
        landArea = b;
    }

    public int computePrice(){
        int construction_cost = 500;
        int additional_cost = 200;
        int land_cost = 400;
        int total_cost;
        total_cost = (construction_cost*constructionArea) + (landArea*additional_cost) + (land_cost*landArea);
        return total_cost; 
    }
}

class Flat implements Property{
    String name;
    int constructionArea;

    Flat(String s, int a){
        name = s;
        constructionArea = a;
    }
    public int computePrice(){
        int construction_cost = 500;
        int additional_cost = 200000;
        int total_cost = (constructionArea*construction_cost) + (additional_cost);
        return total_cost;
    }
}

class Main123{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name1; 
        int constructionArea1;
        int land_area1;
        System.out.println("Enter the Bunglow name, construction area (in sq. feet), land area (in sq. feet): ");
        name1 = sc.nextLine();
        constructionArea1 = sc.nextInt();
        land_area1 = sc.nextInt();
        Bunglow b1 = new Bunglow(name1, constructionArea1, land_area1);
        System.out.println("Total Cost for Bunglow: "+b1.computePrice());
        System.out.println("Enter the Flat name, construction area (in sq. feet): ");
        name1 = sc.next();
        constructionArea1 = sc.nextInt();
        Flat f1 = new Flat(name1, constructionArea1);
        System.out.println("Total Cost for Bunglow: "+f1.computePrice());
    }
}
