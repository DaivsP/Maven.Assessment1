package com.zipcodewilmington.assessment1.part2;

import java.lang.reflect.MalformedParameterizedTypeException;
import java.util.*;

/**
 * Created by leon on 2/16/18.
 */
public class ArrayUtils {
    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return the number of times the specified `value` occurs in the specified `objectArray`
     * Given an array of objects, named `objectArray`, and an object `objectToCount`, return the number of times the `objectToCount` appears in the `objectArray`
     */
    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {
        Integer counter = 0;
        for (int i = 0; i < objectArray.length; i++) {
            if (objectToCount.equals(objectArray[i])){
                counter++;
            }
        }
        return counter;
    }

    /**
     * @param objectArray    an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Object[] removeValue(Object[] objectArray, Object objectToRemove) {
        ArrayList<Object> returnList = new ArrayList<Object>();
        Object[] intArray;
        for (int i = 0; i < objectArray.length; i++) {
            if (!objectArray[i].equals(objectToRemove)){
                returnList.add(objectArray[i]);
            }
        }
        intArray = new Integer[returnList.size()];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = returnList.get(i);
        }
        return intArray;
    }

    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Object getMostCommon(Object[] objectArray) {
        Map<Object, Integer> map = makeMapOfCounters(objectArray);
        Integer highestCount = 0;
        Object mostCommon = null;
        for (Object object : map.keySet()) {
            Integer counter = (map.get(object));
            if (counter > highestCount){
                highestCount = counter;
                mostCommon = object;
            }
        }
        return mostCommon;
    }


    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Object getLeastCommon(Object[] objectArray) {

        Map<Object, Integer> map = makeMapOfCounters(objectArray);
        Integer highestCount = null;
        Object leastCommon = null;
        for (Object object : map.keySet()) {
            Integer counter = (map.get(object));
            if(highestCount==null)
                highestCount = counter;
            if (counter < highestCount){
                highestCount = counter;
                leastCommon = object;
            }
        }
        return leastCommon;
    }

    private static Map<Object, Integer> makeMapOfCounters(Object[] objectArray) {
        Map<Object, Integer> map = new TreeMap<>();
        for (int i = 0; i < objectArray.length; i++) {
            if (map.containsKey(objectArray[i])){
                map.put(objectArray[i],new Integer(map.get(objectArray[i]) + 1));
            }
            else {
                map.put(objectArray[i], new Integer(1));
            }
        }
        return map;
    }


    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static Object[] mergeArrays(Object[] objectArray, Object[] objectArrayToAdd) {
        List<Object> objectArrayList = new ArrayList<>();
        /*for (Object object: objectArray) {
            objectArrayList.add(object);
        }
        for (Object object : objectArrayToAdd) {
            objectArrayList.add(object);
        }*/
        objectArrayList.addAll(new ArrayList<>(Arrays.asList(objectArray)));
        objectArrayList.addAll(new ArrayList<>(Arrays.asList(objectArrayToAdd)));
        Object[] answer = new Integer[objectArrayList.size()];
        for (int i = 0; i < objectArrayList.size(); i++) {
            answer[i] = objectArrayList.get(i);
        }
        return answer;
    }
}
