// DataWrapper.java
// Tiffany Agosto-Martinez
// 4/10/2026
// Generic DataWrapper class

package edu.fscj.cop2800c.util;

import java.util.List;

public class DataWrapper<T> {
    private T value;
    // Overloaded Constructor
    public DataWrapper(T value) {
        this.value = value;
    }
    // getValue method
    public T getValue() {
        return value;
    }
    // static generic display method
    public static <T> void displayList(List<DataWrapper<T>> list) {
        for (DataWrapper<T> element : list) {
            // getValue drills down to the object's toString
            System.out.println(element.getValue());
        }
    }
}