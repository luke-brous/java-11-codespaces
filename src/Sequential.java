public class Sequential {


    public static void main(String[] args) {
        String[] a = {"Hello", "There", "When", "How"};
        String word = "How"; 
        int index = search(word,a);
        System.out.println(index);
    }



    public static int search(String key, String[] a) {
        int N = a.length;
        for (int i = 0; i < N; i++) {
            if (a[i] == key) {
                return i;
            }

        }


        return -1;
    }
}