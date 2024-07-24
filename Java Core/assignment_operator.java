
class Assignment {

    public static void main(String[] args) {
        int num1 = 9;
        int num2 = 4;

        int result1 = num1 + num2;
        int result2 = num1 - num2;
        int result3 = num1 * num2;
        int result4 = num1 / num2;
        int result5 = num1 % num2;
        float result6 = num1 / num2;

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
        System.out.println(result6);

        num1 += 2;
        System.out.println("num1");
        System.out.println(num1 > num2);
        System.out.println(num1 < num2);
    }
}
