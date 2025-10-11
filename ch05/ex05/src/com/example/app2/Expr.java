package com.example.app2;

public sealed interface Expr permits Const, Add, Mul {}