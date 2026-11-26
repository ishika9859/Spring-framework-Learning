package car.example.setter.injection;

public class Car {
    Specification specification ;

    public void setSpecification(Specification specification) {
        this.specification = specification;
    }

    public void displaySpecification(){

        System.out.println(specification.toString());
    }
}
