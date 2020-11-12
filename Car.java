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
public class Car extends Transport {

    public Car(Text name) {
        super(name);

    }
    TransportType variableTransportType = TransportType.CAR;

    @Override
    protected void print() {
        System.out.print(TransportType.CAR.name());
        System.out.print(":");
        System.out.println();
    }
   


    /**
     *
     *///
    @Override
    public void move() {
        System.out.println("rides on the road");
    }

}
