public class Main {
    public static void main(String[] args){
TwoStacks twoStacks=new TwoStacks(10);
twoStacks.push1(1);
        twoStacks.push1(2);
        twoStacks.push1(3);

        // Push elements onto stack 2
        twoStacks.push2(10);
        twoStacks.push2(9);
        twoStacks.push2(8);

        // Pop elements from stack 1
        System.out.println("Popped from stack 1: " + twoStacks.pop1());
        System.out.println("Popped from stack 1: " + twoStacks.pop1());

        // Pop elements from stack 2
        System.out.println("Popped from stack 2: " + twoStacks.pop2());
        System.out.println("Popped from stack 2: " + twoStacks.pop2());
    }
}
