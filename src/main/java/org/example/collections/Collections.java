package org.example.collections;

import org.example.enums.Role;

import java.util.*;

public class Collections {

    public static void main(String[] args) {
        //List, Sets, HashSets, HashMaps, LinkedLists,
        //Stacks, Queues, ...
        List<String> variableName = new ArrayList<>(List.of("GOAT", "DARO", "HOUSE", "DOG", "DOG", "YATCH"));
        System.out.println((variableName.contains("DOG")&&"DOG".length()>3));//USING CONDITIONS WITH Arrays
        System.out.println(variableName.indexOf("DOG"));//GETTING AN ELEMENT INDEX
        HashSet<String> variableName2 = new HashSet<>(variableName);//removing duplicates with a Set Collection
        System.out.println(variableName2.stream().toList());//Converting Set to List


        List<String> phoneApps = new ArrayList<>(List.of("Youtube", "FaceBook", "X", "Instagram"));
        Iterator iterator = phoneApps.iterator();
        while (iterator.hasNext()){
            System.out.println("Opening..."+ iterator.next());
        }

        Stack<String> openedApps = new Stack<>();
        openedApps.addAll(phoneApps);
        while (!openedApps.isEmpty()){
            System.out.println("Closing..."+openedApps.pop());
        }

        PriorityQueue<Staff> queue = new PriorityQueue<>();
        Staff josh = new Staff();
        josh.setName("JOSH");
        josh.setRole(Role.SENIOR);
        Staff annabelle = new Staff();
        annabelle.setName("ANNABELLE");
        annabelle.setRole(Role.JUNIOR);
        Staff julius = new Staff();
        julius.setName("JULIUS");
        julius.setRole(Role.SENIOR);
        queue.add(josh);
        queue.add(annabelle);
        queue.add(julius);
        while(!queue.isEmpty()){
            System.out.println("Removing from the queue by priority....\n"+
                    "Seniors before Junior\n"+
                    queue.poll());
        }

        //Yesterday's algorithm solution
        char[] charArray ="HOUSE".toCharArray();
        if (charArray.length%2==0) {
            System.out.println(charArray[(charArray.length / 2) - 1] + ", " + charArray[charArray.length / 2]);
        }
        else {
            System.out.println( charArray[charArray.length / 2]);

        }
    }
}
