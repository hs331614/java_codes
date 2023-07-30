import java.util.Comparator;
import java.util.PriorityQueue;

public class priorityqueue {
    static class Student implements Comparable<Student>{
        String name;
        int rank;
        public Student(String name,int rank){
            this.name=name;
            this.rank=rank;
        }

        @Override
        public int compareTo(Student s2){
            return this.rank-s2.rank;
        }

    }
    public static void main(String[] args) {
        PriorityQueue<Student> pq=new PriorityQueue<>(Comparator.reverseOrder());

        pq.add(new Student("Harshit",7));
        pq.add(new Student("Abhigya",5));
        pq.add(new Student("Rajan",20));

        while (!pq.isEmpty()){
            System.out.println(pq.remove().name+" ");
        }

    }
}
