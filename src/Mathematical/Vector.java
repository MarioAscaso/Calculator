package Mathematical;

public class Vector {
    private final float component1;
    private final float component2;

    public Vector() {
        component1 = 0f;
        component2 = 0f;
    }

    public Vector(float component1, float component2) {
        this.component1 = component1;
        this.component2 = component2;
    }

    public float getComponent1() {
        return component1;
    }

    public float getComponent2() {
        return component2;
    }

    public Vector addVector(Vector v1, Vector v2) {
        float vectorComponent1 = (v1.getComponent1() + v2.getComponent1());
        float vectorComponent2 = (v1.getComponent2() + v2.getComponent2());
        return new Vector(vectorComponent1, vectorComponent2);
    }

    @Override
    public String toString() {
        return "resultado: ("+component1+", "+component2+")";
    }

}