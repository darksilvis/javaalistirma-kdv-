public class Test {
    public static void main(String[] args){

       char c1 = 'J';
       char c2 = 'A';
       char c3 = 'V';
       char c4 = 'A';
        System.out.println(c1+ c2 + c3 + c4);// boyle yazınca Java'da aslında bir tam sayı türüdür ve
        // Unicode tablosundaki karakterlere karşılık gelen tamsayı değerlerini tutar. Bu nedenle, char değişkenlerini topladığınızda,
        // bu karakterlerin Unicode değerleri toplanır.
        System.out.println(""+c1+ c2 + c3 + c4); // burda charı stringe döndürdüğü için java diye yazdı

        byte b = 0;
        int d = ++b;
        int a = b++;
        int c = ++b;

        System.out.println(d);
        System.out.println(a);
        System.out.println(c);







    }
}
