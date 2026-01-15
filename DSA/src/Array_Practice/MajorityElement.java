package Array_Practice;

import java.util.HashMap;

public class MajorityElement {

    public static void main(String[] args) {
        int arr[] = {1, 1, 1, 2, 3};
        MajorElement(arr);
    }

    public static void MajorElement(int arr[]) {

        HashMap<Integer, Integer> hm = new HashMap<>();

        // count frequency
        for (int i = 0; i < arr.length; i++) {
            if (hm.containsKey(arr[i])) {
                hm.put(arr[i], hm.get(arr[i]) + 1);
            } else {
                hm.put(arr[i], 1);
            }
        }

        IO.println(hm);
        // find majority element
        for (int key : hm.keySet()) {
            if (hm.get(key) > arr.length / 2) {
                IO.print("Majority Element: " + key);
                return;
            }
        }

        IO.print("No Majority Element");
    }
}
