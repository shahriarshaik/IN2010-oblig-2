public class BubbleSort {
    int[] sorter;
    
    public BubbleSort(int[] sorter){
        this.sorter = sorter;
    }

    void sorter(int[] sorter){
        int n = sorter.length;
        for(int i = 0; i < (n - 1); i++){
            for(int j = 0; j < (n - i - 1); j++){
                if(sorter[j] > sorter[j +1]){
                    int peker = sorter[j];
                    sorter[j] = sorter[j + 1];
                    sorter[j + 1] = peker;
                }
            }
        }
    }

}
