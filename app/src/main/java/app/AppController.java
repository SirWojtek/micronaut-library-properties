package app;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import javax.inject.Inject;

import lib.CommonSingleton;

@Controller("/app")
public class AppController {

  @Inject
  private CommonSingleton commonSingleton;

  @Get(produces = MediaType.TEXT_PLAIN)
  public String index() {
    return "Hello World";
  }
}
