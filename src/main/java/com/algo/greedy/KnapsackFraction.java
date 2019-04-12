package com.algo.greedy;

import java.util.Arrays;
import java.util.Comparator;

public class KnapsackFraction {

    public static void main(String[] args) {

        int [] weight = {10, 40, 20, 30};
        int [] value = {60, 40, 100, 120};
        int capacity = 50;
        System.out.println("Optimum Maximum Value "+getOptimumMaxValue(value,weight,capacity));

    }

    private static double getOptimumMaxValue(int[] value, int[] weight, int capacity) {
        double totalOptimum = 0.0;
        String location="";
        ItemValues[] itemValues = new ItemValues[value.length];

        for(int i=0;i<value.length;i++){
            itemValues[i] = new ItemValues(value[i],weight[i],i);
        }

        Arrays.sort(itemValues, new Comparator<ItemValues>() {
            public int compare(ItemValues o1, ItemValues o2) {
                return o2.valuePerWeight.compareTo(o1.valuePerWeight);
            }
        });

        for(int j=0;j<itemValues.length;j++){
            if(capacity - itemValues[j].weight > 0){
                capacity = capacity - itemValues[j].weight;
                totalOptimum = totalOptimum + itemValues[j].value;
                location = location + " " + itemValues[j].location;
            } else {
                double fraction = itemValues[j].valuePerWeight;
                totalOptimum = totalOptimum + (capacity * fraction);
                location = location + " " + itemValues[j].location;
                break;
            }
        }
        System.out.println(location);
        return totalOptimum;
    }

}

class ItemValues {
    int value;
    int weight;
    Double valuePerWeight;
    int location;

    public ItemValues(int value, int weight, int location){
        this.value = value;
        this.weight = weight;
        this.location = location;

        this.valuePerWeight = (double)value/(double)weight;
    }
}
