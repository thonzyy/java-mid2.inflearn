package collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class Cart
{
    Map<Product, Integer> cartMap = new HashMap<>();

    public void add(Product product, int quantity)
    {//이름과 가격이 같으면 같은 상품
        int existQuantity = cartMap.getOrDefault(product, 0);
        cartMap.put(product, existQuantity + quantity);
      /*  if(!map.containsKey(product))
            map.put(product, quantity);
        else
            map.put(product, map.get(product) + quantity);*/
    }

    public void minus(Product product, int quantity)
    {
        int existingQuantity = cartMap.getOrDefault(product, 0);
        int newQuantity = existingQuantity - quantity;
        if (newQuantity <= 0)
        {
            cartMap.remove(product);
        }
        else
        {
            cartMap.put(product, newQuantity);
        }
      /*  if(cartMap.containsKey(product))
            cartMap.remove(product);*/

    }

    public void printAll()
    {
        System.out.println("==모든 상품 출력==");
        for (Map.Entry<Product, Integer> entry : cartMap.entrySet())
            System.out.println("상품: " + entry.getKey() + " 수량: " + entry.getValue());
    }
}
