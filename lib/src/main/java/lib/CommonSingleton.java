

@Singleton
public class CommonSingleton {

  public CommonSingleton(
    @Value("${lib.testValue}") String value
  ) {
    System.out.println(value);
  }
}
