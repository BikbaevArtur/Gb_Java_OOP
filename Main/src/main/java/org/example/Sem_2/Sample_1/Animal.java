package org.example.Sem_2.Sample_1;

public abstract class Animal { // ставим модификатор abstract, тут нельзя будет создавать экземпляр Animal
    public abstract void voice(); // должен обязательно переопределить

    public void jump() {
        System.out.println("Животное прыгает");
    }

}
