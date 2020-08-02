public class Main {

    public static void main(String[] args) {
        AccountManager manager = new AccountManager();
        System.out.println("Hesap=" + manager.getBalance());
        manager.deposit(100);
        System.out.println("Hesap=" + manager.getBalance());
//        manager.withdraw(90); //Diğer class'daki throws Exception fırlattığımız için burda da yine kızmış olan withdraw'dan ampul simgesi üzerinden Add exception to method signature yapmalıyız.
//        System.out.println("Hesap:" + manager.getBalance());
//        manager.withdraw(20);
//        System.out.println("Hesap:" + manager.getBalance());

        //Yukardaki exception ifadenin daha yaygın ve sağlıklı halini aşağıda yazacağız.
        //public static void main(String[] args) throws Exception yine yukardaki bu metod bloğundaki throws Exception siliyoruz.Try ve catch ile devam edeceğiz.

        try{
            manager.withdraw(90);
        } catch (BalanceInsufficentException exception){ // Şuan aktif olan daha spesifik nokta atışken ama catch (Exception exception){ bu şekilde de yakalar ve olur.
            System.out.println(exception.getMessage());
        }
        System.out.println("Hesap="+manager.getBalance());

        try{
            manager.withdraw(20);
        } catch (BalanceInsufficentException exception){ // Şuan aktif olan daha spesifik nokta atışken ama catch (Exception exception){ bu şekilde de yakalar ve olur.
            System.out.println(exception.getMessage());
        }
        System.out.println("Hesap:"+manager.getBalance());
    }
}
