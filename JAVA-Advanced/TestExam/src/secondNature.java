import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class secondNature {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        long[] flowers = Arrays.stream(reader.readLine().split(" ")).mapToLong(Long::valueOf).toArray();
        long[] bucket = Arrays.stream(reader.readLine().split(" ")).mapToLong(Long::valueOf).toArray();

        ArrayDeque<Long>allFlowers = new ArrayDeque<>();
        ArrayDeque<Long>allBucket = new ArrayDeque<>();
        List<Long> natureFlower = new ArrayList<>();


        for (long flower : flowers) {
            allFlowers.offer(flower);
        }
        for (long i : bucket) {
            allBucket.push(i);
        }

        long diff = 0L ;

        while (true){

            if(allBucket.size()==0||allFlowers.size()==0){
                break;
            }

            long getFlower = allFlowers.poll();
            long getBucket = allBucket.pop();
            diff += getBucket-getFlower;
            while(diff<0&&allBucket.size()>=0){
                if(allBucket.size()==0&&diff<0){
                    System.out.print(getFlower + " ");
                    break;
                }
                diff+=allBucket.pop();
            }
            if(diff==0){
                natureFlower.add(getFlower);
            }


        }
        if(!allBucket.isEmpty()){
            System.out.print(allBucket.pop()+diff + " ");
            while (!allBucket.isEmpty()){
                System.out.print(allBucket.pop() + " ");
            }
            System.out.println();
        }else if (!allFlowers.isEmpty()){
            while (!allFlowers.isEmpty()){
                System.out.print(allFlowers.pop() + " ");
            }
            System.out.println();
        }else{
            System.out.println(diff);
        }

        if(natureFlower.size()!=0){
            for (Long integer : natureFlower) {
                System.out.print(integer + " ");
            }
        }else{
            System.out.println("None");
        }


    }
}
