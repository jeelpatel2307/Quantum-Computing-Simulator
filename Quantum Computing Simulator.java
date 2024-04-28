import java.util.ArrayList;
import java.util.List;

// ComplexNumber class to represent complex numbers
class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }

    @Override
    public String toString() {
        return real + " + " + imaginary + "i";
    }
}

// Qubit class to represent qubits
class Qubit {
    private ComplexNumber alpha;
    private ComplexNumber beta;

    public Qubit(ComplexNumber alpha, ComplexNumber beta) {
        this.alpha = alpha;
        this.beta = beta;
    }

    public ComplexNumber getAlpha() {
        return alpha;
    }

    public ComplexNumber getBeta() {
        return beta;
    }

    public void setAlpha(ComplexNumber alpha) {
        this.alpha = alpha;
    }

    public void setBeta(ComplexNumber beta) {
        this.beta = beta;
    }

    @Override
    public String toString() {
        return "(" + alpha + ")|0⟩ + (" + beta + ")|1⟩";
    }
}

// QuantumGate interface
interface QuantumGate {
    void apply(Qubit qubit);
}

// HadamardGate implementation
class HadamardGate implements QuantumGate {
    @Override
    public void apply(Qubit qubit) {
        ComplexNumber alpha = qubit.getAlpha();
        ComplexNumber beta = qubit.getBeta();

        // Hadamard gate transformation
        double newAlphaReal = (1 / Math.sqrt(2)) * (alpha.getReal() + beta.getReal());
        double newAlphaImaginary = (1 / Math.sqrt(2)) * (alpha.getImaginary() + beta.getImaginary());
        double newBetaReal = (1 / Math.sqrt(2)) * (alpha.getReal() - beta.getReal());
        double newBetaImaginary = (1 / Math.sqrt(2)) * (alpha.getImaginary() - beta.getImaginary());

        qubit.setAlpha(new ComplexNumber(newAlphaReal, newAlphaImaginary));
        qubit.setBeta(new ComplexNumber(newBetaReal, newBetaImaginary));
    }
}

// QuantumCircuit class to simulate quantum circuits
class QuantumCircuit {
    private List<Qubit> qubits;
    private List
