package patterns.generating.builder.task;

import patterns.generating.builder.task.item.Characteristic;
import patterns.generating.builder.task.item.Item;
import patterns.generating.builder.task.item.impl.Bike;
import patterns.generating.builder.task.item.impl.Laptop;

/**
 Using the builder pattern, correct the characteristic class code
 */
public class Main {
    public static void main(String[] args) {
        Item bike = new Bike(Characteristic.builder()
                .brand("Speedy")
                .color("Red")
                .weight("1000 kg")
                .wheel("GOODYEAR")
                .build());

        Item computer = new Laptop(Characteristic.builder()
                .cpu("cpu")
                .os("os")
                .memory("memory")
                .body("body")
                .battery("battery")
                .memoryType("memoryType")
                .ram("ram")
                .build());

        System.out.println(bike);
        System.out.println(computer);
    }
}
