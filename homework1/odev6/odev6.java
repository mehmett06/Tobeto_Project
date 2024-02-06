package homework1.odev6;

public class odev6 {
    public static void main(String[] args) {
        String tur1 ="Merhaba";
        String tur2 ="Kod Kampüsüne";
        String tur3 ="hoş geldiniz";
        System.out.println(tur1);
        System.out.println(tur2);
        System.out.println(tur3);

        //"11" sayısının ekran çıktısını verir.
        String a ="kod kampüsü";
        System.out.println(a.length());

        // "k" karakterinin ekran çıktısını
        String b="kod kampüsü";
        System.out.println(b.charAt(0));

        //kamp yazısını çıktı olarak çıkarır.
        String c ="kod kampüsü";
        System.out.println(c.substring(4,8));

        String a1 ="kod";
        String a2 ="kampüsü";
        String a3 =a1.concat(a2);//bağlantı yapılıyor
        System.out.println(a3);//"kodkampüsü" ekran çıktısı verilir


        String a4 ="kod kampüsünden selamlar";
        System.out.println("m harfinin ilk bulunduğu sıra =" + a4.indexOf('a'));//"m harfinin ilk bulunduğu sıra =5" çıktısını verir

        String a5 ="kod kampüsünden selamlar";
        System.out.println("m harfinin ilk bulunduğu sıra =" + a5.lastIndexOf('a'));//"a harfinin bulunduğu son sıra =22" çıktısını verir

        String a6 ="kod kampüsünden selamlar";
        String a7="kod kampüsünden selamlar";
        System.out.println(a6.equals(a7));//"true" ekran çıktısını verir

        String a9="Kod KAMpüsÜNDEN SELAMLAR";
        System.out.println(a9.toLowerCase());//"kod kampüsünden selamlar" ekran çıktısını verir

        String a10="Kod KAMpüsÜNDEN SelaMLAR";
        System.out.println(a10.toUpperCase());//"KOD KAMPÜSÜNDEN SELAMLAR" ekran çıktısını verir



        System.out.println(a.compareTo(a2));//"5" ekran çıktısını verir

        String a13="            kod kampüsüne hoş geldiniz         ";
        System.out.println(a13.trim());//"kod kampüsüne hoş geldiniz" ekran çıktısını verir



    }
}
