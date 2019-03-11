package lib;

import io.micronaut.context.annotation.Value;
import javax.inject.Singleton;

@Singleton
public class CommonSingleton {

  public CommonSingleton(
    @Value("${lib.testValue}") String value
  ) {
    System.out.println(value);
  }
}
