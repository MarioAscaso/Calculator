package Mathematical;

public class ComplexNumber {
    private final float realPart;
    private final float imaginaryPart;

    public ComplexNumber() {
        realPart = 0f;
        imaginaryPart = 0f;
    }

    public ComplexNumber(float realPart, float imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public float getRealPart() {
        return realPart;
    }

    public float getImaginaryPartPart() {
        return imaginaryPart;
    }

    public ComplexNumber addComplexNumber(ComplexNumber cn1, ComplexNumber cn2) {
        float real = (cn1.getRealPart() + cn2.getRealPart());
        float imaginary = (cn1.getImaginaryPartPart() + cn2.getImaginaryPartPart());
        return new ComplexNumber(real, imaginary);
    }

    @Override
    public String toString() {
        return "result: "+realPart+" + "+imaginaryPart+"i";
    }


}