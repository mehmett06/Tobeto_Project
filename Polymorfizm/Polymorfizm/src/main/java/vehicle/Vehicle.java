package vehicle;

abstract class Vehicle {
    public abstract void startEngine();
    //abstract kullanımı burda interface gibi imzasını biz veriyoruz methodu main methodunda kullanmak zorunda gövdesi(body)si kullanılıyor.
    public abstract void stopEngine();
    //abstract yapmak bu extends yaptığımız classları mecbur kullanmak zorundayız.
    public void startAndStopEngine111(){
        System.out.println("olduğu gibi kullan!!!");
    }
}
