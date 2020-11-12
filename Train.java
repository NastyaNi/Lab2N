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
public class Train extends Transport {
 TransportType variableTransportType = TransportType.TRAIN;   


    public Train(Text name ) {
        super(name);
    }

    @Override
    protected void print() {
        System.out.print(TransportType.TRAIN.name());
        System.out.print(":");
    }
       

    @Override
    public void move() {
        System.out.println("rides on the rails");
    }
        
}
