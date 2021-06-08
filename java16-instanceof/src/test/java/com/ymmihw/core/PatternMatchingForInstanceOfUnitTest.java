package com.ymmihw.core;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import com.ymmihw.core.PatternMatchingForInstanceOf.Cat;
import com.ymmihw.core.PatternMatchingForInstanceOf.Dog;
import org.junit.jupiter.api.Test;

class PatternMatchingForInstanceOfUnitTest {

  @Test
  void givenAnAnimal_whenTypeIsCat_ThenCatGoesMeow() {
    Cat animal = mock(Cat.class);

    PatternMatchingForInstanceOf instanceOf = new PatternMatchingForInstanceOf();
    instanceOf.performAnimalOperations(animal);

    verify(animal).meow();
  }

  @Test
  void givenAnAnimal_whenTypeIsDog_ThenDogGoesWoof() {
    Dog animal = mock(Dog.class);

    PatternMatchingForInstanceOf instanceOf = new PatternMatchingForInstanceOf();
    instanceOf.performAnimalOperations(animal);

    verify(animal).woof();
  }
}
