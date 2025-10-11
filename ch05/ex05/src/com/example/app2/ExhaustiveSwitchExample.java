package com.example.app2;

public class ExhaustiveSwitchExample {
    // switch 표현식에서의 완전성 검사 예
    static String describe(Expr e) {
        return switch(e) {
            case Const c -> "const " + c.v();
            case Add a -> "add";
            case Mul m -> "mul";
        };
    }
    public static void main(String[] args){
        Expr expression = new Const(42);
        System.out.println(describe(expression));
    }
}
