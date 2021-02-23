public class zad1 {
    //komentarz
    public static void main(String[] args) {
        int myIntA = 1;
        int myIntB = -32;
        int myIntC = 77;
        System.out.println(myIntA);
        System.out.println(myIntB);
        System.out.println(myIntC);
        //dodawanie zmiennych
        int sum = myIntA + myIntB + myIntC;
        System.out.println("Dodawanie : " + sum);
        //odejmowanie zmiennych (nadpisanie zmiennej sum)
        sum = myIntA - myIntB - myIntC;
        System.out.println("odejmowanie : " + sum);
        //mnożenie zmiennych (nadpisanie znowu zmiennej sum)
        sum = myIntA * myIntB * myIntC;
        System.out.println("mnożenie : " + sum);
        //dzielenie zmiennych (nadpisanie znowu zmiennej sum)
        sum = myIntA/2;
        System.out.println("dzielenie " + myIntA + " przez 2 : " + sum);
        sum = myIntB/2;
        System.out.println("dzielenie " + myIntB + " przez 2 : " + sum);
        sum = myIntC/2;
        System.out.println("dzielenie " + myIntC + " przez 2 : " + sum);

        //liczny zmiennoprzecinkowe (doble > float)
        double myDoubleA = 2.34;
        double myDoubleB = 7;
        double myDoubleC = 0.66;

        double sumDouble = myDoubleA + myDoubleB + myDoubleC;
        System.out.println("dodanie Double : " + sumDouble);

        sumDouble = myDoubleA * myDoubleB * myDoubleC;
        System.out.println("mnożenie Double : " + sumDouble);
        sumDouble = myDoubleA / myDoubleB / myDoubleC;
        System.out.println("dzielenie Double : " + sumDouble);
    }
}
