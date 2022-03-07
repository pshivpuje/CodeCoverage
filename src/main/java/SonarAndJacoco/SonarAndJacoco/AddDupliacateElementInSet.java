package SonarAndJacoco.SonarAndJacoco;

import java.util.HashSet;
import java.util.Set;

public final class AddDupliacateElementInSet
{
     public static void main(String[] args)
     {
         Set<Integer> set =new HashSet<>();
         set.add(1);
         set.add(1);
         set.add(3);
         set.add(4);
         set.add(5);
         set.add(6);
         set.forEach(s->System.out.println(s));  
     }
}
