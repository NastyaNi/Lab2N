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
public class Airplane extends Transport {
    

    TransportType variableTransportType = TransportType.AIRPLANE;

    public Airplane(Text name) {
        super(name);

    }
    

    
    @Override
    public void move() {
        System.out.println("flying in the air");
    }

    @Override
    protected void print() {
        System.out.print(TransportType.AIRPLANE.name());
        System.out.print(":");
        System.out.println();
    }

}
