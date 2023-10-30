import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //Tworzenie ArrayList
        List<Integer> arrayList = new ArrayList<>();
        //Tworzenie LinkedList
        List<Integer> linkedList = new LinkedList<>();

        int i = 0;
        int elements = 90000;

        //ArrayList


        //Dodawanie
        //Sprawdzenie czasu rozpoczecia procesu dodawania
        long StartTimeArrayAdd = System.nanoTime();
        //Dodawanie elementow w petli
        for( i = 0; i < elements; i++)
        {
            arrayList.add(i);
        }
        //Sprawdzenie czasu zakonczenia procesu dodawania
        long EndTimeArrayAdd = System.nanoTime();
        //Obliczenie czasu procesu dodawania
        long FinalTimeArrayAdd = EndTimeArrayAdd - StartTimeArrayAdd;


        //Modyfikacja
        //Sprawdzenie czasu rozpoczecia procesu modyfikacji
        long StartTimeArrayModification = System.nanoTime();
        //Modyfikacja elementow w petli
        for( i = 0; i < elements;i++)
        {
            arrayList.set(i, i + 1);
        }
        //Sprawdzenie czasu zakonczenia procesu modyfikacji
        long EndTimeArrayModification = System.nanoTime();
        //Obliczenie czasu calego procesu modyfikacji
        long FinalTimeArrayModification = EndTimeArrayModification - StartTimeArrayModification;


        //Usuwanie
        //Sprawdzenie czasu rozpoczecia procesu usuwania
        long StartTimeArrayRemove = System.nanoTime();
        //Usuwanie elementow w petli
        for(i = 0; i < elements; i++)
        {
            arrayList.remove(arrayList.size() - 1);
        }
        //Sprawdzenie czasu zakonczenia procesu usuwania
        long EndTimeArrayRemove = System.nanoTime();
        long FinalTimeArrayRemove = EndTimeArrayRemove - StartTimeArrayRemove;





        //LinkedList


        //Dodawanie
        //Sprawdzenie czasu rozpoczecia procesu dodawania
        long StartTimeLinkedAdd = System.nanoTime();
        //Dodawanie elementow w petli
        for( i = 0; i < elements; i++)
        {
            linkedList.add(i);
        }
        //Sprawdzenie czasu zakonczenia procesu dodawania
        long EndTimeLinkedAdd = System.nanoTime();
        //Obliczenie czasu procesu dodawania
        long FinalTimeLinkedAdd = EndTimeLinkedAdd - StartTimeLinkedAdd;


        //Modyfikacja
        //Sprawdzenie czasu rozpoczecia procesu modyfikacji
        long StartTimeLinkedModification = System.nanoTime();
        //Modyfikacja elementow w petli
        for( i = 0; i < elements;i++)
        {
            linkedList.set(i, i + 1);
        }
        //Sprawdzenie czasu zakonczenia procesu modyfikacji
        long EndTimeLinkedMOdification = System.nanoTime();
        //Obliczenie czasu calego procesu modyfikacji
        long FinalTimeLinkedModification = EndTimeLinkedMOdification - StartTimeLinkedModification;


        //Usuwanie
        //Sprawdzenie czasu rozpoczecia procesu usuwania
        long StartTimeLinkedRemove = System.nanoTime();
        //Usuwanie elementow w petli
        for(i = 0; i < elements; i++)
        {
            linkedList.remove(linkedList.size() - 1);
        }
        //Sprawdzenie czasu zakonczenia procesu usuwania
        long EndTimeLinkedRemove = System.nanoTime();
        long FinalTimeLinkedRemove = EndTimeLinkedRemove - StartTimeLinkedRemove;


        //Wyswietlanie
        System.out.println("Prezentacja czasu wykonan poszczegolnych operacji dla dwoch typow list: ");
        System.out.println("Dodawanie: ");
        System.out.println("Czas dodawania elementow w ArrayList to: " + FinalTimeArrayAdd + " , a w LinkedList to: " + FinalTimeLinkedAdd);
        System.out.println("Modyfikacja: ");
        System.out.println("Czas Modyfikacji elementow w ArrayList to: " + FinalTimeArrayModification + " , a w LinkedList to: " + FinalTimeLinkedModification);
        System.out.println("Odejmowanie");
        System.out.println("Czas Odejmowania elementow w ArrayList to: " + FinalTimeArrayRemove + " , a w LinkedList to: " + FinalTimeLinkedRemove);
    }
}