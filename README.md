# [Confitura 2015](http://tech.viacom.com/warsawsdc/confitura2015/)

##Description of solution

I decide to use solutions already existed in java(to not reinvent wheel).
Finding duplicate has two steps:
1. Sorting collection. Java Collections.sort() use internally merge sort algorithm, which complexity is always O(n log n) (n-collection size), but when we sort Person objects we must compare names and this operation is O(m) (m-size of string) in the worst case, and O(1) in the best case.
2. Removing duplicated elements. This operation has always O(n) complexity.

## Duplicates

You have *very big* list of elements. Please provide best solution to detect and remove duplicated elements.

Please provide a solution and **comments** about its benefits and drawbacks. Please give us complexity (`O(n)`, `O(n^2)`, `O(ln(n))`, ...). Please think about custom classes like:

```java
class Person {
    String name;
    int age;
}
```

You can check contest bye-laws [here](http://tech.viacom.com/warsawsdc/confitura2015/Regulamin_konkurs_Viacom_programmer_adventure_2015.pdf).

Check out our Confitura 2015 site [here](http://tech.viacom.com/warsawsdc/confitura2015/)

We are hiring! Visit our [career site](http://tech.viacom.com/careers/).
