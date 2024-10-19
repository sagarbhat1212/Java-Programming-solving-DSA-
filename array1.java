
public class array1{
    public static void update(int marks[]){
        for (int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;
        }
    }
    public static void main (String args[]){
        int marks[]={89,90,80};
        update(marks);

        //print our marks 
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i] + " ");
        }
        System.out.println();
    }
}

