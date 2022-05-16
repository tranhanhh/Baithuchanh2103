import java.util.ArrayList;
public class App16 {
    public static void main(String[] args) throws Exception {
        ArrayList<String> arrListString = new ArrayList<>();

        arrListString.add("Java");
        arrListString.add("PHP");
        arrListString.add("C#");
        arrListString.add("C++");
        System.out.println("Cac phan tu co trong addListString la: ");
        for(int i=0; i < arrListString.size(); i++){
            System.out.print(arrListString.get(i) + "\t");
        }
        System.out.print("\n");

        arrListString.remove(1);
        arrListString.set(2, "Python");

        System.out.println("Cac phan tu co trong addListString la: ");
        for(int i=0; i < arrListString.size(); i++){
            System.out.print(arrListString.get(i) + "\t");
        }
    }
}
