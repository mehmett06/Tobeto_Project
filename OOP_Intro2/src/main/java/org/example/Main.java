package org.example;
import org.example.entities.Customer;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        CustomerManager customerManager = new CustomerManager(new Customer(), new TeacherCreditManager());
        customerManager.GiveCredit();


    }

    public static class CreditManager {

        //sonar gube
        public static void Calculate(int creditType) {


            System.out.println("Hesaplandı");
        }

        public static void hesapla() {
            System.out.println("Kredi verildi.");
        }
    }

    interface ICreditManager {
        void Calculate();

        void Save();
    }

    abstract class BaseCredicitManager implements ICreditManager {

        public abstract void Calculate();

        //ortak değil heryerde değişken bu yüzden abstrcat olarak bırakıyoruz.
        public void Save() {
            System.out.println("Kaydedildi");

        }
        // save heryerde değişken değil
    }


    public static class TeacherCreditManager implements BaseCredicitManager, ICreditManager {
        @Override
        public void Calculate() {
            // hesaplamalar var
            System.out.println("Öğretmen kredisi hesaplandı.");
        }

    }

    public static class MilitaryCreditManager implements ICreditManager {
        @Override
        public void Calculate() {
            System.out.println("Asker kredisi hesaplandı.");
        }

        @Override
        public void Save() {
            System.out.println("Kaydedildi");
        }
    }

    public static class CustomerManager {
        private Customer _customer;
        private ICreditManager _creditManager;

        public CustomerManager(Customer customer, ICreditManager creditManager) {
            _customer = customer;
            _creditManager = creditManager;


        }

        public void Save() {
            System.out.println("Müşteri Kaydedildi : ");
        }

        public void Delete() {
            System.out.println("Müşteri Silindi :");
        }

        public void GiveCredit() {
            _creditManager.Calculate();
            System.out.println("kredi verildi");

        }
    }
}
