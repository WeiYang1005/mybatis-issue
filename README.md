# mybatis-issue

#### Summary:

    Hello, 
    
    Mybatis developers, I found you use distinct in class (`Jdbc3KeyGenerator.java`) to adjust whether the input params' count , 
    but it will thorw a NullPointerException when we use the hashcode of id(is null before insert to database)  as the identifier of the object . 

    In the early edition of mybatis(like 3.4.6), this  caused no exception, but after we upgrade the edition to mybatis 3.5.1, this exception occurs. 
    Please fix it in the future!

    Here is a demo to reproduce.

    Thank you!


<hr>

  ####  The Usage of this test demo:

```
    maven compile -> run mybatis-issue/src/test/java/test/.java
```
