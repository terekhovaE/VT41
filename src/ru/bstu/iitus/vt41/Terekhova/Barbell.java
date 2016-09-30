package ru.bstu.iitus.vt41.Terekhova;

import java.util.Scanner;

public class Barbell extends Fitness {

    public static final SportType WEIGHTLIFTING = SportType.WEIGHTLIFTING;
    double length;    //длина

    @Override
    public void init(Scanner scan) {
        super.init(scan);

        System.out.println("Введите длину штанги: ");
        if (scan.hasNextDouble()) {
            length = scan.nextDouble();
        } else {
            //ругнуться
        }
    }

    @Override
    public SportType getSportType() {

        return WEIGHTLIFTING;
    }

    @Override
    public String toString() {
        return "Инвентарь - штанга, вид спорта - тяжелая атлетика, масса - " + this.weight
                + ", производитель - " + this.manufacturer
                + ", материал - " + this.material
                + ", цвет - " + this.color
                + ", длина - " + length + '\n';
    }

}