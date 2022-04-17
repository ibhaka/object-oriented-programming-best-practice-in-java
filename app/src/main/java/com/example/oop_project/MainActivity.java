package com.example.oop_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
/*
        User myUser = new User();
        myUser.name = "Ibrahim";
        myUser.job = "Android Developer";

        User newUser = new User();
        newUser.name = "Halil";
        newUser.job = "Engineer";
*/

        User myUser = new User("ibrahim", "developer");
        System.out.println(myUser.information());
        System.out.println(myUser.name);

        //Encapsulation

        Musician james = new Musician("James" , "Guitar" , 50);
     //   james.age = 60;
     //   System.out.println(james.age);

        james.setAge(60 , "ibrahim");
        james.setAge(70 , "wrong_password");
        //if your password input is wrong, age wont change

        System.out.println(james.getAge());

        //Inheritance
        SuperMusician lars = new SuperMusician("Lars" , "Drums" , 55);
        System.out.println(lars.sing());
        System.out.println(lars.getAge());

        //Poymorphism

        //Static Polymorphism
        Mathematics mathematics = new Mathematics();
        System.out.println(mathematics.sum());
        System.out.println(mathematics.sum(4 ,6));
        System.out.println(mathematics.sum(4 , 6 , 7));

        //Dinamic Polymorphism
        Animal myAnimal = new Animal();
        System.out.println();
        myAnimal.sing();

        Dog barley = new Dog();
        barley.test();
        barley.sing();

        //Abstract & Interface

        Piano myPiano = new Piano();
        myPiano.brand = "Yamaha";
        myPiano.digital = true;
        myPiano.info();


    }
}