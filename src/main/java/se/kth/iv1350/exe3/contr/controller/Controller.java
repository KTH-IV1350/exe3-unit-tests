package se.kth.iv1350.exe3.contr.controller;

import se.kth.iv1350.exe3.contr.integration.ClassInInteg;
import se.kth.iv1350.exe3.contr.integration.FileHandler;
import se.kth.iv1350.exe3.contr.model.ClassInModel;

/**
 * Simulates a controller with two system operations.
 */
public class Controller {
    private ClassInInteg integ1;
    private FileHandler fileHandler;
    private ClassInModel classInModel;
    
    /**
     * Creates a new instance using the specified objects.
     * 
     * @param integ1      Some required object in the integration layer.
     * @param fileHandler Used for all file access.
     */
    public Controller(ClassInInteg integ1, FileHandler fileHandler) {
        this.integ1 = integ1;
        this.fileHandler = fileHandler;
    }
        
    /**
     * Initializes the model.
     */
    public void createObjInModel() {
        classInModel = new ClassInModel();
    }
    
    /**
     * Adds two to the specified operand.
     * 
     * @param operand The number two which two will be added.
     * @return        <code>operand<code> + 2
     */
    public int addTwo(int operand) {
        return classInModel.addTwo(operand);
    }
}
