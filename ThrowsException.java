class ThrowsException{
    public static void main(String[] args) {
        checkage(04);
    }

    static void checkage(int age) throws ArithmeticException{
        if(age<18)
    {
        throw new ArithmeticException("You must be above 18 or above 18 to vote");
    }
    else{
        System.out.println("You are eligible to vote");
    }
}
}