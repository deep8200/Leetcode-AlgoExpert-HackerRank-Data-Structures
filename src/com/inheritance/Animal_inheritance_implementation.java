package com.inheritance;

import com.beans.Animals;
import com.beans.Dog;
import com.beans.Fish;

public class Animal_inheritance_implementation
{
    public static void main(String[] args) {
        Animals animals = new Animals("Animal",1,1,4,50);
        Dog dog = new Dog("Jerry",5,55,2,4,1,32,"silky");
        animals.eat();
        dog.eat();
        dog.walk(2);
        dog.run(20);

        Fish fish = new Fish("ferry",3,22,2,2,4);
        fish.swim(40);
    }
}
