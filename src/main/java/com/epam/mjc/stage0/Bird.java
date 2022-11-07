package com.epam.mjc.stage0;

public class Bird extends Animal{

    public Bird() {
        super("blue", 2, false);
    }
    public Bird(String color, int numberOfPaws, boolean hasFur) {
        super(color, numberOfPaws, hasFur);
    }

    @Override
    public String getDescription() {
        String color = getColor();
        int pows =getNumberOfPaws();
        if(isHasFur()==true){
            if(pows==1){return ("This animal is mostly "+color+"."+" It has "+pows+" paw and a fur. Moreover, it has 2 wings and can fly.");
            }
            else {return ("This animal is mostly "+color+"."+" It has "+pows+" paws and a fur. Moreover, it has 2 wings and can fly.");}}
        else{
            if(pows==1){return ("This animal is mostly "+color+"."+" It has "+pows+" paw and no fur. Moreover, it has 2 wings and can fly.");}
            else  {return ("This animal is mostly "+color+"."+" It has "+pows+" paws and no fur. Moreover, it has 2 wings and can fly.");}
        }
    }
}
