import java.util.Scanner;

class InputManager{
    final Scanner in = new Scanner(System.in, "cp866");

    public int inputInt(){
        while(!in.hasNextInt()){
            System.out.println("Введите число");
            in.next();
        }
        return in.nextInt();
    }

    public String inputStr(){
        return in.next();
    }

    public int[] inputIntArray(){
        int len = inputInt();
        while(len < 0){
            System.out.print("Введите положительное число: ");
            len = inputInt();
        }
        int[] arr = new int[len];
        System.out.print("Введите " + len + " числел: ");
        for(int i = 0; i < len; i++){
            arr[i] = inputInt();
        }
        return arr;
    }

    public char inputSymbol(){
        return in.next().charAt(0);
    }

    public void clearConsole(){
		System.out.print("\033[H\033[J");
	}

    public String intArrayToStr(int[] arr){
        if(arr.length == 0){
            return "[]";
        }
        String str = "[" + arr[0];
        for(int i = 1; i < arr.length; i++){
            str += ", " + arr[i];
        }
        return str + "]";
    }
}