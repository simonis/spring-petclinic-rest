package org.springframework.samples.petclinic.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CommonsRequestLoggingFilter;

//
// Have to set the following system property in order to enable this log:
// -Dlogging.level.org.springframework.web.filter.CommonsRequestLoggingFilter=DEBUG
//

@Configuration
public class MyRequestLoggingFilterConfig {

  @Bean
  public CommonsRequestLoggingFilter logFilter() {
    CommonsRequestLoggingFilter filter = new CommonsRequestLoggingFilter();
    filter.setIncludeQueryString(true);
    filter.setIncludePayload(true);
    filter.setMaxPayloadLength(10000);
    filter.setIncludeHeaders(true);
    //filter.setAfterMessagePrefix("REQUEST DATA : ");
    //filter.setHeaderPredicate(header -> !header.equalsIgnoreCase("authorization"));
    return filter;
  }
}
