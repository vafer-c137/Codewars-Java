public class task1{
    public static void main(String[] args){
        System.out.println("Hello world!!");
        int num = -1;
        int result = addSum(num);
        System.out.println(result);
    }

    public static int addSum(int num){
        int result = 0;
        if(num >= 0){
            result = num + num;
        } else {
            result = num - num;
        }
        return result;
    }
}
