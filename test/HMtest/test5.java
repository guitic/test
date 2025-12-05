package HMtest;

public class test5 {
    public static void main(String[] args) {
        int herght1 = 200;
        int herght2 = 150;
        int herght3 = 165;
        int temp = herght1 > herght2 ? herght1 : herght2;
        int max = temp > herght3 ? temp : herght3;
        System.out.println(max);
    }
}