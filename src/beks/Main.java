package beks;

public class Main {

    public static void main(String[] args) {
        int num = 10;
        switch (num){
            case 1:
                System.out.printf("число %d", num);
                break;
            case 8:
                System.out.printf(" число %d ", num);
                num++;
                break;
            case 9:
                System.out.printf(" число %d ", num);
                break;
            default:
                System.out.println(" Число не равно 1,8,9 ");
        }
    }
}

