class Animal {
    void eating() {
        System.out.println("\neating....Animal class....eating method");
    }
}

class Lion extends Animal {
    void roar(){
        System.out.println("\nroaring....Lion class....roaring method");
    }
}

class BabyLion extends Lion {
    void sleep() {
        System.out.println("\nsleeping....Baby Lion class....sleeping method");
    }
}

class Execute {
    public static void main(String[] args) {
        BabyLion obj = new BabyLion();

        obj.roar();
        obj.sleep();
        obj.eating();
    }
}