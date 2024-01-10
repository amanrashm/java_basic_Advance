package basic_java.ParkingSpace;
public class ParkingSystem {
    /*int availableBig = 0, availableMedium = 0 , availableSmall = 0;*/
    private int car [] = new int[3];

    public ParkingSystem(int big, int medium, int small) {
        /*availableBig = big;
        availableMedium = medium;
        availableSmall = small;*/
        car[0] = big;
        car[1] = medium;
        car[2] = small;
    }
    public boolean addCar(int carType) {
        if(car[carType - 1] > 0){
            car[carType - 1] -= 1;
            return true;
        }
        return false;
        /*switch (carType) {
            case 1 -> {
                if (availableBig == 0) return false;
                else {
                    availableBig--;
                    return true;
                }
            }
            case 2 -> {
                if (availableMedium == 0) return false;
                else {
                    availableMedium--;
                    return true;
                }
            }
            case 3 -> {
                if (availableSmall == 0) return false;
                else {
                    availableSmall--;
                    return true;
                }
            }
        }
    return false;*/
    }
    public static void main(String[] args) {
        ParkingSystem obj = new ParkingSystem(1,1,1);
        boolean param_1 = obj.addCar(1);
        boolean param_2 = obj.addCar(2);
        boolean param_3 = obj.addCar(3);
        boolean param_4 = obj.addCar(1);

        System.out.println(param_1);
        System.out.println(param_2);
        System.out.println(param_3);
        System.out.println(param_4);
    }
}