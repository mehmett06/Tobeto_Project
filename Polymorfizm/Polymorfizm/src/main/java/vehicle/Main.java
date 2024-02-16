package vehicle;

public class Main {
    public static void main(String[] args) {
        Vehicle car =new Car();
        Vehicle motorcycle= new Motorcycle();
        Vehicle[] vehicle =new Vehicle[]{new Car(),new Motorcycle()};
        //burda Vehicle[] arrayı(dizi) aslında veri tipi gibi kullnıyoruz classı vehicle=name,
        // new Vehicle[]{new Car(),new Motorcycle()} = new yaparak yeni bir tane nesne oluşturuyoruz.
        //Product[] a={product1,product2,product3}
        //car.startEngine();



        startAndStopEngine(car);
        startAndStopEngine(motorcycle);
        System.out.println("1-----------------Farklı bir yazdırma metodu-----------------1");
        


        for(Vehicle b:vehicle){
         b.startEngine();
         b.stopEngine();
        }
        System.out.println("2-----------------Farklı bir yazdırma metodu-----------------2");


        startAndStopEngine1 durum = new startAndStopEngine1();
        durum.arac=new Motorcycle();
        durum.getCustomers();
        //Yeni oluşturduğumuz metod ile  startAndStopEngine1 de yeni bir new yaparak değişken oluşturduk
        //durum name ile field alanına istedğimiz classı veriyoruz Car veya Motorcyle
        //sonra ise durum metodu ile yine get customers metoduna ulaşıyoruz.

        System.out.println("3-----------------Farklı bir yazdırma metodu-----------------3");

        startAndStopEngine2 durum2 =new startAndStopEngine2(new Car());
        durum2.getCustomer1();





    }
    public static void startAndStopEngine(Vehicle vehicle) {

        vehicle.startEngine();
        vehicle.stopEngine();
    }
}
