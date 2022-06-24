package d0624_02_StreamMeh;



import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Grouping {
   
   enum CaloricLevel {DIET, NORMAL, FAT} 

   public static void main(String[] args) {
      Map<Dish.Type, List<Dish>> groupDishesByType = 
      Dish.menu.stream().collect(Collectors.groupingBy(Dish::getType));
      
      groupDishesByType.get(Dish.Type.FISH);
      
      groupDishesByType.values();
      groupDishesByType.keySet();
      groupDishesByType.entrySet();

      
      System.out.println(groupDishesByType.keySet());
      System.out.println(groupDishesByType.values());
      System.out.println(groupDishesByType.entrySet());
      
      
      Map<Dish.Type, List<String>> groupDishNamesbyType = 
      Dish.menu.stream().collect(Collectors.groupingBy(Dish::getType, Collectors.mapping(d->d.getName(), Collectors.toList())));
      
      
      Map<CaloricLevel, List<Dish>> groupDishesByCaloricLevel =
      Dish.menu.stream().collect(Collectors.groupingBy(
            dish-> {
               if(dish.getCalories() <= 400)
               {return CaloricLevel.DIET;}
               else if(dish.getCalories() <= 700)
               {return CaloricLevel.NORMAL;}
               else {return CaloricLevel.FAT;}
            }));
   
            groupDishesByCaloricLevel.keySet();
            groupDishesByCaloricLevel.values();
            groupDishesByCaloricLevel.entrySet();
            
            System.out.println(groupDishesByCaloricLevel.keySet());
            System.out.println(groupDishesByCaloricLevel.values());
            System.out.println(groupDishesByCaloricLevel.entrySet());

      
   }

}