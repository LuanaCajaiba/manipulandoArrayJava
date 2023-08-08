import java.util.ArrayList;
import java.util.Iterator;


public class Main {
    public static void main(String[] args) {

        ArrayList<String> diary = new ArrayList<>();

        diary.add("Luana Cajaiba; 71 9 87227072");
        diary.add("José Carlos, 73 93827283");

        int i;

        //using index
        System.out.printf("reading the diary...index");
        int index = diary.size();
        for (i=0; i<index;i++){
            System.out.println("\n");
            System.out.printf("Position %d - %s\n", i, diary.get(i));
        }

        //using for-each
        System.out.println("\n");
        System.out.printf("reading the diary...for-each");
        i = 0;
        for (String contact: diary){
            System.out.println("\n");
            System.out.printf("Position %d - %s\n", i, contact);
        }

        //using iterator
        System.out.printf("\n");
        System.out.printf("reading the diary...iterator");
        i=0;
        Iterator<String>iterator = diary.iterator();
        while (iterator.hasNext()){
            System.out.println("\n");
            System.out.printf("Position %d - %s\n", i, iterator.next());
        }

    }
}