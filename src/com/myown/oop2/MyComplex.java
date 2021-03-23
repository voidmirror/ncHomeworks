package com.myown.oop2;

public class MyComplex {
    private double real = 0.0;
    private double image = 0.0;

    public MyComplex() {
    }

    public MyComplex(double real, double image) {
        this.real = real;
        this.image = image;
    }

    public double getReal() {
        return real;
    }

    public double getImage() {
        return image;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public void setImage(double image) {
        this.image = image;
    }

    public MyComplex add(MyComplex second) {
//        MyComplex result = new MyComplex();

        this.setReal(real + second.real);
        this.setImage(image + second.image);

        return this;
    }

    public MyComplex addNew(MyComplex second) {
        MyComplex result = new MyComplex();

        result.setReal(real + second.real);
        result.setImage(image + second.image);

        return result;
    }

    public MyComplex subtract(MyComplex second) {
//        MyComplex result = new MyComplex();

        this.setReal(real - second.real);
        this.setImage(image - second.image);

        return this;
    }

    public MyComplex subtractNew(MyComplex second) {
        MyComplex result = new MyComplex();

        result.setReal(real - second.real);
        result.setImage(image - second.image);

        return result;
    }

    public MyComplex multiply(MyComplex second) {
        MyComplex result = new MyComplex();

        result.setReal(real * second.real - image * second.image);
        result.setImage(real * second.image + second.real * image);

        return result;
    }

    public MyComplex divideMyComplex(MyComplex second) {
        MyComplex result = new MyComplex();

        result.setReal((real * second.real - image * second.image) / (second.real * second.real + second.image * second.image));
        result.setImage((second.real * image - real * second.image) / (second.real * second.real + second.image * second.image));

        return result;
    }

    public boolean isReal() {
        return image == 0;
    }

    public boolean isImaginary() {
        return real == 0;
    }

    public double magnitude() {
        return Math.sqrt(Math.pow(real, 2) + Math.pow(image, 2));
    }

    public double argument() {
        if (real > 0 && image == 0) {
            return 0;
        } else if (real > 0 && image > 0) {
            return Math.atan(Math.abs(image / real));
        } else if (real == 0 && image > 0) {
            return Math.PI / 2;
        } else if (real < 0 && image > 0) {
            return Math.PI / Math.atan(Math.abs(image / real));
        } else if (real < 0 && image == 0) {
            return Math.PI;
        } else if (real < 0 && image < 0) {
            return -Math.PI / Math.atan(Math.abs(image / real));
        } else if (real == 0 && image < 0) {
            return -Math.PI / 2;
        } else /*(real > 0 && image < 0)*/ {
            return -Math.atan(Math.abs(image / real));
        }
    }

    public void trigonometryView() {
        System.out.println(magnitude() + " * (cos(" + argument() + ") + i * sin(" + argument() + "))");

    }

    public boolean equals(MyComplex obj) {
        return obj.real == this.real && obj.image == this.image;
    }

    public boolean equals(double real, double image) {
        return this.real == real && this.image == image;
    }

    public MyComplex conjugate() {
        return new MyComplex(real, -image);
    }

    @Override
    public String toString() {
        if (image < 0) {
            return real + "-" + Math.abs(image) + "i";
        } else {
            return real + "+" + image + "i";
        }
    }
}
