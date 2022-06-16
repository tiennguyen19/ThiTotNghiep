package Bai1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class DogTest {

    @Test
    @DisplayName("SmallDog keu woof woof")
    void testSmallDog(){
        SmallDog smallDog = new SmallDog("Test1", "Red", "small");
        String expected = "woof woof";
        Assertions.assertEquals(expected, smallDog.makeSound());
    }

    @Test
    @DisplayName("BigDog keu woof woof woof")
    void testBigDog() {
        BigDog bigDog = new BigDog("Test2", "black","big");
        String expected = "woof woof woof";
        Assertions.assertEquals(expected, bigDog.makeSound());
    }
}