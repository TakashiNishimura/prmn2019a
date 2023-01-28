package lec01;

import jdk.jfr.Percentage;

import java.util.*;
import java.util.stream.Collectors;

public class Exe01 {

    public static void main(String[] args) {
        Insect insect = new Insect();
        insect.move();

        Map<Integer, List<String>> map = new HashMap<>();
        Map<String, HashSet> ap = new HashMap<>();
        ap.put("a", new HashSet<>(Arrays.asList(1L)));
        ap.put("b", new HashSet<>(Arrays.asList(2L, 3L)));
        ap.put("e", new HashSet<>(Arrays.asList(3L)));
        ap.put("c", new HashSet<>(Arrays.asList(2L)));
        ap.put("f", new HashSet<>(Arrays.asList(3L)));
        ap.put("g", new HashSet<>(Arrays.asList(3L, 2L)));
        ap.put("h", new HashSet<>(Arrays.asList(3L, 2L, 4L)));
        ap.put("i", new HashSet<>(Arrays.asList(4L, 3L, 2L)));
        ap.put("d", new HashSet<>(Arrays.asList(2L)));
        int n = 0;
        Map<String, HashSet> p = new HashMap<>(ap); //シャロ―じゃないけどディープでもない
        p.get("e").add(2L);                         //クラスの持つObjectは参照渡しのまま
        System.out.println(ap.get("e"));            //pにしかaddしてないのに...
        System.out.println(p.get("e"));             //複製先の要素に変更を加えたい場合は工夫がいるらしい
        for (Map.Entry<String, HashSet> entry : ap.entrySet()) {
            if (!p.keySet().contains(entry.getKey())) continue;
            p.remove(entry.getKey());

            List<String> list = p.entrySet().stream()
                    .filter(ntry -> entry.getValue().equals(ntry.getValue()))
                    .map(Map.Entry::getKey)
                    .collect(Collectors.toList());
            list.forEach(p::remove);
            list.add(entry.getKey());

            map.put(n++, list);
            System.out.println(map);
        }
        /*List<String> l = new LinkedList<>();
        for (Map.Entry<String, List<Long>> entry : ap.entrySet()) {
            List<String> list = new ArrayList<>();
            list.add(entry.getKey());
            l.add(entry.getKey());
            for (Map.Entry<String, List<Long>> ntry : ap.entrySet()) {
                if (l.contains(ntry.getKey())) continue;
                if (entry.getValue().containsAll(ntry.getValue())) {
                    list.add(ntry.getKey());
                    l.add(ntry.getKey());
                }
                System.out.println(ntry.getKey()+":"+ntry.getValue());
            }
            map.put(n++, list);
            System.out.println(map);
        }*/

        long[] ls = {1, 2, 3};
        List<String> lls = new ArrayList<>(Arrays.asList("1", "2", "3", "4", "5", "6", "7")) {
            private static final long serialVersionUID = 4327561099225142819L;

            @Override
            public int size() {
                System.out.println("size");
                return super.size();
            }
        };
        System.out.println(String.join(",", Arrays.stream(ls).mapToObj(String::valueOf).collect(Collectors.toList())));
        System.out.println(Arrays.stream(ls).mapToObj(String::valueOf).collect(Collectors.joining(",")));
        System.out.println(String.join(",", lls));

//        List<String> llls = lls;
//        for (String lll : llls) {
//            System.out.println(lll);
//            llls.remove(lll); //error!
//        }

        for (int i = 0; i < lls.size(); i++) {
            String ll = lls.get(i);
            System.out.println(ll);
            lls.remove(ll);
            System.out.println("i : " + i);
        }

        insect.reflectionTest();

        try {
            insect.test();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }

        System.out.println(insect.n);
    }
}
