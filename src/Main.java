public class Main {
    public static void main(String[] args) {

        Integer[] data = { 100, 200, 300, 400, null };
        data = shiftRightFor(data);
        data = shiftLeftFor(data);

        for (Integer i: data) {
            System.out.println(i);
        }
    }

/*  This method gets an array and moves by iterations(from the last) the value of each cell[index-1] to cell[index]
*   The first cell gets a null value.
*   Returns changed array.  */

    public static Integer[] shiftRight(Integer[] array) {
        int i = array.length - 1;
        
        while (i > 0) {
            array[i--] = array[i];
        }
        
        array[i] = null;
        return array;
    }

/*  This method gets an array and moves by iterations(from first) the value of each cell[index+1] to cell[index]
*   The last cell gets a null value.
*   Returns changed array.  */

    public static Integer[] shiftLeft(Integer[] array) {
        int i = 0;
        
        while (i < array.length - 1) {
            array[i++] = array[i];
        }
        
        array[i] = null;
        return array;
    }

    public static Integer[] shiftRightFor(Integer[] array) {

        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i-1];
        }
        
        array[0] = null;
        return array;
    }

    public static Integer[] shiftLeftFor(Integer[] array){

        for (int i = 0; i < array.length - 1; i++) {
            array[i] = array[i+1];
        }
        
        array[array.length - 1] = null;
        return array;
    }
}
