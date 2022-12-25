public class DataProcessingInvoice{

    public void calcScore(String tariff, String period, String payment){
        //формування рахунку
    }
    public boolean autoPayment(String cardNumber, String expDate, String cvv, int currentDate){
        //спроба списання коштів із картки через платіжний сервіс
        if(/*вдалося списати кошти*/) return true;
        else return false;
    }
    public void checkAutoPayment(String cardNumber, String expDate, String cvv, int currentDate){
        //при невдачі автоматичної оплати відбувається декілька повторних спроб із інтервалом в день
        if(autoPayment(cardNumber,expDate,cvv,currentDate) == true) {

        }
        else {
            for(int i = 1; i <= 3; i++)
            autoPayment(cardNumber,expDate,cvv,currentDate + i);
            if( autoPayment(cardNumber,expDate,cvv,currentDate + 3) == false) blockCard(cardNumber,expDate,cvv);
        }
    }
    public void blockCard(String cardNumber, String expDate, String cvv){
        //блокування сервісу
    }



    


}
