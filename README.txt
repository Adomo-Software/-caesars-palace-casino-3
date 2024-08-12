Rename it to correct one. The name must be in lower-case. The words of the name must be separetated by hiphens;

Replace classes by yours; 

Rename package name;

IMPORTANT requirements:

* NO if-else, switch and similar statements!!!;

* NO while(…) statements

* NO classes in one file;

* NO static classes;

* Copy the task description to README ;

Your task is:

1. Build casino which contains four/five floors. For example: 

```
Floor firstFloor = new FirstFloor(firstFloorConfiguration);
Floor secondFloor = new SecondFloor(secondfloorConfiguration);
```

2. A one of the floors is on reconstruction.

3. Implement elevator;

4. The elevator can be called only from the first floor;  From 1 to somewhere; No need to go back; It is for simplicity;

5. The list of available floors should be printed. It can be done with the method or so;

a. the example of the list:

```
    4
    3
    
    1
```

6. when guest  ask system to go to the floor which is under construction it should go nowhere;

7. when guest ask system got 4th floor the trace of passed floors should be printed:  1, 2, 3, 4 or 2,3,4;
