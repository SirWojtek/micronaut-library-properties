package lib;

import io.micronaut.context.annotation.Value;
import javax.inject.Singleton;

@Singleton
public class CommonSingleton {

  public CommonSingleton(
    @Value("${lib.testProperty}") String value
  ) {
    System.out.println(value);
  }
}
