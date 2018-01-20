package by.it_academy.lesson18.part2.presentation;


import by.it_academy.lesson18.part2.domein.entity.GetMoneyResult;
import by.it_academy.lesson18.part2.domein.entity.Money;
import by.it_academy.lesson18.part2.domein.usecase.GetMoneyUseCase;

public class Controller {

    private View view;

    public Controller(View view){
        this.view = view;
    }

    public void getMoney(){

   /*     GetMoneyUseCase getMoneyUseCase = new GetMoneyUseCase();
        //тут стучимся в UserCase а затем показываем данные на экране
        Money money = new Money();
        money.setMoney(100);
        getMoneyUseCase.execute(money, new GetMoneyUseCase.GetMoneyListener() {
            @Override
            public void onResult(GetMoneyResult getMoneyResult) {
                view.showGetMoneyResult(true);
            }

            @Override
            public void onError() {
                view.showMessage("Деньги не снялись");
            }
        });
    //    view.showGetMoneyResult();
*/
    }


}
