package com.wip.training.inheritance;
import com.wip.training.types.Kitten;

public class Main {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
Cat kitty = new Cat();
//cat can inherit the methods of animal class but not cat itself(eating) if declared as
//Animal cat = new Cat();
Cat cat = new Cat();
cat.walking();
cat.scream();
cat.eating();



kitty.eating();
kitty.walking();
kitty.scream();

Animal kit = new Kitten();

//default class from different package (kitten is from dif package)cannot be inherited 
//but classes from same package , cat can be done,for example
//kit.scream();

  }

}
