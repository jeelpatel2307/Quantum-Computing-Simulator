# Quantum Computing Simulator

This project demonstrates a basic implementation of a quantum computing simulator in Java. The simulator allows users to create quantum circuits, apply quantum gates, and simulate quantum algorithms.

## Components

1. **Qubit**: Represents a qubit in quantum computing, with complex amplitudes alpha and beta.
2. **QuantumGate**: Abstract class for quantum gates. Various quantum gates like Hadamard, Pauli-X, etc., can extend this class.
3. **HadamardGate**: Implements the Hadamard gate, which creates superposition in a qubit.
4. **QuantumCircuit**: Represents a quantum circuit composed of quantum gates.

## Usage

1. Instantiate qubits and apply quantum gates to create quantum circuits.
2. Simulate the quantum circuit to observe the state of qubits after applying gates.
3. Analyze the results to understand the behavior of quantum algorithms.

## Example

```java
// Create a qubit in the |0> state
Qubit qubit = new Qubit(new ComplexNumber(1, 0), new ComplexNumber(0, 0));

// Apply a Hadamard gate to create superposition
QuantumGate hadamardGate = new HadamardGate();
qubit = hadamardGate.operate(qubit);

// Simulate the quantum circuit
QuantumCircuit circuit = new QuantumCircuit();
circuit.addGate(hadamardGate);
circuit.simulate(qubit);

```

## Features

- **Qubit Representation**: Represents qubits using complex numbers to handle quantum superposition.
- **Quantum Gates**: Supports various quantum gates like Hadamard, Pauli-X, CNOT, etc., for quantum computation.
- **Quantum Circuit Simulation**: Simulates quantum circuits composed of multiple quantum gates.
- **Scalability**: Designed to handle large-scale quantum circuits for simulating complex quantum algorithms.

## Contributing

Contributions are welcome! If you have any ideas for improvements or new features, feel free to open an issue or submit a pull request.

## Credits

This project was created by Jeel patel.
