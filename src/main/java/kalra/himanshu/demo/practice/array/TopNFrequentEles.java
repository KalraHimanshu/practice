package kalra.himanshu.demo.practice.array;

import lombok.Getter;
import lombok.ToString;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TopNFrequentEles {
    public static void main(String[] args) {
        try {
            new TopNFrequentEles().fun();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
    public void fun(){

        List<Integer> list = List.of(1, 2, 3, 1, 4, 5, 1, 3, 1, 3, 5, 6);

        Map<Integer, Long> map = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));


        System.out.println(map);
        PriorityQueue<Element> queue
//                = new PriorityQueue<Element>(Comparator.comparing(Element::getFreq))
        ;

        queue =
                map.entrySet().stream()
                .map(e -> new Element(e.getKey(), e.getValue()))
                .collect(Collectors.toCollection(()->new PriorityQueue<Element>(Comparator.comparing(Element::getFreq))))
//                        .forEach(e-> queue.add(e));
                ;
        System.out.println(queue);
        System.out.println("skip 1 , limit 2");
        queue.stream()
                .skip(1).limit(2).forEach(System.out::println);

//        map.entrySet().stream().forEach(System.out::println);

//        TreeSet<Element> set = map.entrySet().stream().map(e -> new Element(e.getKey(), e.getValue())).collect(Collectors.toCollection(() -> new TreeSet<>(Comparator.comparing(Element::getFreq))));

//        Map<Element, Element> map = new HashMap<>();
//                new TreeMap<Element, Element>((e1,e2)-> Integer.compare(e1.freq, e2.freq));
//        list.stream().map(i -> new Element(i)).forEach(ele-> {
//            System.out.println("value:"+ ele.value);
//            if (map.containsKey(ele)) {
//
////                Element oldEle = map.get(ele);
//                Element mapEle = map.remove(ele);
//                System.out.println("found: value, freq"+ ele.value + ele.freq);
//                mapEle.freq = mapEle.freq+1;
//                map.put(mapEle, mapEle);
//            } else {
//                System.out.println("NOT found: value, freq"+ ele.value + ele.freq);
//                map.put(ele, ele);
//            }
//        });

//        System.out.println(set);
    }

    @Getter
    @ToString
    class Element implements Comparator{
        int value;
        long freq;

        public Element(int value) {
            this.value = value;
            this.freq = 1;
        }

        public Element(int value, long freq) {
            this.value = value;
            this.freq = freq;
        }

        @Override
        public int compare(Object o1, Object o2) {
            return Long.compare(cast(o1).freq, cast(o2).freq);
        }

        Element cast(Object o) {
            return (Element) o;
        }

        @Override
        public boolean equals(Object o) {
//            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Element element = (Element) o;
            return value == element.value;
        }

        @Override
        public int hashCode() {
            return Objects.hash(value);
        }

    }
}
