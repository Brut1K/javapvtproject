package by.it_academy.lesson18.part2.domein.repository;

import by.it_academy.lesson18.part2.domein.entity.Money;

public interface MoneyRepository {

    Money get();
    void save(Money money);

}
