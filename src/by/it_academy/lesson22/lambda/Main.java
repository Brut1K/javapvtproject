package by.it_academy.lesson22.lambda;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        test(t->{
            System.out.println("t");
        });

        List<String> list = new ArrayList<>();

        Map<Integer,Integer> map = new HashMap<>();

    }

    public static void test(OnClick onClick){
        onClick.onClick(500);
    }
    interface OnClick{
        void onClick(int id);
    }

}
