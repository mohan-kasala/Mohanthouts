class Example
{
      public static void main(String... args)
      {
             methodone();
             methodone(100);
      }
      public static void methodone(int...i)
      {
             System.out.println("var-arg method");
      }
}