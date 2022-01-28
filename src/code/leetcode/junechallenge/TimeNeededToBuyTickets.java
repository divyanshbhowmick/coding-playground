package code.leetcode.junechallenge;

public class TimeNeededToBuyTickets {

    public static void main(String[] args) {
        System.out.println(timeRequiredToBuyTickets(new int[] { 1, 2, 3, 4, 5 }, 0));
        System.out.println(timeRequiredToBuyTickets(new int[] { 2, 3, 2 }, 2));
        System.out.println(timeRequiredToBuyTickets(new int[] { 5, 1, 1, 1 }, 0));
    }

    // Main catch is for i>k we will not be required to take the tickets[i] as the
    // required index is already bought the complete tickets, so we will consider
    // the indexes after it to not consider the latest one as it will not reach till the index after the targetIndex as it will become 0.
    public static int timeRequiredToBuyTickets(int tickets[], int k) {
        int timeRequired = 0;
        for (int i = 0; i < tickets.length; i++) {
            timeRequired += Math.min(tickets[i], (i > k ? tickets[k] - 1 : tickets[k]));
        }
        return timeRequired;
    }
}