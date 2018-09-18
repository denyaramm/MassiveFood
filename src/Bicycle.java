class Bicycle {
    int cadence = 0;
    int speed = 0;
    int gear = 1;

    void changeCadence(int newValue) {
        cadence = newValue;
    }

    void changeGear(int newGear) {
        gear = newGear;
    }

    void speedUp(int inkrement) {
        speed = speed + inkrement;
    }

    void applyBrakes(int decrement) {
        speed = speed - decrement;
    }

    void printStates() {
            System.out.println("cadence:"+ cadence +" speed:"+ speed +" gear:"+gear);
}
}
