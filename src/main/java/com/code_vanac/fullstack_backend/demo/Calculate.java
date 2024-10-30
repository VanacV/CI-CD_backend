package com.code_vanac.fullstack_backend.demo;

public class Calculate {

    int a;
    int b;

    Calculate(){

    }

    public Calculate(int a, int b){
        this.a = a;
        this.b = b;
    }

    static int sum(int a, int b){
        return a+b;
    }

    static int sub(int a, int b){
        return a-b;
    }

    static int mul(int a, int b){
        return a*b;
    }
}
