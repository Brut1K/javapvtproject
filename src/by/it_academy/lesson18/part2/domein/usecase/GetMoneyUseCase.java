package by.it_academy.lesson18.part2.domein.usecase;

import by.it_academy.lesson18.part2.domein.entity.GetMoneyResult;
import by.it_academy.lesson18.part2.domein.entity.Money;
import by.it_academy.lesson18.part2.domein.repository.MoneyRepository;

public class GetMoneyUseCase implements Usecase {
    private MoneyRepository moneyRepository;

    public GetMoneyUseCase(MoneyRepository moneyRepository){
        this.moneyRepository = moneyRepository;
    }

    public void execute(Money money,  GetMoneyListener resultListener){
        //получаем текущее количество денег
        Money currentMoney = moneyRepository.get();
        //проверям достаточно ли денег
        if(currentMoney.getMoney()>=money.getMoney()){
            Money newMoney = new Money();
            newMoney.setMoney(currentMoney.getMoney()-money.getMoney());
            //сохраняем новое количество денег
            moneyRepository.save(newMoney);
            //возвращаем результат в presentation слой
            GetMoneyResult result = new GetMoneyResult();
            resultListener.onResult(result);
        } else {
            //возвращаем результат в presentation слой
            resultListener.onError();
        }

    }

    public interface GetMoneyListener{
        void onResult(GetMoneyResult getMoneyResult);
        void onError();
    }
}
