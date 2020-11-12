/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabTwoN;

import javafx.scene.text.Text;

/**
 *
 * @author vitya
 */
abstract class Transport implements ITransport {

    enum TransportType {
        AIRPLANE, TRAIN, CAR
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 Text newText = new Text ();       
Airplane a = new Airplane (newText);
a.move();
a.print();
Car c = new Car (newText);
c.move();
c.print();
Train t = new Train (newText);
t.move();
t.print();
    }

    private Text name = new Text();

    public void setName(Text name) {
        this.name = name;
    }

    public Text getName() {
        return name;
    }

    private Transport() {
    }

    protected Transport(Text name) {
        this.name = name;
    }

    protected abstract void print();

}
