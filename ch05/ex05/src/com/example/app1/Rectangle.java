package com.example.app1;

public sealed class Rectangle implements Shape permits FilledRectangle, OutlineRectangle {}
