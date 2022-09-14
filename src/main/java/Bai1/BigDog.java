package Bai1;

public class BigDog extends SmallDog{

    public BigDog(String name, String color, String size) {
        super(name, color, size);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    @Override
    public String getSize() {
        return super.getSize();
    }

    @Override
    public void setSize(String size) {
        super.setSize(size);
    }

    @Override
    public String makeSound() {
        return ("woof woof woof branch tien2");
    }
}
